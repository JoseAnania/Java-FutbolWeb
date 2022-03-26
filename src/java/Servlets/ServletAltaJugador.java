
package Servlets;

import Controlador.Conexion;
import Modelo.Plantel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAltaJugador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Conexion C=new Conexion();
            
            ArrayList lista=C.llenarComboP();
            request.setAttribute("lista", lista);
            
            ArrayList lista2=C.llenarComboD();
            request.setAttribute("lista2", lista2);
        
        
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/altaJugador.jsp");
        rd.forward(request,response);
           
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String numero=request.getParameter("numero");
        String nombreJ=request.getParameter("nombreJ");
        String idP=request.getParameter("cboPosicion");
        String idD=request.getParameter("cboDivision");
        String edad=request.getParameter("edad");
        
        Conexion C=new Conexion();
        Plantel P=new Plantel();
        
        P.setNumero(Integer.parseInt(numero));
        P.setNombreJ(nombreJ);
        P.setIdP(Integer.parseInt(idP));
        P.setIdD(Integer.parseInt(idD));
        P.setEdad(Integer.parseInt(edad));
        
        C.agregarJugador(P);
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Club de Fútbol</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<li><a href=\"index.html\">Volver</a></li>");
            out.println("<h1>Se cargo al Jugador exitosamente</h1>");
            out.println("</body>");
            out.println("</html>");
    }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
