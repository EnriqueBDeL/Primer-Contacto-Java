
package ejercicio2.Enunciado;

/**
    Ejercicio 2: Sistema de limpieza (10 puntos)

    Se quiere desarrollar un sistema para gestionar robots de limpieza en diferentes entornos: hogar, oficina y hospital. Cada robot tiene:

        Un ID

        Un nivel de batería (int)

        Una función limpiar(int minutos) que consume batería (1% por minuto)

        Si la batería baja de 10%, lanza una excepción BateriaBajaException

    Cada tipo de robot tiene un modo distinto de limpieza ("aspirado", "fregado", "desinfección").

    Se pide:
        a) (3 puntos) Modela los robots con herencia y una clase base RobotLimpieza. Implementa el método limpiar.

        b) (2 puntos) Crea la excepción BateriaBajaException.

        c) (2 puntos) Crea una interfaz Recargable con el método recargar(). Todos los robots deben implementarla.

        d) (2 puntos) Implementa una clase CentroLimpieza que pueda almacenar robots y ejecutar una limpieza general (llamando a limpiar(30) en cada uno).

        e) (1 punto) Crea un main donde crees 3 robots (uno de cada tipo), los almacenes y llames a la limpieza general, gestionando las excepciones.

* 
 */