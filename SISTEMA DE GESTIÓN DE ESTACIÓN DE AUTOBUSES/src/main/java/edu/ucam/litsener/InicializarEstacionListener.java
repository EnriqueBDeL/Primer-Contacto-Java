package edu.ucam.litsener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import edu.ucam.domain.Autobus;
import java.util.Hashtable;



@WebListener
public class InicializarEstacionListener implements ServletContextListener {

    
    public InicializarEstacionListener() {
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	Hashtable<String, Autobus> flota = new Hashtable<String, Autobus>();
    	
    	flota.put("123456A", new Autobus("123456A","Cartagena",80));
    	
    	sce.getServletContext().setAttribute("FLOTA", flota);
    	
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
    }
	
}
