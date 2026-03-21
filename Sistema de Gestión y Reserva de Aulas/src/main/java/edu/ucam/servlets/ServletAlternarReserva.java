package edu.ucam.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.ucam.domain.Aula;

@WebServlet("/servletAlternarReserva")
public class ServletAlternarReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletAlternarReserva() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("ID");
		
		Hashtable<String,Aula> aulas = (Hashtable<String,Aula>)request.getServletContext().getAttribute("AULAS");
		
		
		if(id != null) {
			
		 Aula aula = aulas.get(id);
		 aula.setReservada(!aula.isReservada());
			System.out.println("Reserva modificada.");
			
		}else {
			
			System.out.println("Aula no disponible.");
			
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
