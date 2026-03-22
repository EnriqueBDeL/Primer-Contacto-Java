package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Jugador;


@WebServlet("/ServletAltaJugador")
public class ServletAltaJugador extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
  
    public ServletAltaJugador() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nickname = request.getParameter("NICKNAME");
		String nivel = request.getParameter("NIVEL");
		String gremio = request.getParameter("GREMIO");
		
		Hashtable<String,Jugador> registro = (Hashtable<String,Jugador>)request.getServletContext().getAttribute("JUGADORES");
		
		if(!registro.containsKey(nickname)) {
			registro.put(nickname, new Jugador(nickname,Integer.parseInt(nivel),gremio));
			System.out.println("Jugador creado.");
		}else {
			System.out.println("El jugador ya existe.");
		}
		
		request.getRequestDispatcher("index.jsp").forward(request,response);
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
