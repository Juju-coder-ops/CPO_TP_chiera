/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julie
 */
public class Voiture {
    public String modele;
    public String marque;
    public int nbPlaces;
    public Personne proprietaire; // la relation: chaque voiture a exactement 1 propriétaire (ou null)

    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
        this.proprietaire = null; // initialisé à null comme demandé
    }

    @Override
    public String toString() {
        String owner = (proprietaire == null) ? "aucun proprietaire" 
                                             : (proprietaire.prenom + " " + proprietaire.nom);
        return modele + " (" + marque + ", " + nbPlaces + " places) - proprietaire: " + owner;
    }
}

