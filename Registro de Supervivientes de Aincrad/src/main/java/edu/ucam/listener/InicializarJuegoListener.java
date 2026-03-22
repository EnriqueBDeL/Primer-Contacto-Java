package edu.ucam.listener;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.util.Hashtable;
import edu.ucam.domain.Jugador;

@WebListener
public class InicializarJuegoListener implements ServletContextListener {

   
    public InicializarJuegoListener() {
    	
    	
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	System.out.println("Listener encendido.");
    	
    	Hashtable<String,Jugador> registro = new Hashtable<String,Jugador>();
    	
    	registro.put("Kirito", new Jugador("Kirito",70,"Gatos Negros Iluminados por la Luna"));
    	
    	registro.put("Asuna", new Jugador("Asuna",50,"Caballeros de la Hermandad de Sangre"));

    	
    	sce.getServletContext().setAttribute("JUGADORES", registro);
    	
    }


    public void contextDestroyed(ServletContextEvent sce)  { 

    }
	
}
