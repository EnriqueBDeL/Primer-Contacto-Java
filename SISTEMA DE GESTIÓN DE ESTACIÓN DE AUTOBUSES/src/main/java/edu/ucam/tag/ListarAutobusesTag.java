package edu.ucam.tag;
import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;
import java.util.Hashtable;
import edu.ucam.domain.Autobus;

public class ListarAutobusesTag extends BodyTagSupport {
    
	
	private static final long serialVersionUID = 1L;

    
    
    @Override
    public int doStartTag() throws JspException {
    	
    	try {
    		
    		Hashtable<String,Autobus> flota = (Hashtable<String,Autobus>)pageContext.getRequest().getServletContext().getAttribute("FLOTA");
    		
    		if (flota != null && !flota.isEmpty()) {
    			
    			for(Autobus bus : flota.values()) {
    				
    				pageContext.getOut().println(bus.getMatricula() + " | " + bus.getDestino() + " | " +bus.getPlazas() );
    				
    				pageContext.getOut().println("<a href =\"ServletBorrarAutobus?MATRICULA=" + bus.getMatricula() + "\">Borrar</a>" );
    				
    				if(bus.isEnRuta()) {
    					
    					pageContext.getOut().println("<a href =\"ServletCambiarEstado?MATRICULA=" + bus.getMatricula() + "\">Aparcar en estación</a>");
    					
    				}else {
    					
    					pageContext.getOut().println("<a href =\"ServletCambiarEstado?MATRICULA=" + bus.getMatricula() + "\">Poner en ruta</a>");
    					
    				}
    				
    				
    				pageContext.getOut().println("<br>");
    				
    			}
    			
    		}else {
    			
        		pageContext.getOut().println("Flota vacia.");

    		}
    		
    	}catch(IOException e){
			e.printStackTrace(); 		
    	}
    	
        return SKIP_BODY;
    }
    

    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}

