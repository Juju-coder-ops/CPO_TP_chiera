/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_chiera;

import java.util.Scanner;

/**
 *
 * @author julie
 */
public class TP2_convertisseurObjet_CHIERA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Convertisseur conv = new Convertisseur();
        double valeur;
        double resultat;

        int choix = 0;

        while (choix != 7) {

            System.out.println("=== MENU CONVERSIONS ===");
            System.out.println("1 - Celsius vers Kelvin");
            System.out.println("2 - Kelvin vers Celsius");
            System.out.println("3 - Fahrenheit vers Celsius");
            System.out.println("4 - Celsius vers Fahrenheit");
            System.out.println("5 - Kelvin vers Fahrenheit");
            System.out.println("6 - Fahrenheit vers Kelvin");
            System.out.println("7 - Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            if (choix >= 1 && choix <= 6) {
                System.out.print("Entrez la valeur à convertir : ");
                valeur = sc.nextDouble();
            } else {
                continue;
            }

            switch (choix) {

                case 1 -> {
                    resultat = conv.CelciusVersKelvin(valeur);
                    System.out.println(valeur + " °C = " + resultat + " K");
                }

                case 2 -> {
                    resultat = conv.KelvinVersCelcius(valeur);
                    System.out.println(valeur + " K = " + resultat + " °C");
                }

                case 3 -> {
                    resultat = conv.FarenheitVersCelcius(valeur);
                    System.out.println(valeur + " °F = " + resultat + " °C");
                }

                case 4 -> {
                    resultat = conv.CelciusVersFarenheit(valeur);
                    System.out.println(valeur + " °C = " + resultat + " °F");
                }

                case 5 -> {
                    resultat = conv.KelvinVersFarenheit(valeur);
                    System.out.println(valeur + " K = " + resultat + " °F");
                }

                case 6 -> {
                    resultat = conv.FarenheitVersKelvin(valeur);
                    System.out.println(valeur + " °F = " + resultat + " K");
                }
            }

            System.out.println();
        }

        System.out.println("Nombre total de conversions effectuées : " + conv.nbConversions);
        System.out.println("Au revoir !");
    }
}
