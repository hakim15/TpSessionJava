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
public class Chambre {

    public ChambreType getChambre(String chambreType,int no, boolean disponible ) {

        if (chambreType.equalsIgnoreCase("chambre simple")) {
            return new ChambreSimple(no, disponible);
        } else if (chambreType.equalsIgnoreCase("chambre double")) {
            return new ChambreDouble(no, disponible);
        } else if (chambreType.equalsIgnoreCase("suite junior")) {
            return new SuiteJunior(no, disponible);
        } else if (chambreType.equalsIgnoreCase("suite royale")) {
            return new SuiteRoyale(no, disponible);
        } else {
            return null;
        }
    }

    public ChambreType getChambre(String chambreType ) {

        if (chambreType.equalsIgnoreCase("chambre simple")) {
            return new ChambreSimple();
        } else if (chambreType.equalsIgnoreCase("chambre double")) {
            return new ChambreDouble();
        } else if (chambreType.equalsIgnoreCase("suite junior")) {
            return new SuiteJunior();
        } else if (chambreType.equalsIgnoreCase("suite royale")) {
            return new SuiteRoyale();
        } else {
            return null;
        }

    }

}
