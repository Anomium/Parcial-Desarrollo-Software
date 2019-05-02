/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import ModeloDAO.PersonaDAO;
import Models.Persona;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Melvin
 */
public class Controlador extends HttpServlet {
    
    
    String listar = "Views/listar.jsp";
    String add = "Views/add.jsp";
    String editar = "Views/edit.jsp";   
    Persona p = new Persona();
    int id;
    PersonaDAO dao = new PersonaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";
        String action = "";
        action = request.getParameter("accion");
        
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")){
            
            String nom = request.getParameter("txtNombre");
            String ape = request.getParameter("txtApellido");
            String email = request.getParameter("txtCumple");
            String lp = request.getParameter("cmbxLp");
            String hob = request.getParameterValues("cb").toString();
            p.setNom(nom);
            p.setLname(ape);
            p.setEmail(email);
            p.setLP(lp);
            p.setHob(hob);
            dao.add(p);
            acceso = listar;
            
        } else if (action.equalsIgnoreCase("editar")){
            request.setAttribute("idper", request.getParameter("id"));
            acceso = editar;
        } else if (action.equalsIgnoreCase("Actualizar")){
            id = Integer.parseInt(request.getParameter("txtId"));
            String nom = request.getParameter("txtNombre");
            String ape = request.getParameter("txtApellido");
            String email = request.getParameter("txtEmail");
            String lp = request.getParameter("cmbxLp");
            String hob = request.getParameter("cb");
            p.setId(id);
            p.setNom(nom);
            p.setLname(ape);
            p.setEmail(email);
            p.setLP(lp);
            p.setHob(hob);
            dao.add(p);
            dao.edit(p);
            acceso = listar;
            
        } else if(action.equalsIgnoreCase("eliminar")){
            id = Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso = listar;
        }
        RequestDispatcher view = request.getRequestDispatcher(acceso);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
