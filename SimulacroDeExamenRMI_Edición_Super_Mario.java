/*

Simulacro de Examen RMI - Edición Super Mario




El Reino Champiñón quiere informatizar las votaciones para elegir al "Héroe del Año". Se te encarga implementar la lógica del servidor utilizando Java RMI.


Se te proporciona la descripción de las clases e interfaces que YA ESTÁN IMPLEMENTADAS en el paquete edu.ucam.comun (no debes copiarlas, solo usarlas en tu código).



Clase Personaje (Ya existente):

Es una clase serializable (implements Serializable).

Atributos:

- String id (Ej: "M-01").

- String nombre (Ej: "Mario", "Luigi", "Peach").

- int totalVotos (Contador de votos recibidos).

- String ultimoVotante (Nombre del último Toad que votó por él).

Dispone de constructor y métodos getters/setters para todos los atributos.




Interfaz Remota IVotacion (Ya existente):

Define los métodos remotos. Todos lanzan RemoteException.

registrarCandidato(String id, String nombre): Da de alta un personaje nuevo con 0 votos. Devuelve true si se registra, o false si el ID ya existía.

votar(String idPersonaje, String nombreVotante): Suma 1 voto al personaje.

	Si el personaje no existe, lanza excepción.

	Si existe, incrementa totalVotos y actualiza ultimoVotante.

	Devuelve el nuevo totalVotos (entero).

consultarRanking(String id): Devuelve el objeto Personaje completo. Retorna null si no existe.




Tarea:

Escriba en el recuadro únicamente el código de la clase VotacionImp.java perteneciente al paquete edu.ucam.servidor.

Requisitos obligatorios:

- La clase debe heredar de la clase necesaria para ser exportada en RMI (UnicastRemoteObject).

- Debe implementar la interfaz IVotacion.

- Debe utilizar una Hashtable<String, Personaje> para almacenar los datos en memoria.

- Debe gestionar la concurrencia (evitar que dos Toads voten a la vez y se pierda un voto).

- Implemente el constructor y los 3 métodos.


*/

//------------------------------------------------------------------------------------------------------------------------------------------|

//SOLUCIÓN:


//Librerias...


public class VotacionImp extends UnicastRemoteObject implements IVotacion{


	private static final long serialVersionUID = 1L;

	private Hashtable<String, Personaje> candidatos = new Hashtable<>();



	public VotacionImp () throws RemoteException{
	super();

	}




	@Override
    	public synchronized boolean registrarCandidato(String id, String nombre) throws RemoteException {

        if (!candidatos.containsKey(id)) {

            Personaje p = new Personaje(id, nombre, 0, null);

            candidatos.put(id, p);

            return true;

        } else {

            return false;

        }
    }


	@Override
	public synchronized int votar(String idPersonaje, String nombreVotante) throws RemoteException{

	        if (candidatos.containsKey(idPersonaje)) {

		   Personaje p = candidatos.get(idPersonaje);

			int votos = p.getTotalVotos() + 1 ;

			p.setTotalVotos(votos);

			p.setUltimoVotante(nombreVotante);

		return votos;
			

		}else{

		throw new RemoteException("El personaje no existe.");

		}

	}


	@Override
	public synchronized Personaje consultarRanking(String id) throws RemoteException{

	
	if(candidatos.containsKey(id)){
	
		Personaje p = candidatos.get(id);
	
		return p;

	}else{
		return null;
	}
	

	}







}


