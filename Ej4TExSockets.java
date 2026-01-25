Ejercicio 4:


Observa este fragmento de código donde un servidor intenta enviar dos mensajes separados. 
Al ejecutarlo, salta una excepción SocketException: Socket is closed en la segunda escritura. ¿Por qué?


Socket sc = server.accept();

// Enviar primer mensaje
PrintWriter pw1 = new PrintWriter(sc.getOutputStream());
pw1.println("Mensaje 1");
pw1.close(); // Cerramos el flujo tras enviar

// Enviar segundo mensaje
PrintWriter pw2 = new PrintWriter(sc.getOutputStream()); // ERROR AQUÍ
pw2.println("Mensaje 2");

---------------------------------------------------------------------------------------------------------------|

SOLUCIÓN:

Cuando cierras el flujo de entrada o salida de un socket (InputStream o OutputStream), Java cierra automáticamente el Socket completo.

Al hacer pw1.close(), se cierra la conexión con el cliente.

Cuando intentas crear pw2 o escribir de nuevo, el socket ya no existe.

Usa pw1.flush() para asegurar que se envían los datos, pero solo usa close() cuando hayas terminado totalmente con ese cliente.