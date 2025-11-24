/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author louis
 */
public class Magicien extends Personnage{
  boolean confirme;
  static int nbMagicien=0;

    public Magicien( String nom, int pv, boolean confirme) {
        super(nom, pv);
        this.confirme = confirme;
        nbMagicien++;
    }

    public static int getNbMagicien() {
        return nbMagicien;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
  
}
