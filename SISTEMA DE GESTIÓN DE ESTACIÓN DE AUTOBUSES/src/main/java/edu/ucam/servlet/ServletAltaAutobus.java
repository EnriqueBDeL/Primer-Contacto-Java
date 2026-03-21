package edu.ucam.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Autobus;



@WebServlet("/ServletAltaAutobus")
public class ServletAltaAutobus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletAltaAutobus() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String matricula = request.getParameter("MATRICULA");
		String destino = request.getParameter("DESTINO");
		String plazas = request.getParameter("PLAZAS");

		Hashtable<String,Autobus> flota = (Hashtable<String,Autobus>)request.getServletContext().getAttribute("FLOTA");
		
		
		if(!flota.containsKey(matricula)) { 
		    Autobus nuevoBus = new Autobus(matricula, destino, Integer.parseInt(plazas));
		    flota.put(matricula, nuevoBus);
		    System.out.println("Nuevo Autobus añadido.");
		} else {
		    System.out.println("El Autobus ya existe.");
		}
	
		request.getRequestDispatcher("index.jsp").forward(request,response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
