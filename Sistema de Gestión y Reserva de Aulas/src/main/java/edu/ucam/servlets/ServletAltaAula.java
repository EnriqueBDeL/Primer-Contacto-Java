package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Aula;

@WebServlet("/servletAltaAula")
public class ServletAltaAula extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
    public ServletAltaAula() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("ID");
		String nombre = request.getParameter("NOMBRE");
		String capacidad = request.getParameter("CAPACIDAD");
		String tieneProyector = request.getParameter("TIENE_PROYECTOR");
		
		
		Hashtable<String,Aula> aulas = (Hashtable<String,Aula>)request.getServletContext().getAttribute("AULAS");

		Aula aula = aulas.get(id);
		
	
		if(aula == null) {
			
			Aula a = new Aula(id,nombre,Integer.parseInt(capacidad),Boolean.parseBoolean(tieneProyector));
			
			aulas.put(id, a);
			
			System.out.println("Aula creada.");
			
			
		}else {
			System.out.println("El aula ya existe.");	
		}
		
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
