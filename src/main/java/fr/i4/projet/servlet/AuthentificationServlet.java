package fr.i4.projet.servlet;

import fr.i4.projet.service.TokenCheck;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by maxoumime on 28/01/15.
 */

@WebServlet("/login")
public class AuthentificationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private LinkedList<String> allowedUsers = new LinkedList<String>();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub

        allowedUsers.add("john:doe");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");

        String userpassword = user+":"+"password";

        if(user != null && password != null && allowedUsers.contains(userpassword)){

            response.setStatus(HttpServletResponse.SC_ACCEPTED);
            response.getWriter().append(TokenCheck.addToken(userpassword));

        } else response.setStatus(HttpServletResponse.SC_FORBIDDEN);

    }
}
