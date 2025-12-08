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

}
