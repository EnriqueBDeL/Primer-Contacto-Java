<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="edu.ucam.domain.Jugador"%>
<%@page import="java.util.Hashtable"%>  
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
<h2>Introduzca jugador:</h2>
<form action="ServletAltaJugador" method="POST">
Nickname:<input type="text" name="NICKNAME"><br>
Nivel:<input type="text" name="NIVEL"><br>
Gremio:<input type="text" name="GREMIO"><br>
<input type="submit">
</form>
<br>
<br>
<h2>Lista de jugadores:</h2>
<% 

Hashtable<String,Jugador> registro = (Hashtable<String,Jugador>)request.getServletContext().getAttribute("JUGADORES");

if(registro != null && !registro.isEmpty()){
	
	for(Jugador j : registro.values()){
		
		out.println("<br>" + j .getNickname() + " - " + j .getNivel() + " - Gremio: " + j .getGremio());
		
		%>
		
		<a href="ServletBorrarJugador?NICKNAME=<%= j.getNickname() %>">Borrar</a>	
	<%
			
			if(j.isVivo()){
				%>
				
				<a href="ServletCambiarEstado?NICKNAME=<%= j.getNickname() %>">Matar</a>			
				
				<%
				
			}else{
				%>
				
				<a href="ServletCambiarEstado?NICKNAME=<%= j.getNickname() %>">Resucitar</a>			
	
		
<% 	
				}
	}
	
}else{
	out.print("<br><b>No hay jugadores registrados en Aincrad en este momento.</b>");
	
}
%>

</body>



</html>