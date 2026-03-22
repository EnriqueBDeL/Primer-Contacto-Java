package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;

import edu.ucam.domain.Jugador;


@WebServlet("/ServletCambiarEstado")
public class ServletCambiarEstado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletCambiarEstado() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nickname = request.getParameter("NICKNAME");
		
		Hashtable<String,Jugador> registro = (Hashtable<String,Jugador>)request.getServletContext().getAttribute("JUGADORES");
		
		if(registro.containsKey(nickname)){
		
			 Jugador j = registro.get(nickname);
			 
			 j.setVivo(!j.isVivo());
			 
			 System.out.println("Estado del jugador modificado.");
			 
		}else {
			
			System.out.println("El jugador no existe.");

		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
