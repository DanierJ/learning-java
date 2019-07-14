package com.danjerous.firstServlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ControladorServlet", urlPatterns = {"/ControladorServlet"})
public class ControladorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] productos = {"Destornillador", "Martilllo", "Serrucho", "Tornillo", "Taladro"};

        request.setAttribute("listaProductos", productos);

        RequestDispatcher miDispatcher = request.getRequestDispatcher("/VistaJSP.jsp");

        miDispatcher.forward(request, response);


       // request.getRequestDispatcher("/VistaJSP.jsp").forward(request, response);

    }
}
