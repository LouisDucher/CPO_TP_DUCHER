/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_ducher;

/**
 *
 * @author louis
 */
public class Epee extends Arme {
    int finesse;
    public Epee(String nom, int niveauDattaque) {
        super(nom, niveauDattaque);
    }

    public Epee(int finesse, String nom, int niveauDattaque) {
        super(nom, niveauDattaque);
        this.finesse = Math.min(finesse, 99);
    }
 @Override
    public String toString() {
        return super.toString() + " | Finesse : " + finesse;
    }   
  
}
