/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_chiera.escoffier;

import java.util.Scanner;

/**
 * 24/10
 * @author juliette
 * convertisseur de temperatures
 */
public class TP1_convertisseur_CHIERAESCOFFIER {

    private static double c;

    /**
     * @param args the command line arguments
     */
    public static double CelciusVersKelvin (double c) {return c+273;};
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entrer votre température en degre Celsuis :");  
        c=sc.nextDouble();
        System.out.println("Votre température en degre Kelvin est :" + CelciusVersKelvin(c));  
    }
    
}
