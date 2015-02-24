package fr.i4.projet.bean;

/**
 * Created by maxoumime on 15/12/14.
 */
public class Produit {

    private String nom;
    private String reference;
    private int quantity;

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public String getReference() {return reference;}

    public void setReference(String reference) {this.reference = reference;}

    @Override
    public String toString(){
        return nom+":"+reference+":"+quantity;
    }

}
