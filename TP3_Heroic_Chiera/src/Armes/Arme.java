/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author julie
 */
public class Arme {
    protected String nom;
    protected int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return nom + " (attaque=" + niveauAttaque + ")";
    }
}
