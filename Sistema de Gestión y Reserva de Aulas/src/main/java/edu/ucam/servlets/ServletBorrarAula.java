package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Aula;


@WebServlet("/servletBorrarAula")
public class ServletBorrarAula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ServletBorrarAula() {
        super();
    }

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("ID");
		
		Hashtable<String,Aula> aulas = (Hashtable<String,Aula>)request.getServletContext().getAttribute("AULAS");
	
		if(aulas.containsKey(id)) {
		aulas.remove(id);
		System.out.println("Aula eliminada.");
		}else {
			System.out.println("No se pudo eliminar.");
		}
		
		request.getRequestDispatcher("index.jsp").forward(request,response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
