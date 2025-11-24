/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author louis
 */
public abstract class Personnage {
Arme armeActuelle = null;
String nom;
int pv;

static int nbPersonnages = 0;
    public Personnage(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
        nbPersonnages++;  
    }

    public static int getNbPersonnages() {
        return nbPersonnages;
    }

ArrayList<Arme> tabA = new ArrayList<>(); 
public void ajouterArme(Arme A) {
  
int capaciteMax = 5;

if (tabA.size()<capaciteMax){
    tabA.add(A);
}else{
System.out.println("Impossible : tableau plein !");
}}

public void equiperArme(Arme nomArme){
    for(Arme A: tabA){
        if (A == nomArme){
        armeActuelle = nomArme;   
        }
    }
}

    public Arme getArmeActuelle() {
        return armeActuelle;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", pv=" + pv + ", arme en main=" + armeActuelle + '}';
    }
}


