package edu.ucam.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Autobus;

@WebServlet("/ServletCambiarEstado")
public class ServletCambiarEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletCambiarEstado() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String matricula = request.getParameter("MATRICULA");
		
		Hashtable<String,Autobus> flota = (Hashtable<String,Autobus>)request.getServletContext().getAttribute("FLOTA");
		
		Autobus bus = flota.get(matricula);
		
		if(bus != null) {
			
			bus.setEnRuta(!bus.isEnRuta());	
			
			System.out.println("Estado de ruta actualizado.");

			
		}else {
			
			System.out.println("No existe ese autobus en la flota.");

		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
