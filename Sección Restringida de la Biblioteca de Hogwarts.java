=============================================================================
EXAMEN DE PRÁCTICA: LA SECCIÓN RESTRINGIDA DE HOGWARTS (FILTROS)
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
El sistema de la biblioteca de Hogwarts es inseguro. Actualmente, cualquier 
alumno puede entrar a la ruta /ServletPrestarLibro y llevarse un libro de 
magia oscura. 

Se requiere implementar un sistema seguro con los siguientes elementos (el 
código de los puntos 1 a 4 ya ha sido proporcionado por el profesor):

1. CLASE DE DOMINIO: Libro.java (con isbn y titulo).
2. INICIALIZACIÓN: InitBibliotecaListener.java que carga un Hashtable en el 
   contexto con el nombre "SECCION_RESTRINGIDA".
3. ACCESO: ServletLoginProfesor.java que guarda en la sesión del usuario 
   el atributo "PROFESOR_AUTORIZADO".
4. ACCIÓN: ServletPrestarLibro.java que elimina el libro de la biblioteca.

TU MISIÓN (PUNTO 5):
Crea la clase FiltroSeccionRestringida.java. Debe interceptar únicamente las 
peticiones que vayan a "/ServletPrestarLibro". Debe comprobar si existe el 
atributo de sesión "PROFESOR_AUTORIZADO". 
- Si existe: Deja pasar la petición hacia el Servlet.
- Si no existe: Redirige al intruso a "error_magia.jsp".


-----------------------------------------------------------------------------
SOLUCIÓN COMPLETA (CÓDIGOS)
-----------------------------------------------------------------------------

--- 1. Libro.java ---
package edu.hogwarts.domain;

public class Libro {
    private String isbn;
    private String titulo;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
}


--- 2. InitBibliotecaListener.java ---
package edu.hogwarts.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.util.Hashtable;
import edu.hogwarts.domain.Libro;

@WebListener
public class InitBibliotecaListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) { 
        Hashtable<String, Libro> libros = new Hashtable<String, Libro>();
        libros.put("111", new Libro("111", "Magia Muy Oscura"));
        libros.put("222", new Libro("222", "Pociones Peligrosas"));
        
        sce.getServletContext().setAttribute("SECCION_RESTRINGIDA", libros);
    }
    public void contextDestroyed(ServletContextEvent sce) { }
}


--- 3. ServletLoginProfesor.java ---
package edu.hogwarts.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletLoginProfesor")
public class ServletLoginProfesor extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreProfesor = request.getParameter("NOMBRE_PROFESOR");
        
        if (nombreProfesor != null && !nombreProfesor.isEmpty()) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("PROFESOR_AUTORIZADO", nombreProfesor); 
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}


--- 4. ServletPrestarLibro.java ---
package edu.hogwarts.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Hashtable;
import edu.hogwarts.domain.Libro;

@WebServlet("/ServletPrestarLibro")
public class ServletPrestarLibro extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String isbn = request.getParameter("ISBN");
        
        if(isbn != null) {
            Hashtable<String, Libro> libros = (Hashtable<String, Libro>) request.getServletContext().getAttribute("SECCION_RESTRINGIDA");
            if (libros != null && libros.containsKey(isbn)) {
                libros.remove(isbn); 
            }
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}


--- 5. FiltroSeccionRestringida.java (LA SOLUCIÓN DEL FILTRO) ---
package edu.hogwarts.filter;

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

@WebFilter("/ServletPrestarLibro")
public class FiltroSeccionRestringida implements Filter {

    public FiltroSeccionRestringida() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;  
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession sesion = req.getSession();

        if (sesion.getAttribute("PROFESOR_AUTORIZADO") != null) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect("error_magia.jsp");
        }
    }
}