package com.danjerous.firstServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistroUsuarios", urlPatterns = {"/RegistroUsuarios"})
public class RegistroUsuarios extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*If we work here first wee need to tell what kind of response we're gonna give:*/

        response.setContentType("text/html");

        PrintWriter output = response.getWriter();

        output.println("<html><body>");
        output.println("Nombre introducido: " + request.getParameter("nombre") + "<br>");
        output.println("Apellido introducido: " + request.getParameter("apellido") + "<br>");

        output.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter output = response.getWriter();

        output.println("<html><body>");
        output.println("Nombre introducido: " + request.getParameter("nombre") + "<br>");
        output.println("Apellido introducido: " + request.getParameter("apellido") + "<br>");

        output.println("</body></html>");

    }
}
