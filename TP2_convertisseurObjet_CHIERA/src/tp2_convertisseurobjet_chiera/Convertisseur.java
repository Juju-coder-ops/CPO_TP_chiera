/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julie
 */

package tp2_convertisseurobjet_chiera;

public class Convertisseur {
    int nbConversions; 
    
    public Convertisseur () { 
        nbConversions = 0 ; 
    } 
    
    public double CelciusVersKelvin(double c) {
        nbConversions++;
        return c + 273.15;
    }

    public double KelvinVersCelcius(double k) {
        nbConversions++;
        return k - 273.15;
    }

    public double FarenheitVersCelcius(double f) {
        nbConversions++;
        return (f - 32) * 5.0 / 9.0;
    }

    public double CelciusVersFarenheit(double c) {
        nbConversions++;
        return c * 9.0 / 5.0 + 32;
    }

    public double KelvinVersFarenheit(double k) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(k));
    }

    public double FarenheitVersKelvin(double f) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(f));
    }
    
    @Override 
    public String toString () { 
        return "nb de conversions"+ nbConversions; 
    }    
}
