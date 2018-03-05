/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Hakim Mamar
 */
public class Client {
    
    private int idClient;
    private String nom;
    private String prenom;
    private String tel;

    public Client() {
    }

    public Client(int idClient, String nom, String prenom, String tel) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }
    
    

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
