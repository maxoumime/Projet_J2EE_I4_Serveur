package fr.i4.projet.controller.soap;

import fr.i4.projet.bean.Produit;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by MhD on 09/03/15.
 */

@WebService(name="ProduitService", serviceName="ProduitService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ProduitService {
    public List<Produit> getProduits();
}
