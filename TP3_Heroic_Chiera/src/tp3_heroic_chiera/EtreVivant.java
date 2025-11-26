/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tp3_heroic_chiera;

/**
 *
 * @author julie
 */
public interface EtreVivant {
    public void seFatiguer();          // perd de la vie
    public boolean estVivant();        // renvoie vrai si la vie > 0
    public void estAttaque(int points); // perd des points quand attaqué
}
