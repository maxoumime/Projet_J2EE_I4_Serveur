package fr.i4.projet.servlet;


import fr.i4.projet.bean.Produit;
import fr.i4.projet.listener.MainListener;

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

        if(Integer.parseInt(quantityOrdered) != 0 && reference != null){
            for (Produit produit : MainListener.getListProduits()) {
                if(produit.getQuantity() >= Integer.parseInt(quantityOrdered)){
                    produit.setQuantity((produit.getQuantity() - Integer.parseInt(quantityOrdered)));
                }
            }
        }


    }
}
