package fr.epsi.firstprojects.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import fr.epsi.firstprojects.beans.Utilisateur;
import fr.epsi.firstprojects.listeners.MyListener;
import fr.epsi.firstprojects.services.ContactService;
import fr.epsi.firstprojects.services.impl.ContactServiceImpl;

/**
 * Servlet implementation class ConnectServlet
 */
@WebServlet("/ConnectServlet")
public class ConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnectServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Logger.getRootLogger().info("Test Servlet");

		String login = request.getParameter("login");
		Logger.getRootLogger().info("login=" + login);
		String password = request.getParameter("password");
		Logger.getRootLogger().info("password=" + password);

		boolean authorized = true;
		Utilisateur utilisateurConnecte = null;
		if (login == null || password == null || login.equals("") || password.equals("")) {
			authorized = false;
		} else {
			authorized = false;
			for (Utilisateur utilisateur : MyListener.getListOfUtilisateurs()) {
				if (utilisateur.getLogin().equals(login)
						&& utilisateur.getPassword().equals(password)) {
					utilisateurConnecte = utilisateur;
					authorized = true;
				}
			}
		}

		if (authorized) {
			request.getSession().setAttribute("utilisateur", utilisateurConnecte);
			ContactService service = new ContactServiceImpl();
			request.setAttribute("contacts", service.getContacts());
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("connect.html").forward(request, response);
		}
		Logger.getRootLogger().info("Fin Test Servlet");
	}

}
