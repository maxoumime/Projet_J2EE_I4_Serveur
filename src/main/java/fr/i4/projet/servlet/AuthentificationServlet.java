package fr.i4.projet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.i4.projet.service.TokenCheck;
import fr.i4.projet.service.UsersService;

/**
 * Created by maxoumime on 28/01/15.
 */

@WebServlet("/login")
public class AuthentificationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        if(user != null && password != null && UsersService.isUser(user, password)){

            response.setStatus(HttpServletResponse.SC_ACCEPTED);
            response.getWriter().append(TokenCheck.addToken(user, password));

        } else response.setStatus(HttpServletResponse.SC_FORBIDDEN);

    }
}
