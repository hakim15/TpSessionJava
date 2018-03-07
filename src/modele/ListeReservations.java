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
public class ListeReservations extends ArrayList<Reservation>{
     public void ajouterReservation(Reservation res) throws DejaPresentException{
        if(this.size()>0){
            if(Utilitaires.verifierDoublant(this, res)){
                throw new DejaPresentException("La reservtion deja existe dans la liste", res);
            }else{
                this.add(res);
            }            
        }else{
            this.add(res);
        }
     }
    
    /*private boolean verifierDoublant(Reservation res){
        for (Reservation r: this){
            if (r.equals(res)){
                return true;
            }
        }
        return false;
    }
    
    public void listerChambre(){
        for (Reservation res: this){
            System.out.println(res);
        }
    }*/
}
