/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_chiera;

/**
 *26/11/2025
 * @author juliette
 */
public class TP2_manip_CHIERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Création de deux Tartiflettes distinctes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // assiette3 référence la même tartiflette que assiette2 (pas de new)
        Tartiflette assiette3 = assiette2;

        // Affichage initial
        System.out.println("Avant modification :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Incrémenter seulement assiette2
        assiette2.nbCalories += 50;

        // Affichage après incrément
        System.out.println("\nAprès increment (assiette2.nbCalories += 50) :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
    }
    
}
