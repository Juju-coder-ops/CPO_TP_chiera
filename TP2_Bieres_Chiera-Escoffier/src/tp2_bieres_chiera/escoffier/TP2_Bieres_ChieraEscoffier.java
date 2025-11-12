package tp2_bieres_chiera.escoffier;

public class TP2_Bieres_CHIERA {
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere();
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;

        uneBiere.lireEtiquette();
    }
}
