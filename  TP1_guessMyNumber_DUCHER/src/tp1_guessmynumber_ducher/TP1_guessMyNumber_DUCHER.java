/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_ducher;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_guessMyNumber_DUCHER {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("=== JEU DU NOMBRE MYSTÈRE ===");
        System.out.println("Choisissez un niveau de difficulte :");
        System.out.println("1 - Facile (0 a 50, nombre illimite d essais)");
        System.out.println("2 - Normal (0 a 100, 10 essais maximum)");
        System.out.println("3 - Difficile (0 a 500, 7 essais maximum)");
        System.out.print("Votre choix : ");
        int choix = sc.nextInt();

        int max = 100;   
        int essaisMax = 10;    
        boolean limiteEssais = true;

        switch (choix) {
            case 1:
                max = 50;
                limiteEssais = false;
                break;
            case 2:
                max = 100;
                essaisMax = 10;
                limiteEssais = true;
                break;
            case 3:
                max = 500;
                essaisMax = 7;
                limiteEssais = true;
                break;
            default:
                System.out.println("Choix invalide, mode normal activé par défaut.");
        }

        // Génération du nombre mystère
        int nombreMystere = generateurAleat.nextInt(max + 1);

        System.out.println("\nJ ai choisi un nombre entre 0 et " + max + ". A vous de le deviner !");
        if (limiteEssais) {
            System.out.println("(Vous avez " + essaisMax + " essais maximum)");
        }

        int tentative;
        int compteur = 0;
        boolean gagne = false;

        // Boucle principale du jeu
        while (true) {
            System.out.print("\nEntrez un nombre : ");
            tentative = sc.nextInt();
            compteur++;

            if (tentative == nombreMystere) {
                System.out.println("🎉 Gagne ! Le nombre mystere était bien " + nombreMystere + ".");
                System.out.println("Vous avez trouve en " + compteur + " tentative(s).");
                gagne = true;
                break;
            } else if (tentative < nombreMystere) {
                int ecart = nombreMystere - tentative;
                if (ecart > 50) {
                    System.out.println("➡️ Vraiment trop petit !");
                } else {
                    System.out.println("⬆️ Trop petit !");
                }
            } else {
                int ecart = tentative - nombreMystere;
                if (ecart > 50) {
                    System.out.println("⬇️ Vraiment trop grand !");
                } else {
                    System.out.println("⬇️ Trop grand !");
                }
            }

            if (limiteEssais && compteur >= essaisMax) {
                System.out.println("\n❌ Vous avez épuise vos essais !");
                System.out.println("Le nombre mystere était : " + nombreMystere);
                break;
            }
        }

        if (!gagne && !limiteEssais) {
            System.out.println("Fin du jeu. Le nombre mystere était : " + nombreMystere);
        }

        sc.close();
    }
}
