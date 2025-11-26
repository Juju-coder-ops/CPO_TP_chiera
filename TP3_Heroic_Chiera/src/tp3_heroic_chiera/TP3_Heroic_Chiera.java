/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_chiera;
import Armes.*;
import Personnages.*;
/**
 *
 * @author julie
 */
public class TP3_Heroic_Chiera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        System.out.println(excalibur);
        System.out.println(durandal);
        System.out.println(chene);
        System.out.println(charme);
        
        
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        System.out.println(gandalf);
        System.out.println(garcimore);
        System.out.println(conan);
        System.out.println(lannister);
        
        // Je crée un magicien et un guerrier
        Magicien gandalf2 = new Magicien("Gandalf", 65, true);
        Guerrier conan2 = new Guerrier("Conan", 78, false);

        // Je crée quelques armes
        Epee excalibur2 = new Epee("Excalibur", 7, 5);
        Epee durandal2 = new Epee("Durandal", 4, 7);
        Baton chene2 = new Baton("Chêne", 4, 5);

        // Ajout d’armes
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(excalibur);

        conan.ajouterArme(durandal);

        // Equipement
        gandalf.equiperParNom("Chêne");
        conan.equiperParNom("Durandal");

        // Affichage final
        System.out.println(gandalf);
        System.out.println(conan);
    }
    
}
