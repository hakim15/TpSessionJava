/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Chambre;

/**
 *
 * @author 1791330
 */
public class DejaPresentException extends Exception{
    private Object objet;
    
    public DejaPresentException(){}
    
    public DejaPresentException(String message, Object ob){
        super(message);
        this.objet = ob;
    }

    public Object getObjet() {
        return objet;
    }
    
}
