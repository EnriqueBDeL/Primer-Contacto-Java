Ejercicio 2: 


Analiza el siguiente código de un servidor que pretende atender a múltiples clientes a la vez. 
¿Funcionará concurrentemente? Es decir, ¿si el Cliente 1 tarda 10 segundos en enviar datos, el Cliente 2 puede 
conectarse mientras tanto? Justifica tu respuesta.

ServerSocket server = new ServerSocket(8888);
while (true) {
    Socket socket = server.accept();
    // Procesamos la petición del cliente
    InputStream is = socket.getInputStream();
    int data = is.read(); 
    // ... imaginamos un proceso largo que tarda 10 segundos ...
    socket.close();
}

---------------------------------------------------------------------------------------------------------------|

SOLUCIÓN:


 El código acepta una conexión (server.accept()) y se pone a procesarla inmediatamente en el hilo principal (main).

El bucle while no puede volver a ejecutar server.accept() hasta que termine de procesar al cliente actual y cierre su socket.

Los clientes se atienden en "fila india" (secuencialmente). Si uno tarda, los demás esperan.


Para que sea concurrente, después de accept(), se debe lanzar un Nuevo Hilo (Thread) que maneje ese socket, liberando al main para volver a escuchar.

