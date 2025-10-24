/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_ducher;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP1_manipNombresInt_DUCHER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxieme entier : ");
        int b = sc.nextInt();

        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La difference des deux nombres est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);
        if (b != 0) {
            int quotient = a / b;
            int reste = a % b;
            System.out.println("Le quotient entier de " + a + " par " + b + " est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("La division par zéro est impossible !");
        sc.close();
    }
    }   
}
