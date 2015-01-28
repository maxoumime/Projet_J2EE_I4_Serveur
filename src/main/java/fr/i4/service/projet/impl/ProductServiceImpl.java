package fr.i4.service.projet.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.i4.projet.bean.Produit;
import fr.i4.projet.service.ProductService;
import fr.i4.projet.service.ProduitService;

@Service
public class ProductServiceImpl implements ProduitService {

	@Override
	public List<Produit> getProduits() {
		List<Produit> produits = new ArrayList<Produit>();

		try {
			ResultSet resultats = null;
			String requete = "SELECT * FROM PRODUIT";

			try {
				Statement stmt = MyListener.getConnection().createStatement();
				resultats = stmt.executeQuery(requete);

				while (resultats.next()) {
					Produit prod = new Produit();
					prod.setName(resultats.getString(1));
					prod.setQuantity(resultats.getString(2));
					produits.add(prod);
				}

				resultats.close();
				MyListener.getConnection().close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return produits;
	}

	
	@Override
	public Produit getProduit(String id) {
		Produit prod = null;

		try {
			ResultSet resultats = null;

			try {
				Connection conn = MyListener.getConnection();
				PreparedStatement stmt = conn
						.prepareStatement("SELECT * FROM USERS WHERE ID=?");
				stmt.setString(1, id);
				resultats = stmt.executeQuery();
				if (resultats.next()) {
					prod = new Produit();
					prod.setNom(resultats.getString(1));
					prod.setQuantity(resultats.getInt(2));
				}

				resultats.close();
				MyListener.getConnection().close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prod;
	}

}
