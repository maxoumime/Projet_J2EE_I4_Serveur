package fr.i4.projet.service;

import java.util.List;

import fr.i4.projet.bean.Produit;

public interface ProductService {

	public List<Produit> getAllProduit();
	public Produit getProduit(String id);


}
