package fr.i4.projet.controller.soap;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.i4.projet.bean.Produit;


@WebService(name="ProductService", serviceName="ProductService")
public interface ProduitService {
	public Produit getProduit(@WebParam(name="id") String ref);
	public List<Produit> getProduits();
}
