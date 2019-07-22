package Controller;

import Model.Persona;
import ModelDAO.PersonaDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    // Routes
   private String list = "views/list.jsp";
   private String add = "views/add.jsp";
   private String edit = "views/edit.jsp";
   private PersonaDAO actions = new PersonaDAO();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String access = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("add")) {

            addPerson(request, response);

            list(request, response, access);
        }
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String access = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("list")) {
            access = list;
            list(request, response, access);
        } else if (action.equalsIgnoreCase("add")) {
            access = add;
            redirect(request, response, access);
        } else if (action.equalsIgnoreCase("edit")) {
            access = edit;
            edit(request, response, access);
        }

    }

    private void redirect(HttpServletRequest request, HttpServletResponse response, String access) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher(access);

        view.forward(request, response);
    }

    private void list(HttpServletRequest request, HttpServletResponse response, String access) throws ServletException, IOException {
        List<Persona> personaList = actions.list();
        request.setAttribute("personas", personaList);

        redirect(request, response, access);

    }

    private void addPerson(HttpServletRequest request, HttpServletResponse response) {
        String nombre = request.getParameter("nombre");
        String pais = request.getParameter("pais");

        Persona persona = new Persona(nombre, pais);

        actions.add(persona);
    }

    private void edit(HttpServletRequest request, HttpServletResponse response, String access) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        Persona persona = actions.getById(id);

        request.setAttribute("persona", persona);

        redirect(request, response,access);

    }
}
