/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Hakim Mamar
 */
public class Reservation {
    
    private int reservation_id;
    private int client_id;
    private Date dateDebut;
    private Date dateFin;
    private int nbNuits;
    private int nbPersonnes;

    public Reservation(int reservation_id, int client_id, Date dateDebut, Date dateFin, int nbNuits, int nbPersonnes) {
        this.reservation_id = reservation_id;
        this.client_id = client_id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbNuits = nbNuits;
        this.nbPersonnes = nbPersonnes;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbNuits() {
        return nbNuits;
    }

    public void setNbNuits(int nbNuits) {
        this.nbNuits = nbNuits;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.reservation_id;
        hash = 79 * hash + this.client_id;
        hash = 79 * hash + Objects.hashCode(this.dateDebut);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (this.reservation_id != other.reservation_id) {
            return false;
        }
        if (this.client_id != other.client_id) {
            return false;
        }
        if (!Objects.equals(this.dateDebut, other.dateDebut)) {
            return false;
        }
        if (!Objects.equals(this.dateFin, other.dateFin)) {
            return false;
        }
        if (this.nbNuits != other.nbNuits) {
            return false;
        }
        if (this.nbPersonnes != other.nbPersonnes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservation_id=" + reservation_id + ", client_id=" + client_id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", nbNuits=" + nbNuits + ", nbPersonnes=" + nbPersonnes + '}';
    }
    
    
    
}
