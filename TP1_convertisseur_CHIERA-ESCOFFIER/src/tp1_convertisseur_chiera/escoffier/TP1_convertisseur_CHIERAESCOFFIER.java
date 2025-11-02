package tp1_convertisseur_chiera.escoffier;

import java.util.Scanner;

/**
 * 24/10
 * @author juliette
 * Convertisseur de températures interactif
 */
public class TP1_convertisseur_CHIERAESCOFFIER {

    // Méthodes de conversion
    public static double CelciusVersKelvin(double c) {
        return c + 273.15;
    }

    public static double KelvinVersCelcius(double k) {
        return k - 273.15;
    }

    public static double FarenheitVersCelcius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double CelciusVersFarenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }

    public static double KelvinVersFarenheit(double k) {
        return CelciusVersFarenheit(KelvinVersCelcius(k));
    }

    public static double FarenheitVersKelvin(double f) {
        return CelciusVersKelvin(FarenheitVersCelcius(f));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la température à convertir :");
        double temp = sc.nextDouble();

        System.out.println("""
                Choisissez la conversion que vous souhaitez :
                1) Celsius vers Kelvin
                2) Kelvin vers Celsius
                3) Fahrenheit vers Celsius
                4) Celsius vers Fahrenheit
                5) Kelvin vers Fahrenheit
                6) Fahrenheit vers Kelvin
                """);

        int choix = sc.nextInt();

        switch (choix) {
            case 1 -> System.out.println(temp + "°C = " + CelciusVersKelvin(temp) + " K");
            case 2 -> System.out.println(temp + " K = " + KelvinVersCelcius(temp) + " °C");
            case 3 -> System.out.println(temp + "°F = " + FarenheitVersCelcius(temp) + " °C");
            case 4 -> System.out.println(temp + "°C = " + CelciusVersFarenheit(temp) + " °F");
            case 5 -> System.out.println(temp + " K = " + KelvinVersFarenheit(temp) + " °F");
            case 6 -> System.out.println(temp + "°F = " + FarenheitVersKelvin(temp) + " K");
            default -> System.out.println("Erreur : choix invalide (doit être entre 1 et 6).");
        }

        sc.close();
    }
}
