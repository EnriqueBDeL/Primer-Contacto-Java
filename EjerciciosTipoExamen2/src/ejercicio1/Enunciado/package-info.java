
package ejercicio1.Enunciado;


/**
 * 

Ejercicio 1: Laboratorio de análisis de muestras (10 puntos)

En un laboratorio se analizan distintos tipos de muestras: sangre, orina y tejido. 

Cada muestra tiene:

    Un código único (String)

    Un tipo (sangre, orina, tejido)

    Un nivel de riesgo (double, de 0 a 1)

    Si es urgente o no (boolean)

Además:

    Las muestras de sangre tienen el grupo sanguíneo (A, B, AB, O).

    Las de orina indican si tienen infección bacteriana (boolean).

    Las de tejido indican la zona del cuerpo (ej. "piel", "hígado").

    También hay un método analizar(double intensidad) que lanza una excepción RiesgoExcesivoException si nivelRiesgo * intensidad > 0.8.

Se pide:
    a) (3 puntos) Diseña la jerarquía de clases para modelar las muestras, usando herencia e interfaces si es necesario. Implementa también el método analizar.

    b) (2 puntos) Crea la excepción RiesgoExcesivoException.

    c) (2 puntos) Crea una interfaz Procesable con el método procesar(), e implementa esta interfaz en las muestras.

    d) (2 puntos) Implementa una clase Almacen con un método almacenar(Muestra muestra) y recuperar(String codigo). Usa un Map.

    e) (1 punto) En el método main, guarda una muestra de cada tipo y llama a procesar() sobre ellas, manejando la excepción si ocurre.

 */