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
        
        // swap
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nAprès swap des références :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
    
        // tableau de 10 références (initialement toutes null)
        Moussaka[] tab = new Moussaka[10];

        // remplir le tableau avec 10 objets distincts
        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Moussaka(100 + i * 10); // par exemple des calories différentes
        }

        // vérification : afficher les calories
        System.out.println("\nTableau de Moussaka :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Moussaka[" + i + "].nbCalories = " + tab[i].nbCalories);
        }
    }
    
}
