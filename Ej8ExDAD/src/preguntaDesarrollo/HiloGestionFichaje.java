package preguntaDesarrollo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.Hashtable;

public class HiloGestionFichaje extends Thread {

    private Socket socket;

    private static Hashtable<String, Empleado> listaEmpleados = new Hashtable<>();

    public HiloGestionFichaje(Socket socket) {
        this.socket = socket;
    }

    
    
    @Override
    public void run() {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(" ");
                String comando = partes[0];

                switch (comando) {

                    case "ALTAEMPLEADO":

                        if (partes.length < 3) {
                            pw.println("Error. Faltan datos (ALTAEMPLEADO id nombreCompleto)");
                            break;
                        }

                        String idEmpleado = partes[1];
                        String nombreCompleto = linea.substring(
                                linea.indexOf(idEmpleado) + idEmpleado.length() + 1
                        );

                        if (listaEmpleados.containsKey(idEmpleado)) {
                            pw.println("Error. El empleado ya existe.");
                        } else {
                            Empleado emp = new Empleado(idEmpleado, nombreCompleto);
                            listaEmpleados.put(idEmpleado, emp);
                            pw.println("Ok. Empleado insertado");
                        }

                        break;

                    //-----------------------------------------------------|

                    case "ENTRADA":

                        if (partes.length < 2) {
                            pw.println("Error. Faltan datos (ENTRADA id)");
                            break;
                        }

                        String id = partes[1];
                        Empleado emp = listaEmpleados.get(id);

                        if (emp == null) {
                            pw.println("Error. El empleado no existe");
                        } else if (emp.getHoraEntrada() != null) {
                            pw.println("Error. El empleado ya ha registrado la entrada");
                        } else {
                            Timestamp ahora = GestionFechas.getHoraActual();
                            emp.setHoraEntrada(ahora);
                            pw.println("Ok. Entrada registrada. " + GestionFechas.getTexto(ahora));
                        }

                        break;

                    //-----------------------------------------------------|

                    case "SALIDA":

                        if (partes.length < 2) {
                            pw.println("Error. Faltan datos (SALIDA id)");
                            break;
                        }

                        String ids = partes[1];
                        Empleado emp2 = listaEmpleados.get(ids);

                        if (emp2 == null) {
                            pw.println("Error. El empleado no existe");
                        } else if (emp2.getHoraEntrada() == null) {
                            pw.println("Error. El empleado no tiene registrada entrada");
                        } else {
                            Timestamp horaSalida = GestionFechas.getHoraActual();
                            float horasSesion = GestionFechas.getHorasEntre(
                                    emp2.getHoraEntrada(), horaSalida
                            );

                            emp2.sumarHoras(horasSesion);
                            emp2.setHoraEntrada(null);

                            pw.println("Ok. Salida registrada. " + GestionFechas.getTexto(horaSalida));
                        }

                        break;

                    //-----------------------------------------------------|

                    case "HORAS":

                        if (partes.length < 2) {
                            pw.println("Error. Faltan datos (HORAS id)");
                            break;
                        }

                        String idh = partes[1];
                        Empleado emp3 = listaEmpleados.get(idh);

                        if (emp3 == null) {
                            pw.println("Error. El empleado no existe");
                        } else {
                            pw.println("Ok. " + emp3.getNombre() +
                                    " tiene trabajadas " + emp3.getHorasAcumuladas() + " horas.");
                        }

                        break;

                    //-----------------------------------------------------|

                    case "ESTADO":

                        if (partes.length < 2) {
                            pw.println("Error. Faltan datos (ESTADO id)");
                            break;
                        }

                        String ide = partes[1];
                        Empleado emp4 = listaEmpleados.get(ide);

                        if (emp4 == null) {
                            pw.println("Error. El empleado no existe");
                        } else if (emp4.getHoraEntrada() != null) {
                            pw.println("El empleado ha registrado entrada: " +
                                    GestionFechas.getTexto(emp4.getHoraEntrada()));
                        } else {
                            pw.println("El empleado no ha registrado entrada");
                        }

                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
