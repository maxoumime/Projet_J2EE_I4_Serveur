package fr.i4.projet.controller.soap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import fr.i4.projet.bean.Produit;
import fr.i4.projet.service.ProduitService;

import java.util.List;

public class ProduitServiceImpl extends SpringBeanAutowiringSupport implements fr.i4.projet.controller.soap.ProduitService {

	@Autowired
	private fr.i4.projet.service.ProduitService produitService;

	@Override
	public List<Produit> getProduits() {
		return produitService.getProduits();
	}

}