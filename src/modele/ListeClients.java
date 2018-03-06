/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import utils.DejaPresentException;

/**
 *
 * @author 1791330
 */
public class ListeClients extends ArrayList<Client>{
    public void ajouterClient(Client cl) throws DejaPresentException{
        if(!verifierDoublant(cl)){
            this.add(cl);
          }else{
            throw new DejaPresentException("Le client: " + cl.getNom() + " deja existe dans la liste", cl);
            }            
        }
    
    private boolean verifierDoublant(Client cl){
        for (Client clt: this){
            if (clt.equals(cl)){
                return true;
            }
        }
        return false;
    }
    
    public void listerClients(){
        for (Client clt: this){
            System.out.println(clt);
        }
    }
}
