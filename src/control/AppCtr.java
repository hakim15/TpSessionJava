/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modele.Client;
import modele.ListeModele;

import utils.DejaPresentException;
import utils.Utilitaires;

/**
 *
 * @author Hakim Mamar
 */
public class AppCtr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client c1 = new Client(1, "Bill", "Brown", "3242514");
        Client c2 = new Client(1, "Bill", "Brown", "3242514");
        Client c3 = new Client(2, "Bill", "Brown", "3242514");
        ListeModele<Client> lc = new ListeModele<>();
        try{
            lc.ajouterElement(c1);
        }catch(DejaPresentException dpse){
            System.out.println("Non");
        }
        try{
            lc.ajouterElement(c3);
        } catch(DejaPresentException dpse){
            System.out.println(dpse.getMessage());
        }
        try{
            lc.ajouterElement(c2);
        } catch(DejaPresentException dpse){
            System.out.println(dpse.getMessage());
        }
        
        lc.afficherListe(lc);
    }
    
}
