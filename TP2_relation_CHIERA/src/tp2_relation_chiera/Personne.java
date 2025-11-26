package tp2_relation_chiera;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julie
 */
public class Personne {
    public String prenom;
    public String nom;
    public int nbVoitures;
    public Voiture[] liste_voitures;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // réserver la mémoire pour au plus 3 voitures
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (possede " + nbVoitures + " voiture(s))";
    }

    /**
     * Tente d'ajouter la voiture à cette personne.
     * Retourne true si ajouté, false sinon (déjà propriétaire ou plein).
     */
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // vérifie si la voiture a déjà un propriétaire
        if (voiture_a_ajouter == null) {
            return false;
        }
        if (voiture_a_ajouter.proprietaire != null) {
            // voiture déjà possédée
            return false;
        }
        // vérifie si la personne a déjà 3 voitures
        if (this.nbVoitures >= this.liste_voitures.length) {
            // tableau plein
            return false;
        }
        // insérer à l'indice nbVoitures
        this.liste_voitures[this.nbVoitures] = voiture_a_ajouter;
        // dire à la voiture que son propriétaire est this
        voiture_a_ajouter.proprietaire = this;
        // incrémenter le nombre de voitures
        this.nbVoitures++;
        return true;
    }
}

