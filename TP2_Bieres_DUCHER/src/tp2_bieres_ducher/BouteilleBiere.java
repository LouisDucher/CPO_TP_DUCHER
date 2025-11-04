/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_ducher;

/**
 *
 * @author louis
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    void lireEtiquette(){
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ); 
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie)
    { nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false; } 
    void Décapsuler(){
        if (ouverte != false){ 
                ouverte = true;}
                else{
              System.out.println(" erreur : biere déjà ouverte");
              System.out.print(false)   ;
                       }
        }
    }



    

