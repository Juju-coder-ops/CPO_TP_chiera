/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author julie
 */
public class Magicien extends Personnage {

    private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }

    @Override
    public String toString() {
        return super.toString() + " | Magicien (confirmé=" + confirme + ")";
    }
}