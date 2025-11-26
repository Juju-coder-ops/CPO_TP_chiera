/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author julie
 */
public abstract class Personnage {

    protected String nom;
    protected int niveauVie;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    @Override
    public String toString() {
        return nom + " (vie=" + niveauVie + ")";
    }
}
