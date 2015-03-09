package fr.i4.projet.controller.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.i4.projet.bean.Produit;
import fr.i4.projet.listener.MainListener;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by MhD on 28/01/15.
 */
@WebServlet("/rest/produit")
public class ProduitController extends HttpServlet {

    public ProduitController(){
        super();
    }

    ObjectMapper mapper = new ObjectMapper();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Produit> lProduits = MainListener.getListProduits();
        response.getWriter().append(mapper.writeValueAsString(lProduits));
    }
}
