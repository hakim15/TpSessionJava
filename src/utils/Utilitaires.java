/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import modele.Client;
import modele.ListeModele;
import modele.Reservation;




/**
 *
 * @author Hakim Mamar
 */
public class Utilitaires{
    
    public static double calculerPaiementTaxes(Reservation reservation, double tauxTaxes){
        
        return calculerPaiement(reservation)*tauxTaxes + calculerPaiement(reservation);
    }   
    
    public static double calculerPaiement(Reservation reservation){
        return reservation.getChambre().getPrix()*reservation.getNbNuits();
    }
}
