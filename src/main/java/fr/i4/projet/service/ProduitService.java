package fr.i4.projet.service;

import fr.i4.projet.bean.Produit;

import java.util.List;

/**
 * Created by MhD on 28/01/15.
 */
public interface ProduitService {

    public List<Produit> getProduits();
    public Produit getProduit(String ref);
    public boolean checkQuantity(Produit produit);


}
