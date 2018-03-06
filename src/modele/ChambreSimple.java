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
public class ChambreSimple extends Chambre{
    
    public ChambreSimple(){
        
    }

    public ChambreSimple(int numero, boolean disponible, double prix) {
        super(numero, disponible, prix);
    }

    @Override
    public String toString() {
        return " Simple";
    }

    

    
    
   
    
    
}
