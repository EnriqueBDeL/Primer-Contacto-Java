<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@taglib uri="milibreriatags" prefix="dad2" %>  
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Sistema de Gestión y Reserva de Aulas</title>
</head>



<body>

<h2>Añade un aula:</h2>

<form action="servletAltaAula" method ="POST">
ID:<input type="text" name="ID"><br>
Nombre:<input type="text" name="NOMBRE"><br>
Capacidad:<input type="text" name="CAPACIDAD"><br>
Tiene proyector (true/false):<input type="text" name="TIENE_PROYECTOR"><br>
<input type="submit"><br>
</form>

<br>

<h2>Lista de aulas:</h2>

<dad2:listar/>

</body>



</html>