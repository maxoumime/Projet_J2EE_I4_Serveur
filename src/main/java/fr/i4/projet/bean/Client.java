package fr.i4.projet.bean;

/**
 * Created by maxoumime on 15/12/14.
 */
public class Client {

    private String nom;
    private String login;
    private String password;

    public Client(){
        nom = "";
        login = "";
        password = "";
    }

    public Client(String nom, String login, String password) {
        this.nom = nom;
        this.login = login;
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(Object o){

        Client c = (Client)o;
        return (c.getLogin().equals(login));
    }

    public int hashCode(){
        return getLogin().hashCode();
    }

    @Override
    public String toString(){
        return login+":"+password;
    }
}
