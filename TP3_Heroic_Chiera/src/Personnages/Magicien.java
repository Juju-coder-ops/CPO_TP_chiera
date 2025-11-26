/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
/**
 *
 * @author julie
 */
public class Magicien extends Personnage {

    private boolean confirme;
    public static int nbMag = 0;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMag++;
    }

    public int nbArmesPredilection() {
        int c = 0;
        for (Arme a : inventaire) if (a instanceof Baton) c++;
        return c;
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
    
    @Override
    public void attaquer(Personnage p) {
        int degats;

        if (armeEnMain == null) {
            degats = 20;
        } else {
            degats = armeEnMain.getNiveauAttaque();

            if (armeEnMain instanceof Baton) {
                Baton b = (Baton) armeEnMain;
                degats *= b.getAge();
                seFatiguer();
            }
        }

        if (confirme) degats /= 2;

        p.estAttaque(degats);
    }
}