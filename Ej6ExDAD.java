CODIGO:

public class HiloContador implements Runnable {
    private int contador = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador++;
            System.out.println("Contador: " + contador);
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        HiloContador hc = new HiloContador();
        
        for (int i = 0; i < 5; i++) {
            new Thread(hc).start();
        }
    }
}


||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


¿Por qué el valor mostrado del contador no es 5000, sino un número menor y variable en cada ejecución?


||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

RESPUESTA:

El problema se debe a una Condición de Carrera (Race Condition) provocada porque la operación de incremento no es atómica y falta sincronización.

Habría que añadir la palabra clave synchronized al bloque de código que modifica la variable o usar una clase atómica (como AtomicInteger), para asegurar que solo un hilo pueda tocar la variable a la vez.
