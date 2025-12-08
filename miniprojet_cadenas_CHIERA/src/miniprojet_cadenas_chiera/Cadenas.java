/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_chiera;

/**
 *
 * @author julie
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cadenas {

    //ATTRIBUTS (l'état du jeu)

    private String secret;      
    private int longueur;          
    private int maxTentatives;     
    private int tentativeCourante;  
    public enum Etat { EN_COURS, GAGNE, PERDU }
    private Etat etat;
    private List<Essai> historique;

    //CONSTRUCTEUR

    public Cadenas(int longueur, int maxTentatives) {

        this.longueur = longueur;            // ex : 4
        this.maxTentatives = maxTentatives;  // ex : 10
        this.historique = new ArrayList<>();

        reset(); // démarre une partie
    }

    //REINITIALISATION

    public void reset() {
        genererSecret();        // génère un nouveau code
        tentativeCourante = 0;
        historique.clear();
        etat = Etat.EN_COURS;
    }

    //GENERATION DU CODE SECRET

    private void genererSecret() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longueur; i++) {
            int chiffre = r.nextInt(10);  // 0 à 9
            sb.append(chiffre);
        }

        secret = sb.toString();

        // ⚠️ Décommenter pour tester :
        // System.out.println("SECRET = " + secret);
    }
    
    //EVALUER
    public Resultat evaluer(String proposition) {

    // 1) si la partie est déjà finie : on ne peut plus jouer
    if (etat != Etat.EN_COURS) {
        throw new IllegalStateException("La partie est terminée");
    }

    // 2) Vérifier longueur valide
    if (proposition == null || proposition.length() != longueur) {
        throw new IllegalArgumentException("Vous devez entrer " + longueur + " chiffres");
    }

    int exact = 0;
    int tropHaut = 0;
    int tropBas = 0;

    // 3) Comparaison chiffre par chiffre
    for (int i = 0; i < longueur; i++) {

        int cProposition = Character.getNumericValue(proposition.charAt(i));
        int cSecret = Character.getNumericValue(secret.charAt(i));

        if (cProposition == cSecret) {
            exact++;
        } else if (cProposition > cSecret) {
            tropHaut++;
        } else {
            tropBas++;
        }
    }

    tentativeCourante++;

    // 4) Mise à jour de l'état
    if (exact == longueur) {
        etat = Etat.GAGNE;
    } else if (tentativeCourante >= maxTentatives) {
        etat = Etat.PERDU;
    }

    // 5) On enregistre dans l'historique
    historique.add(new Essai(proposition, exact, tropHaut, tropBas));

    // 6) Et on renvoie le résultat
    return new Resultat(proposition, exact, tropHaut, tropBas);
}
    //CLASS INTERNES 
    public static class Resultat {
        public final String proposition;
        public final int exact;
        public final int tropHaut;
        public final int tropBas;

        public Resultat(String p, int e, int h, int b) {
            proposition = p;
            exact = e;
            tropHaut = h;
            tropBas = b;
        }
    }
    
    
    public static class Essai {
        public final String proposition;
        public final int exact;
        public final int tropHaut;
        public final int tropBas;

        public Essai(String p, int e, int h, int b) {
            proposition = p;
            exact = e;
            tropHaut = h;
            tropBas = b;
        }
    }
    
    //GETTERS
    
    public Etat getEtat() {
        return etat;
    }

    public int getTentativeCourante() {
        return tentativeCourante;
    }

    public List<Essai> getHistorique() {
        return historique;
    }

}
