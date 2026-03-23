package edu.ucam.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.util.Hashtable;

import edu.ucam.domain.Heroe;


@WebListener
public class InicializarComisionListener implements ServletContextListener {


    public InicializarComisionListener() {

    }

    
    public void contextInitialized(ServletContextEvent sce)  { 

    	Hashtable<String,Heroe> lista = new Hashtable<String,Heroe>();
    	
    	lista.put("All Might", new Heroe("All Might","One for All", 1));
    	lista.put("Endeavor", new Heroe("Endeavor","Llameante", 2));

    	sce.getServletContext().setAttribute("REGISTRO_HEROES", lista);
    	
    }

    
    public void contextDestroyed(ServletContextEvent sce)  { 

    }
	
}
