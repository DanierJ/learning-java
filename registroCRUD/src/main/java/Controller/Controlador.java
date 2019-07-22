package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    // Routes
   private String list = "views/list.jsp";
   private String add = "views/add.jsp";
   private String edit = "views/edit.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String access = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("list")) {
            access = list;
        }

        RequestDispatcher view = request.getRequestDispatcher(access);

        view.forward(request, response);

    }
}
