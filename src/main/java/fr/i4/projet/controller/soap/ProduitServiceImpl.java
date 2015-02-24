package fr.i4.projet.controller.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.i4.projet.bean.Produit;
import fr.i4.projet.service.ProduitService;

public class ProduitServiceImpl extends SpringBeanAutowiringSupport implements
		ProduitService {

	@Autowired
	private ProduitService productService;

	public Produit getProduit(String ref) {
		return productService.getProduit(ref);
	}
	
	public List<Produit> getProduits() {
		return productService.getProduits();
	}

	public Produit getProduit() {
		return null;
	}

	public boolean checkQuantity(Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}
	


}