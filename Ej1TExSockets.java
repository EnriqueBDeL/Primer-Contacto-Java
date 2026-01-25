Ejercicio 1:

El siguiente código implementa un cliente y un servidor. El servidor arranca correctamente, el cliente conecta, 
pero el programa se queda "congelado" (bloqueado) indefinidamente y nunca imprime "Mensaje recibido". ¿Dónde 
está el error y por qué ocurre?



Código Servidor:

ServerSocket server = new ServerSocket(5000);
Socket sc = server.accept();
BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
String mensaje = br.readLine(); // El servidor espera leer una línea
System.out.println("Mensaje recibido: " + mensaje);

|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

Código Cliente:


Socket sc = new Socket("localhost", 5000);
PrintWriter pw = new PrintWriter(sc.getOutputStream());
pw.print("Hola Servidor"); // El cliente envía el mensaje
pw.flush();

---------------------------------------------------------------------------------------------------------------|

SOLUCIÓN:


El error está en el Cliente.

Causa: El servidor usa br.readLine(). Este método lee caracteres hasta encontrar un salto de línea (\n).

El cliente usa pw.print("Hola Servidor"). Esto envía el texto SIN el salto de línea al final.

Resultado: El servidor recibe "Hola Servidor" y se queda esperando eternamente a que llegue el \n para terminar de leer la línea. Nunca avanza.


Corrección: Cambiar pw.print(...) por pw.println(...) en el cliente.

pw.println("Hola Servidor");

o

pw.print("Hola Servidor\n");


