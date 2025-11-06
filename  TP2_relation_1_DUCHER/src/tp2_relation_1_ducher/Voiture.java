/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_ducher;

/**
 *
 * @author louis
 */
public class Voiture {
    String modele;
    String marque;
    int nbPlaces;
    Personne proprietaire; // initialisé à null dans le constructeur

    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
        this.proprietaire = null; // pas de propriétaire au départ
    }

    @Override
    public String toString() {
        String prop = (proprietaire != null) ? proprietaire.nom : "aucun";
        return marque + " " + modele + " (" + nbPlaces + " places) - Propriétaire: " + prop;
    }
}
