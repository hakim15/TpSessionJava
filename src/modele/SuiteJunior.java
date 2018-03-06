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
public class SuiteJunior  extends Chambre{

    public SuiteJunior(int numero, boolean disponible, double prix) {
        super(numero, disponible, prix);
    }   

    public SuiteJunior() {
    }

    @Override
    public String toString() {
        return " Junior";
    }
    
    
    
    
}
