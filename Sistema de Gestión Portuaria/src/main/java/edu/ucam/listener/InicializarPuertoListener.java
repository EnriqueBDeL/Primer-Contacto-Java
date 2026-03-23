package edu.ucam.listener;

import java.util.Hashtable;

import edu.ucam.domain.Barco;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class InicializarPuertoListener implements ServletContextListener {


    public InicializarPuertoListener() {
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	Hashtable<String,Barco> puerto = new Hashtable<String,Barco>();
    	
    	puerto.put("345234",new Barco("345234","Florte",23));
    	
    	puerto.put("567867",new Barco("567867","Lorence",43));

    	
    	sce.getServletContext().setAttribute("REGISTRO_PUERTO", puerto);
    	
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
    }
	
}
