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
public class Guerrier extends Personnage {

    private boolean aCheval;
    
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        int nbGuer = 0;
        nbGuer++;
    }
    
    public int nbArmesPredilection() {
        int c = 0;
        for (Arme a : inventaire) if (a instanceof Epee) c++;
        return c;
    }
        
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    public boolean isACheval() {
        return aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + " | Guerrier (à cheval=" + aCheval + ")";
    }
    
    @Override
    public void attaquer(Personnage p) {
        int degats;

        if (armeEnMain == null) {
            degats = 30;
        } else {
            degats = armeEnMain.getNiveauAttaque();

            if (armeEnMain instanceof Epee) {
                Epee e = (Epee) armeEnMain;
                degats *= e.getFinesse();
                seFatiguer();
            }
        }

        if (aCheval) degats /= 2;
        p.estAttaque(degats);
    }
}