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
public class ListeChambres extends ArrayList<Chambre>{
    public void ajouterChambre(Chambre ch) throws DejaPresentException{
        if(this.size()>0){
            if(Utilitaires.verifierDoublant(this, ch)){
                throw new DejaPresentException("La chambre deja existe dans la liste", ch);
            }else{
                this.add(ch);
            }            
        }else{
            this.add(ch);
        }
    }
    
   /* private boolean verifierDoublant(Chambre ch){
        for (Chambre c: this){
            if (c.equals(ch)){
                return true;
            }
        }
        return false;
    }
    
    public void listerChambre(){
        for (Chambre c: this){
            System.out.println(c);
        }
    }*/
    
}
