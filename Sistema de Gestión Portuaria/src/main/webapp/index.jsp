<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="mistags" prefix="dad2" %>
    
<!DOCTYPE html>
<html>



<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>

<form action="ServletAltaBarco" method="POST">
Matricula:<input type="text" name="MATRICULA"><br>
Nombre:<input type="text" name="NOMBRE"><br>
Eslora:<input type="text" name="ESLORA"><br>
<input type="submit">
</form>

<br>

<dad2:listar/>


</body>



</html>