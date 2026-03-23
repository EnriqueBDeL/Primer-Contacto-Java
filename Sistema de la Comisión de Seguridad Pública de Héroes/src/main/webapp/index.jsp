<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ page import="java.util.Hashtable" %>
   
	<%@ page import="edu.ucam.domain.Heroe" %>
    
<!DOCTYPE html>
<html>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>



<body>

<h2>1. Iniciar Sesión (Agencia)</h2>
  
    <form action="ServletLogin" method="POST">
        Nombre de la Agencia: <input type="text" name="AGENCIA"><br>
        <input type="submit" value="Entrar">
    </form>
    

<h2>2. Registrar Nuevo Héroe</h2>

<form action="ServletAltaHeroe" method="POST">
        Alias: <input type="text" name="ALIAS"><br>
        Don: <input type="text" name="DON"><br>
        Ranking: <input type="number" name="RANKING"><br>
        <input type="submit" value="Registrar Héroe">
    </form>



<h2>Héroes Registrados Oficialmente:</h2>
    
    <%
        Hashtable<String, Heroe> registro = (Hashtable<String, Heroe>) request.getServletContext().getAttribute("REGISTRO_HEROES");
        
        if (registro != null && !registro.isEmpty()) {
            
            out.println("<ul>");
            
           
            for (Heroe h : registro.values()) {
                out.print("<li>");
                out.print("<strong>" + h.getAlias() + "</strong> ");
                out.print("- Don: " + h.getDon() + " ");
                out.print("- Ranking: Nº " + h.getRanking());
                out.println("</li>");
            }
            
            out.println("</ul>"); 
            
        } else {
            out.println("<p>No hay héroes profesionales registrados en este momento.</p>");
        }
    %>


</body>



</html>