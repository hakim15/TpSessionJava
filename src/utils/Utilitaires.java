/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import modele.Client;
import modele.ListeClients;

/**
 *
 * @author Hakim Mamar
 */
public class Utilitaires{
    
    public static <T> boolean verifierDoublant(ArrayList<T> arr, T el){
        for (T t: arr){
            if (t.equals(el)){
                return true;
            }
        }
        return false;
    }
    
    public static <T>void afficherListe(ArrayList<T> arr){
        for (T tab: arr){
            System.out.println(tab);
        }
    }
    
    public static<T> void ecrireFichier(String nomFichier, T t){
        
    }

}
