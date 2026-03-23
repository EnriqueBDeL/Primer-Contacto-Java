package edu.ucam.tag;


import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;
import java.util.Hashtable;

import edu.ucam.domain.Barco;

public class ListarBarcosTag extends BodyTagSupport {
    private static final long serialVersionUID = 1L;

    @Override
    public int doStartTag() throws JspException {
    	
    	try {
    		
    	
		Hashtable<String,Barco> puerto = (Hashtable<String,Barco>)pageContext.getRequest().getServletContext().getAttribute("REGISTRO_PUERTO");

		if(puerto != null) {
			
			for(Barco b : puerto.values()) {
				
				pageContext.getOut().print("Matricula: " + b.getMatricula() + " | Nombre: " + b.getNombre() + " | Eslora: " + b.getEslora());
				
				pageContext.getOut().print(" | <a href=\"ServletBorrarBarco?MATRICULA=" + b.getMatricula() + "\">Borrar</a>");

				if (b.isEnPuerto()) {
				    pageContext.getOut().print(" | <a href=\"ServletCambiarEstado?MATRICULA=" + b.getMatricula() + "\">Zarpar</a>");
				} else {
				    pageContext.getOut().print(" | <a href=\"ServletCambiarEstado?MATRICULA=" + b.getMatricula() + "\">Atracar</a>");
				}
				
				pageContext.getOut().print("<br>");
			}	
			
		}else {

			
		}
		
    	}catch(IOException e ) {
    		
    		
    		
    	}
    	
        return SKIP_BODY;
    }

    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}