/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_ducher;

/**
 *
 * @author louis
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // max 3 voitures
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            // voiture déjà possédée
            return false;
        }
        if (nbVoitures >= 3) {
            // tableau plein
            return false;
        }
        // ajout possible
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this; // this = cette personne
        return true;
    }

    @Override
    public String toString() {
        String s = prenom + " " + nom + " possède " + nbVoitures + " voiture(s) :\n";
        for (int i = 0; i < nbVoitures; i++) {
            s += "  - " + liste_voitures[i].marque + " " + liste_voitures[i].modele + "\n";
        }
        return s;
    }
}
