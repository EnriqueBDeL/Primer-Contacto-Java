package edu.ucam.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;
import java.util.Hashtable;
import edu.ucam.domain.Aula;


public class ListarAulasTag extends BodyTagSupport {

	
	private static final long serialVersionUID = 1L;
	
	
	
	@Override
	public int doStartTag() throws JspException 
	{
		
		try {
			
			Hashtable<String,Aula> aulas = (Hashtable<String,Aula> ) pageContext.getRequest().getServletContext().getAttribute("AULAS");
			
			if(aulas != null) {
				
				for(Aula aula : aulas.values()) {
				
				pageContext.getOut().println(aula.getId()+" "+aula.getNombre()+" "+aula.getCapacidad());
				pageContext.getOut().println(" <a href=\"servletBorrarAula?ID=" + aula.getId() + "\">Borrar</a>" );
				
				
	
				if(aula.isReservada())
				{
					pageContext.getOut().println(" <a href=\"servletAlternarReserva?ID=" + aula.getId() + "\">Liberar</a>" );
				}
				else
				{
					pageContext.getOut().println(" <a href=\"servletAlternarReserva?ID=" + aula.getId() + "\">Reservar</a>" );
				}
		
				pageContext.getOut().println("<br>");
			}
		}else{
			
			pageContext.getOut().println("<b>lista vacia</b>");
			
		}		
			
		}catch(IOException e) {
			e.printStackTrace();
		}
    	
	    return SKIP_BODY;
	

	}
	
	
	
	public int doEndTag() throws JspException {
	    return EVAL_PAGE;
	}

}
