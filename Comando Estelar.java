=============================================================================
EXAMEN DE PRÁCTICA: ESTACIÓN DEL COMANDO ESTELAR (FILTROS)
=============================================================================

-----------------------------------------------------------------------------
ANEXO: CÓDIGO AUTOGENERADO (PLANTILLAS)
-----------------------------------------------------------------------------
1. Plantilla Servlet
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RutaDelServlet")
public class NombreServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public NombreServlet() { super(); }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { doGet(request, response); }
}

2. Plantilla Listener
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class NombreListener implements ServletContextListener {
    public NombreListener() {}
    public void contextInitialized(ServletContextEvent sce) { }
    public void contextDestroyed(ServletContextEvent sce) { }
}

3. Plantilla Filter
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/RutaAProteger") 
public class NombreFiltro implements Filter {
    public NombreFiltro() {}
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException { }
}


-----------------------------------------------------------------------------
ENUNCIADO DEL EJERCICIO
-----------------------------------------------------------------------------
El sistema del hangar del Comando Estelar está expuesto. Actualmente, cualquiera 
puede acceder a la ruta /ServletDespegarNave y llevarse un caza estelar.

Se requiere asegurar el sistema con los siguientes elementos (el 
código de los puntos 1 a 4 ya ha sido proporcionado por el profesor):

1. CLASE DE DOMINIO: Nave.java (con codigo y modelo).
2. INICIALIZACIÓN: InitEstacionListener.java que carga un Hashtable en el 
   contexto con el nombre "HANGAR_CENTRAL".
3. ACCESO: ServletAccesoCapitan.java que guarda en la sesión del usuario 
   el atributo "CAPITAN_AUTORIZADO".
4. ACCIÓN: ServletDespegarNave.java que elimina la nave del hangar.

TU MISIÓN (PUNTO 5):
Crea la clase FiltroComandoEstelar.java. Debe interceptar únicamente las 
peticiones que vayan a "/ServletDespegarNave". Debe comprobar si existe el 
atributo de sesión "CAPITAN_AUTORIZADO". 
- Si existe: Deja pasar la petición hacia el Servlet de despegue.
- Si no existe: Redirige al intruso a "alerta_intrusa.jsp".


-----------------------------------------------------------------------------
SOLUCIÓN COMPLETA (CÓDIGOS)
-----------------------------------------------------------------------------

--- 1. Nave.java ---
package edu.espacio.domain;

public class Nave {
    private String codigo;
    private String modelo;

    public Nave(String codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
    }
    public String getCodigo() { return codigo; }
    public String getModelo() { return modelo; }
}


--- 2. InitEstacionListener.java ---
package edu.espacio.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.util.Hashtable;
import edu.espacio.domain.Nave;

@WebListener
public class InitEstacionListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) { 
        Hashtable<String, Nave> naves = new Hashtable<String, Nave>();
        naves.put("X-Wing-01", new Nave("X-Wing-01", "Caza Estelar"));
        naves.put("Falcon-99", new Nave("Falcon-99", "Carguero Ligero"));
        
        sce.getServletContext().setAttribute("HANGAR_CENTRAL", naves);
    }
    public void contextDestroyed(ServletContextEvent sce) { }
}


--- 3. ServletAccesoCapitan.java ---
package edu.espacio.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletAccesoCapitan")
public class ServletAccesoCapitan extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCapitan = request.getParameter("NOMBRE_CAPITAN");
        
        if (nombreCapitan != null && !nombreCapitan.isEmpty()) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("CAPITAN_AUTORIZADO", nombreCapitan); 
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}


--- 4. ServletDespegarNave.java ---
package edu.espacio.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.espacio.domain.Nave;

@WebServlet("/ServletDespegarNave")
public class ServletDespegarNave extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String codigo = request.getParameter("CODIGO");
        
        if(codigo != null) {
            Hashtable<String, Nave> naves = (Hashtable<String, Nave>) request.getServletContext().getAttribute("HANGAR_CENTRAL");
            if (naves != null && naves.containsKey(codigo)) {
                naves.remove(codigo); // La nave abandona el hangar
            }
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}




--- 5. FiltroComandoEstelar.java (LA SOLUCIÓN DEL FILTRO) ---
package edu.espacio.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

// Interceptamos solo las peticiones de despegue
@WebFilter("/ServletDespegarNave")
public class FiltroComandoEstelar implements Filter {

    public FiltroComandoEstelar() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        // 1. Convertimos a HTTP
        HttpServletRequest req = (HttpServletRequest) request;  
        HttpServletResponse res = (HttpServletResponse) response;

        // 2. Recuperamos la sesión
        HttpSession sesion = req.getSession();

        // 3. Comprobamos la autorización
        if (sesion.getAttribute("CAPITAN_AUTORIZADO") != null) {
            // Permiso concedido: Continuamos al ServletDespegarNave
            chain.doFilter(request, response);
        } else {
            // Denegado: Redirigimos al JSP de alerta
            res.sendRedirect("alerta_intrusa.jsp");
        }
    }
}
