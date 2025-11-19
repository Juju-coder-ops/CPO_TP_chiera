/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_chiera;

/**
 *
 * @author julie
 */
public class TP2_convertisseurObjet_CHIERA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv1 = new Convertisseur();
         conv1.CelciusVersKelvin(25);
         conv1.FarenheitVersCelcius(77);
         
        Convertisseur conv2 = new Convertisseur();
            conv2.KelvinVersCelcius(300);
            conv2.CelciusVersFarenheit(0);
            conv2.FarenheitVersKelvin(32);
            
        System.out.println("Convertisseur 1 : " + conv1);
        System.out.println("Convertisseur 2 : " + conv2);
    }
    
}
