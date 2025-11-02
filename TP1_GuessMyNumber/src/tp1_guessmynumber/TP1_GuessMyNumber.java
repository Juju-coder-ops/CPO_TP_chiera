/*
 * TP1 – Guess My Number
 * 02/11/2025
 * Auteur : Juliette
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

public class TP1_GuessMyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("Bienvenue dans Guess My Number !");
        System.out.println("Choisissez un niveau de difficulté : facile, normal, difficile, cauchemar");
        String difficulte = sc.nextLine().toLowerCase();

        // Définition des paramètres selon la difficulté
        int max = 100;
        int maxCoups = Integer.MAX_VALUE; // par défaut illimité
        boolean modeCauchemar = false;

        switch (difficulte) {
            case "facile" -> max = 50;             
            case "normal" -> max = 100;
            case "difficile" -> max = 200;         
            case "cauchemar" -> {
                max = 100;
                modeCauchemar = true;
            }
            default -> System.out.println("Difficulté non reconnue, mode normal choisi.");
        }

        int nombreADeviner = generateurAleat.nextInt(max + 1);
        int coups = 0;
        boolean trouve = false;

        System.out.println("Devinez un nombre entre 0 et " + max + " !");

        while (!trouve && coups < maxCoups) {
            System.out.print("Entrez votre proposition : ");
            int proposition = sc.nextInt();
            coups++;

            String message;

            if (proposition == nombreADeviner) {
                message = "Gagné ! Vous avez trouvé le nombre en " + coups + " coups.";
                trouve = true;
            } else {
                // Gestion mode cauchemar (30% de fausse indication)
                boolean fausseIndication = modeCauchemar && generateurAleat.nextInt(100) < 30;

                if ((proposition < nombreADeviner && !fausseIndication) || (proposition > nombreADeviner && fausseIndication)) {
                    message = Math.abs(proposition - nombreADeviner) > max / 10 ? "Vraiment trop petit !" : "Trop petit";
                } else {
                    message = Math.abs(proposition - nombreADeviner) > max / 10 ? "Vraiment trop grand !" : "Trop grand";
                }
            }

            System.out.println(message);
        }

        if (!trouve) {
            System.out.println("Vous n'avez pas trouvé le nombre. C'était : " + nombreADeviner);
        }

        sc.close();
    }
}
