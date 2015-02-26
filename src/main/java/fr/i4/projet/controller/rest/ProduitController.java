package fr.i4.projet.controller.rest;

import fr.i4.projet.bean.Produit;
import fr.i4.projet.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by MhD on 28/01/15.
 */
@Controller
public class ProduitController {


    @Qualifier("produit")
    @Autowired
    private ProduitService produitService;

    @RequestMapping(value="/produit", method= RequestMethod.GET)
    public @ResponseBody List<Produit> getProduits(){
        return produitService.getProduits();
    }
}
