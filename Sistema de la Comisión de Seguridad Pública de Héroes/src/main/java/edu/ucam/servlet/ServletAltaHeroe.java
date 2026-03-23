package edu.ucam.servlet;

import jakarta.servlet.ServletException;
import java.util.Hashtable;

import edu.ucam.domain.Heroe;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/ServletAltaHeroe")
public class ServletAltaHeroe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletAltaHeroe() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String alias = request.getParameter("ALIAS");
		String don = request.getParameter("DON");
		String ranking = request.getParameter("RANKING");
	
		Hashtable<String,Heroe> lista = (Hashtable<String,Heroe>)request.getServletContext().getAttribute("REGISTRO_HEROES");
		
		if(!lista.containsKey(alias)) {
			lista.put(alias, new Heroe(alias,don,Integer.parseInt(ranking)));
			System.out.println("Heore creado.");
		}else {
			System.out.println("El heroe ya existe.");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
