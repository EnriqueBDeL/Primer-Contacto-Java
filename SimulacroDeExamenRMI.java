/*

Simulacro de Examen RMI - Ejercicio Práctico


Enunciado:

Se desea implementar el módulo servidor de un Sistema de Subastas Online utilizando Java RMI.

El sistema debe permitir a los usuarios pujar por productos y consultar quién va ganando la subasta. Se le proporciona la descripción de las clases e interfaces que YA ESTÁN IMPLEMENTADAS en el paquete edu.ucam.comun (no debe copiarlas, solo usarlas).



Clase Producto (Ya existente):

Es una clase serializable (implements Serializable).

Atributos:

- String id (Código del producto).

- String nombre (Nombre del artículo).

- double precioActual (La puja más alta hasta el momento).

- String ganadorActual (Nombre del usuario que ha hecho la puja más alta).

Dispone de constructor y métodos getters/setters para todos los atributos.




Interfaz Remota ISubasta (Ya existente):

Define los métodos que el servidor ofrece a los clientes. Todos lanzan RemoteException.

registrarProducto(String id, String nombre, double precioSalida): Añade un producto nuevo al sistema. Devuelve true si se registra, o false si el ID ya existía.

pujar(String idProducto, String usuario, double cantidad): Intenta realizar una puja.

	Si el producto no existe, lanza excepción.

	Si la cantidad es menor o igual al precioActual, lanza una excepción indicando que la puja es insuficiente.

	Si es válida, actualiza el precioActual y el ganadorActual. Devuelve el nuevo precio.

consultarProducto(String id): Devuelve el objeto Producto completo. Retorna null si no existe.






Tarea:

Escriba en el recuadro únicamente el código de la clase SubastaImp.java perteneciente al paquete edu.ucam.servidor.

Requisitos obligatorios:

- La clase debe heredar de la clase necesaria de RMI para ser exportada automáticamente.

- Debe implementar la interfaz ISubasta.

- Debe utilizar una Hashtable<String, Producto> para almacenar los datos en memoria.

- Debe gestionar correctamente la concurrencia (evitar que dos usuarios pujen a la vez por el mismo producto y se pierda una puja).

- Implemente la lógica completa de los 3 métodos descritos.

*/

//------------------------------------------------------------------------------------------------------------------------------------------|

//SOLUCIÓN:



//Librerías…


public class SubastaImp extends UnicastRemoteObject implements ISubasta {

    private static final long serialVersionUID = 1L;
    private Hashtable<String, Producto> almacenamiento = new Hashtable<>();

    // 1. Constructor
    public SubastaImp() throws RemoteException {
        super();
    }

    // 2. Método Registrar
    @Override
    public synchronized boolean registrarProducto(String id, String nombre, double precioSalida) throws RemoteException {
        if (!almacenamiento.containsKey(id)) {
            Producto p = new Producto(id, nombre, precioSalida, null);
            almacenamiento.put(id, p);
            return true;
        } else {
            return false;
        }
    }

    // 3. Método Pujar
    @Override
    public synchronized double pujar(String idProducto, String usuario, double cantidad) throws RemoteException {
        if (!almacenamiento.containsKey(idProducto)) {
            throw new RemoteException("Error: El producto no existe.");
        }

        Producto p = almacenamiento.get(idProducto);

        if (cantidad <= p.getPrecioActual()) {
            throw new RemoteException("Error: La puja debe superar los " + p.getPrecioActual());
        }

        p.setPrecioActual(cantidad);
        p.setGanadorActual(usuario);
        almacenamiento.put(idProducto, p); // Opcional pero recomendado

        return p.getPrecioActual();
    }

    // 4. Método Consultar
    @Override
    public synchronized Producto consultarProducto(String id) throws RemoteException {
        if (almacenamiento.containsKey(id)) {
            return almacenamiento.get(id);
        } else {
            return null;
        }
    }
}



