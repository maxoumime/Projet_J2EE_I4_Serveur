package fr.i4.projet.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import fr.i4.projet.bean.Produit;
import fr.i4.projet.listener.MainListener;
import fr.i4.projet.service.ProduitService;


public class ProductServiceImpl implements ProduitService {

	public List<Produit> getProduits() {
		List<Produit> produits = new ArrayList<Produit>();

		produits = MainListener.getListProduits();

		return produits;
	}

	

	public boolean checkQuantity(Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}



	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return null;
	}


}
