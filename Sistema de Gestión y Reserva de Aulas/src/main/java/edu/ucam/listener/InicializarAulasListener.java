package edu.ucam.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.util.Hashtable;
import edu.ucam.domain.Aula;


@WebListener
public class InicializarAulasListener implements ServletContextListener {

    
    public InicializarAulasListener() {
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	System.out.println("Inicializamos listener...");
    	
    	Hashtable<String,Aula> aulas = new Hashtable<String,Aula>();
    	
    	Aula a1 = new Aula("1","API7",70,true);
    	Aula a2 = new Aula("2","API1",80,false);
    	
    	aulas.put("1", a1);
    	aulas.put("2", a2);
    	
    	sce.getServletContext().setAttribute("AULAS", aulas);
    	
    	
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
    }
	
}
