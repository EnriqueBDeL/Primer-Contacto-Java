package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Barco;



@WebServlet("/ServletBorrarBarco")
public class ServletBorrarBarco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletBorrarBarco() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String matricula = request.getParameter("MATRICULA");
		
		Hashtable<String,Barco> puerto = (Hashtable<String,Barco>)request.getServletContext().getAttribute("REGISTRO_PUERTO");

		if(puerto.containsKey(matricula)) {
			puerto.remove(matricula);
			System.out.println("Eliminado correctamente.");
		}else {
			System.out.println("No existe.");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}

}
