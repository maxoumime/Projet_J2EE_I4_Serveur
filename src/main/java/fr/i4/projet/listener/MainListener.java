package fr.i4.projet.listener;

import fr.i4.projet.bean.Client;
import fr.i4.projet.service.UsersService;

import fr.i4.projet.bean.Produit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Client john = new Client("John Doe", "john", "doe");
        UsersService.addUser(john);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
