package fr.i4.projet.soap;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import fr.i4.projet.bean.Produit;


@WebService(name="ProductService", serviceName="ProductService")
public interface ProductService {
	public Produit getProduit(@WebParam(name="id") String id);
	public List<Produit> getAllProduit();
}
