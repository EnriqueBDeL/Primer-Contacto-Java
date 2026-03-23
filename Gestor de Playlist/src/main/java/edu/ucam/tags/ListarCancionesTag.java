package edu.ucam.tags;


import java.util.Hashtable;

import edu.ucam.domain.Cancion;
import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;
import java.util.Hashtable;

public class ListarCancionesTag extends BodyTagSupport {
	
	
    private static final long serialVersionUID = 1L;

    @Override
    public int doStartTag() throws JspException {

    	try {
    	
    	Hashtable<String,Cancion> lista = (Hashtable<String,Cancion>)pageContext.getRequest().getServletContext().getAttribute("PLAYLIST");
    	
    	if(lista != null && !lista.isEmpty()) {
    		
    		for(Cancion c : lista.values()) {
    			
    			pageContext.getOut().print("ID: " + c.getId() + " | Título: " + c.getTitulo() + " | Artista: " + c.getArtista() + " | Reproducciones: " + c.getReproducciones());    			
    			
    			pageContext.getOut().print("<a href=\"ServletBorrarCancion?ID="+c.getId()+"\">Borrar</a>");
    			
    			if(c.isFavorita()) {
    			    pageContext.getOut().print(" | <a href=\"ServletAlternarFavorito?ID=" + c.getId() + "\">Quitar Favorita 💔</a>");
    			} else {
    			    pageContext.getOut().print(" | <a href=\"ServletAlternarFavorito?ID=" + c.getId() + "\">Marcar Favorita ❤️</a>");
    			}
    			pageContext.getOut().print("<br>");
    		}
    		
    		
    	}
    	
    	}catch(IOException e){
    		
    	}
    	
    	return SKIP_BODY;
    }

    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}