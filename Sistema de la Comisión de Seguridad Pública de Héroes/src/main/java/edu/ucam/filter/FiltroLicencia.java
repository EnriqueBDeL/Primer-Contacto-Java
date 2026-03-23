package edu.ucam.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebFilter("/ServletAltaHeroe")
public class FiltroLicencia extends HttpFilter implements Filter {
       
  
    public FiltroLicencia() {
        super();

    }


	public void destroy() {

	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;		
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession sesion = req.getSession();
		
		if (sesion.getAttribute("AGENCIA_LOGEADA") != null) {
			System.out.println("Filtro: Acceso permitido. Agencia verificada.");
			chain.doFilter(request, response);
		}else {
			System.out.println("Filtro: Acceso bloqueado. No hay agencia logeada.");
            res.sendRedirect("error_seguridad.jsp");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
