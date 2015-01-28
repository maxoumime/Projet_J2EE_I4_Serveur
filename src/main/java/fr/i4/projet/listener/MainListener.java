package fr.i4.projet.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import fr.i4.projet.bean.Produit;

/**
 * Created by maxoumime on 28/01/15.
 */
public class MainListener implements ServletContextListener {

    private static List<Produit> listProduits;

    public static List<Produit> getListProduits() {
        return listProduits;
    }

    public MainListener() {
        listProduits = new ArrayList<Produit>();
        Produit produit = new Produit();
        produit.setReference("1EE3F");
        produit.setNom("Table Rouge");
        produit.setQuantity(10);
        listProduits.add(produit);

        produit = new Produit();
        produit.setReference("8HD8J");
        produit.setNom("Table Verte");
        produit.setQuantity(5);
        listProduits.add(produit);

        produit = new Produit();
        produit.setReference("9IK7J");
        produit.setNom("Chaise Bleu");
        produit.setQuantity(8);
        listProduits.add(produit);

        produit = new Produit();
        produit.setReference("0KS6T");
        produit.setNom("Chaise Jaune");
        produit.setQuantity(2);
        listProduits.add(produit);

    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {


    }
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}
