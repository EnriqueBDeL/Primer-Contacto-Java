<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="spotifyTags" prefix="sf"%>   
    
    
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>



<body>

<form action="ServletAñadirCancion" method="POST" >
Id: <input type="text" name="ID"><br>
    Título: <input type="text" name="TITULO"><br>
    Artista: <input type="text" name="ARTISTA"><br>
    Reproducciones: <input type="number" name="REPRO"><br>
    <input type="submit" value="Añadir Canción">
</form>


<sf:listar/>


</body>




</html>