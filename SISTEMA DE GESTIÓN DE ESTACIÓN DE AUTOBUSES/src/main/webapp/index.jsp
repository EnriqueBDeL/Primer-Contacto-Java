<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@taglib uri="miflotatags" prefix="flota" %>
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>SISTEMA DE GESTIÓN DE ESTACIÓN DE AUTOBUSES</title>
</head>



<body>


<h2>Registrar nuevo autobús:</h2>


<form action ="ServletAltaAutobus" method="POST">
Matricula: <input type="text" name="MATRICULA"><br>
Destino: <input type="text" name="DESTINO"><br>
Plazas: <input type="text" name="PLAZAS"><br>
<input type="submit"><br>
</form>

<h2>Flota actual:</h2>
    <flota:listar/>
    
    
</body>


</html>