package com.danjerous.firstServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "FirstServlet", urlPatterns = {"/sample/firstServlet"})
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Especificamos formato de respuesta.

        PrintWriter output = response.getWriter();

        // Generamos la respuesta de la petición.

        output.println("<html><body><h1>This was a test with my first Servlet!!</h1>");

        output.println("<p>Esto fue impreso a la hora: " + new Date() + "</body></html>");

    }
}
