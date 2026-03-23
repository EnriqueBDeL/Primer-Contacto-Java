package edu.ucam.listener;

import java.util.Hashtable;

import edu.ucam.domain.Cancion;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class InicializarSpotifyListener
 *
 */
@WebListener
public class InicializarSpotifyListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InicializarSpotifyListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	Hashtable<String, Cancion> lista = new Hashtable<String, Cancion>();
    	
    	lista.put("1",new Cancion("1","Song1","artista1",2345));
    	
    	lista.put("2",new Cancion("2","Song2","artista2",4565));

    	sce.getServletContext().setAttribute("PLAYLIST",lista);
    	
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }
	
}
