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
public class ListeModele<T> extends ArrayList<T> {
    
     
    public void ajouterElement(T el) throws DejaPresentException{
        if(this.size()>0){
            if(verifierDoublant(this, el)){
                throw new DejaPresentException("deja present dans la liste", el);
            }else{
                this.add(el);
            }            
        }else{
            this.add(el);
        }
    }
    
    public <T> boolean verifierDoublant(ArrayList<T> arr, T el){
        for (T t: arr){
            if (t.equals(el)){
                return true;
            }
        }
        return false;
    }
    
    public <T>void afficherListe(ArrayList<T> arr){
        for (T el: arr){
            System.out.println(el);
        }
    }
    
    public <T> void supprimerElement(T el){
        this.remove(el);
    }
}
