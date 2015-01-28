package fr.i4.projet.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.i4.projet.bean.Produit;
import fr.i4.projet.listener.MainListener;
import fr.i4.projet.service.ProduitService;

@Service
public class ProductServiceImpl implements ProduitService {

	public List<Produit> getProduits() {
		List<Produit> produits = new ArrayList<Produit>();

		try {
			ResultSet resultats = null;

			try {
				Statement stmt = MainListener.
				resultats = stmt.executeQuery(requete);

				while (resultats.next()) {
					Produit prod = new Produit();
					prod.setNom(resultats.getString(1));
					prod.setReference(resultats.getString(2));
					prod.setQuantity(resultats.getInt(3));
					produits.add(prod);
				}

				resultats.close();
				MainListener.getConnection().close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return produits;
	}

	
	public Produit getProduit(String id) {
		Produit prod = null;

		try {
			ResultSet resultats = null;

			try {
				Connection conn = MainListener.getConnection();
				PreparedStatement stmt = conn
						.prepareStatement("SELECT * FROM USERS WHERE ID=?");
				stmt.setString(1, id);
				resultats = stmt.executeQuery();
				if (resultats.next()) {
					prod = new Produit();
					prod.setNom(resultats.getString(1));
					prod.setReference(resultats.getString(2));
					prod.setQuantity(resultats.getInt(3));
				}

				resultats.close();
				MainListener.getConnection().close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prod;
	}


	public boolean checkQuantity(Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}

}
