/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.Chambre;
import modele.ChambreDouble;
import modele.ChambreSimple;
import modele.ListeChambres;
import modele.SuiteJunior;
import modele.SuiteRoyale;
import utils.DejaPresentException;

/**
 *
 * @author Hakim Mamar
 */
public class ManipulationFichiers {
    
    public static void lireFichierChambre(ListeChambres liste ) {

        File file = new File("ListeDeChambre.txt");
        FileReader fr = null;
        BufferedReader br = null;
        Chambre chambre = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String ligne;

            while ((ligne = br.readLine()) != null) {

                String[] mots = ligne.split(" ");
                if(mots[1].equalsIgnoreCase("simple")){
                    chambre = new ChambreSimple(Integer.parseInt(mots[0]),true,Double.parseDouble(mots[2]));
                }
                if(mots[1].equalsIgnoreCase("double")){
                    chambre = new ChambreDouble(Integer.parseInt(mots[0]),true,Double.parseDouble(mots[2]));
                }
                if(mots[1].equalsIgnoreCase("junior")){
                    chambre = new SuiteJunior(Integer.parseInt(mots[0]),true,Double.parseDouble(mots[2]));
                }
                if(mots[1].equalsIgnoreCase("suite")){
                    chambre = new SuiteRoyale(Integer.parseInt(mots[0]),true,Double.parseDouble(mots[2]));
                }
                
                try {
                    liste.ajouterChambre(chambre);
                } catch (DejaPresentException ex) {
                    Logger.getLogger(ManipulationFichiers.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }

        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichiers.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(ManipulationFichiers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
}
