/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
                    JOptionPane.showMessageDialog(null, ex.getMessage() +" est doublee", " Erreur", JOptionPane.ERROR_MESSAGE);
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
    
    public static void EcrireFichierChambre(ListeChambres liste ) {
         FileOutputStream fos = null;
         ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("t");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManipulationFichiers.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            oos = new ObjectOutputStream(fos);
            
            for(Chambre ch:liste){
                oos.writeObject(ch);
            }

        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichiers.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(ManipulationFichiers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
