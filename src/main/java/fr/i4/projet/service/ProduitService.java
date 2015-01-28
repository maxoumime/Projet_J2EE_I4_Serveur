package fr.i4.projet.service;

import java.util.List;

import javax.jws.WebService;

import fr.i4.projet.bean.Produit;

/**
 * Created by MhD on 28/01/15.
 */
@WebService(name="ProductService", serviceName="ProductService")
public interface ProduitService {

    public List<Produit> getProduits();
    public Produit getProduit(String ref);
    public boolean checkQuantity(Produit produit);

}
