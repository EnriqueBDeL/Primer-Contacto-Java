package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Barco;


@WebServlet("/ServletCambiarEstado")
public class ServletCambiarEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletCambiarEstado() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	
		String matricula = request.getParameter("MATRICULA");
		
		Hashtable<String,Barco> puerto = (Hashtable<String,Barco>)request.getServletContext().getAttribute("REGISTRO_PUERTO");

		if(puerto.containsKey(matricula)) {
			
			Barco b = puerto.get(matricula);
			
			b.setEnPuerto(!b.isEnPuerto());
			
			System.out.println("Estado cambiado.");

			
		}else {
			System.out.println("ERROR.");

		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
