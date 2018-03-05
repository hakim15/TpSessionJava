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
public abstract class ChambreType {
    
   private int numero;
   private boolean disponile;
   double prix;

    public ChambreType(int numero, boolean disponile) {
        this.numero = numero;
        this.disponile = disponile;
    }

    
   

   

    

    public ChambreType() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponile() {
        return disponile;
    }

    public void setDisponile(boolean disponile) {
        this.disponile = disponile;
    }
   
   
  
}
