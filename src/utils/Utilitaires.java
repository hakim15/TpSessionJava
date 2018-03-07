/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Hakim Mamar
 */
public class Utilitaires {
    
    public static <T> boolean verifierDoublant(T[] arr, T el){
        for (T t: arr){
            if (t.equals(el)){
                return true;
            }
        }
        return false;
    }
    
    public static <T>void afficherListe(T[] arr){
        for (T tab: arr){
            System.out.println(tab);
        }
    }
    
    public static<T> void ecrireFichier(String nomFichier, T t){
        
    }
}
