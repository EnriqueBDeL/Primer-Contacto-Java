
package ejercicio3.Enunciado;

/**
 * Ejercicio 1. (10 puntos)
    
    Una empresa gestiona una flota de aeronaves. Estas pueden ser aviones comerciales, drones o helicópteros. Cada aeronave tiene un número de registro (único), una marca, y una velocidad máxima.

    Además:

        Los aviones comerciales tienen un número de pasajeros.

        Los drones pueden tener o no cámara, y una autonomía en minutos.

        Los helicópteros pueden ser privados o de emergencia.

        Cada aeronave puede despegar y aterrizar, y esos métodos reciben una velocidad.
        Si al despegar una aeronave supera los 500 km/h, debe lanzarse una excepción VelocidadExcesivaException.

    También debe implementarse una interfaz Volador que contenga los métodos despegar(double velocidad) y aterrizar(double velocidad).

    Se pide:
        a) (3 puntos) Implementa las clases necesarias con sus atributos, constructores, getters y setters. Usa herencia donde corresponda.

        b) (2 puntos) Implementa la interfaz Volador en las clases que vuelan y define los métodos según corresponda.

        c) (2 puntos) Crea la excepción VelocidadExcesivaException y haz que se lance si se intenta despegar con una velocidad mayor a 500 km/h.

        d) (1.5 puntos) Crea una clase Hangar que almacene una colección de aeronaves, indexadas por su número de registro. Debe permitir añadir aeronaves y buscarlas por registro.

        e) (1 punto) En el método main, crea al menos una aeronave de cada tipo, añádela al hangar y simula un despegue y aterrizaje de cada una.

        f) (0.5 puntos) Muestra en consola la lista de aeronaves del hangar, mostrando el número de registro, tipo y marca (por ejemplo: ABC123 - Drone - DJI).
 */