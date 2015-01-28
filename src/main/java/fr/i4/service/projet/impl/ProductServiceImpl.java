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

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Produit> getAllProduit() {
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
	public Contact getContact(String id) {
		Contact contact = null;

		try {
			ResultSet resultats = null;

			try {
				Connection conn = MyListener.getConnection();
				PreparedStatement stmt = conn
						.prepareStatement("SELECT * FROM USERS WHERE ID=?");
				stmt.setString(1, id);
				resultats = stmt.executeQuery();
				if (resultats.next()) {
					contact = new Contact();
					contact.setLogin(resultats.getString(1));
					contact.setName(resultats.getString(2));
					contact.setPassword(resultats.getString(3));
				}

				resultats.close();
				MyListener.getConnection().close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return contact;
	}

}
