/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Hakim Mamar
 */
public class Paiement {
    private final double  TAUX_TAXES = 15;
    private Reservation reservation;
    private Facture facture;
    
    public Paiement(Reservation reservation){
        this.reservation = reservation;
    }
    
    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    public void genererFacture(Reservation res){
        this.facture = new Facture(res); 
    }
    
    
}
