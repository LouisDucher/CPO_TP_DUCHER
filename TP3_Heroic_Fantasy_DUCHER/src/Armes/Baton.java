/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import tp3_heroic_fantasy_ducher.Arme;

/**
 *
 * @author louis
 */
public class Baton extends Arme {
    int age;
    

    public Baton(int age, String nom, int niveauDattaque) {
        super(nom, niveauDattaque);
        this.age = Math.min(age, 100);
    }
@Override
    public String toString() {
        return super.toString() + " | Age : " + age;
    }    
}
