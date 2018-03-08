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
    
    private Object element;
    
    
    public DejaPresentException(){}
    
    public <E>DejaPresentException(String message, E element){
        super(message);
        this.element = element;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    } 
    
}
