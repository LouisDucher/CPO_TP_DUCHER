/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_ducher;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_stats_DUCHER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] faces = new int[6]; 

        System.out.print("Combien de fois souhaitez-vous lancer le de ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6); 
            faces[tirage]++; 
        }

        System.out.println("\nResultats des lancers :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois");
        }

        System.out.println("\nResultats en pourcentage :");
        for (int i = 0; i < faces.length; i++) {
            double pourcentage = ((double) faces[i] / m) * 100;
            System.out.printf("Face %d : %.2f %%\n", (i + 1), pourcentage);
        }

        sc.close();
    }
}

