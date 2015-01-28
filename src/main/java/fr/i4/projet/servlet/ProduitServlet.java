package fr.i4.projet.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MhD on 28/01/15.
 */
@WebServlet("/Commande")
public class ProduitServlet extends HttpServlet {

    public ProduitServlet(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reference = request.getParameter("reference");
        String quantityOrdered = request.getParameter("quantityOrdered");

        if(quantityOrdered != null && reference != null){

        }


    }
}
