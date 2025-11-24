CODIGO:

public class Main {
        
     public static void main(String[] args) {
        
	MiHilo miHilo = new MiHilo();
        
	System.out.println("Lanzamos hilos");
       
	 for(int i = 0; i < 10; i++) {
            // OJO AQUÍ: Se crea un hilo vacío
            (new Thread()).start(); 
        }
        System.out.println("Hecho");
    }
}

public class MiHilo implements Runnable {

    @Override
    public void run() {
        System.out.println("Hola Mundo");
    }
}

||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


¿Cuál es el motivo para que por consola salga lo siguiente y no aparezca el texto 'Hola Mundo' repetido diez veces?


Salida: Lanzamos hilos 
	Hecho


||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

RESPUESTA:

En la linea "(new Thread()).start();".

Al hacer "new Thread()", sin pasarle ningún parámetro se está creando un hilo genérico cuyo método run() por defecto no hace nada (está vacío).

Por tanto, los 10 hilos se inician y terminan inmediatamente sin imprimir nada. Solo el hilo principal (main) imprime "Lanzamos hilos" y "Hecho".

La línea dentro del bucle debería haber sido: new Thread(miHilo).start();
