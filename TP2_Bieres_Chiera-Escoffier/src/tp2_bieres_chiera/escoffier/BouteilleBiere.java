package tp2_bieres_chiera.escoffier;

/**
 * Classe représentant une bouteille de bière.
 * auteur juliette
 */
public class BouteilleBiere {
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + 
        " degrés)\nBrasserie : " + brasserie);
    }
    public BouteilleBiere(String Nom,float Degre, String Brasserie){
        nom = Nom;
        degreAlcool = Degre;
        brasserie = Brasserie;
        ouverte = false;
    }
        
    public boolean Decapsuler(){
        if (ouverte=true){
           System.out.println("Erreur : bière déjà ouverte !");
           return false;
        }else {
            return true;
        }
    }
      
    @Override
    public String toString() {
        String chaine_a_retourner = nom + " (" + degreAlcool + " degrés) - Ouverte ? ";
        if (ouverte) chaine_a_retourner += "oui";
        else chaine_a_retourner += "non";
        return chaine_a_retourner;
    }
}