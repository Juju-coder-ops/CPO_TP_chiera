package tp2_bieres_chiera.escoffier;

/**
 * Classe représentant une bouteille de bière.
 * auteur juliette
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + 
        " degrés)\nBrasserie : " + brasserie);
    }
}
