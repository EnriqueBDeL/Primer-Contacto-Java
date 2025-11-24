CODIGO:

package ucam.examen.daduno;

public class Main {
  
  public static void main(String[] args) {
        MiHilo miHilo = new MiHilo(); // Se crea UNA sola instancia del hilo

        // Lanzamos diez hilos
        for (int i = 0; i < 10; i++) {
            miHilo.start(); // ERROR: Se intenta iniciar el mismo objeto 10 veces
        }
        
        // ... (código de cierre)
        System.out.println("Fin del programa");
    }
}


||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


¿Por qué salta la siguiente excepción: java.lang.IllegalThreadStateException?


||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

RESPUESTA:

La excepción ocurre porque se está intentando iniciar (arrancar) el mismo objeto Hilo más de una vez.

Para corregirlo: Si quieres lanzar 10 hilos idénticos, debes crear una nueva instancia (nuevo objeto) dentro del bucle antes de iniciarlo:


for (int i = 0; i < 10; i++) {
    MiHilo miHilo = new MiHilo(); // Crear uno nuevo cada vez
    miHilo.start();
}
