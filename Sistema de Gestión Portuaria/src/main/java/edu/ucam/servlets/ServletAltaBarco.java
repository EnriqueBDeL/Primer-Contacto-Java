package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Barco;


@WebServlet("/ServletAltaBarco")
public class ServletAltaBarco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ServletAltaBarco() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String matricula = request.getParameter("MATRICULA");
	String nombre = request.getParameter("NOMBRE");
	String eslora = request.getParameter("ESLORA");
	
	Hashtable<String,Barco> puerto = (Hashtable<String,Barco>)request.getServletContext().getAttribute("REGISTRO_PUERTO");
	
	if(!puerto.containsKey(matricula)) {
		
		puerto.put(matricula, new Barco(matricula,nombre,Integer.parseInt(eslora)));
		
		System.out.println(nombre + " registrado.");
		
	}else {
		System.out.println("Ya existe.");
	}
	
	request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
