/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import utils.DejaPresentException;
import utils.Utilitaires;

/**
 *
 * @author 1791330
 */
public class ListeClients extends ArrayList<Client>{
    public void ajouterClient(Client cl) throws DejaPresentException{
        if(this.size()>0){
            if(!Utilitaires.verifierDoublant(this, cl)){
                this.add(cl);
              }else{
                throw new DejaPresentException("Le client: " + cl.getNom() + " deja existe dans la liste", cl);
                }            
        }else{
           this.add(cl); 
        }
    }
}
