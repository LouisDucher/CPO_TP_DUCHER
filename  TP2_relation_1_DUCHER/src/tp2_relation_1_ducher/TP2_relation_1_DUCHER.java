/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_ducher;

/**
 *
 * @author louis
 */
public class TP2_relation_1_DUCHER {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // Création des voitures
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création des personnes
        Personne bob = new Personne("Sixkiller", "Bobby");
        Personne reno = new Personne("Raines", "Reno");

        // Affichage des voitures disponibles
        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        // Ajout de relations
        bob.ajouter_voiture(uneClio);       // Bob possède une Clio
        bob.ajouter_voiture(uneAutreClio);  // Bob possède une seconde Clio
        reno.ajouter_voiture(une2008);      // Reno possède une 2008
        reno.ajouter_voiture(uneMicra);     // Reno possède une Micra

        // Vérification des relations
        System.out.println("\nInformations sur Bob :");
        System.out.println(bob);

        System.out.println("Informations sur Reno :");
        System.out.println(reno);

        // Accéder directement à la première voiture de Bob
        System.out.println("La première voiture de Bob est : " + bob.liste_voitures[0]);
    }
}