/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;

/**
 *
 * @author Zver
 */
public class Facture {
    private Reservation reservation;
    private String nomClient;
    private String prenomClient;
    private Date dateactuelle;
    private double prixJour;
    private double prixTotal;
    
    
    public Facture(){}

    public Facture(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Facture{" + "reservation=" + reservation + '}';
    }
    
    
}
