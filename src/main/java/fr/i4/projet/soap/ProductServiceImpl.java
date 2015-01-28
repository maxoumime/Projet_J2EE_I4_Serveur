package fr.i4.projet.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.i4.projet.bean.Produit;

public class ProductServiceImpl extends SpringBeanAutowiringSupport implements
		ProductService {

	@Autowired
	private ProductService productService;

	public Produit getProduit(String id) {
		return productService.getProduit(id);
	}
	
	public List<Produit> getAllProduit() {
		return productService.getAllProduit();
	}

	public Produit getProduit() {
		return null;
	}
	


}