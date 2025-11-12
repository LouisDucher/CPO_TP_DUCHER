/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_ducher;

/**
 *
 * @author louis
 */
public abstract class Arme {
    
    String nom;
    int niveauDattaque;

    public Arme(String nom, int niveauDattaque) {
        this.nom = nom;
        this.niveauDattaque = Math.min(niveauDattaque, 100);
    }
    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauDattaque;
    }
@Override
    public String toString() {
        return nom + " (Attaque : " + niveauDattaque + ")";
    }    
}
