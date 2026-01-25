Ejercicio 3:


Estamos programando un servidor de Chat multihilo. Queremos guardar la lista de todos los sockets conectados en una 
lista global para poder enviar mensajes a todos (Broadcast). El programador ha elegido ArrayList. ¿Es una buena 
elección según tus apuntes? ¿Qué problema podría surgir y qué colección deberías usar en su lugar?

// Variable global en el servidor
public static List<Socket> clientes = new ArrayList<>(); 

// Código dentro de cada hilo de cliente
clientes.add(socketNuevo);

---------------------------------------------------------------------------------------------------------------|

SOLUCIÓN:

NO son sincronizadas (Thread-Safe)

Si dos clientes se conectan exactamente al mismo tiempo (concurrencia), dos hilos intentarán escribir en la lista a la vez. Esto puede corromper la lista, lanzar excepciones o perder datos.