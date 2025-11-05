/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_ducher;

/**
 *
 * @author louis
 */
public class TP2_manip_DUCHER {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;

        System.out.println("Avant echange :");
        System.out.println("nb de calories de Assiette 1 " + assiette1.nbCalories );
        System.out.println("nb de calories de Assiette 2 " + assiette2.nbCalories );

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nApres echange :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        int[] tableau = new int[10];
        Moussaka assietteA = new Moussaka(100);
        tableau[0] = assietteA.nbCalories;
        Moussaka assietteB = new Moussaka(200);
        tableau[1] = assietteB.nbCalories;
        Moussaka assietteC = new Moussaka(300);
        tableau[2] = assietteC.nbCalories;
        Moussaka assietteD = new Moussaka(400);
        tableau[3] = assietteD.nbCalories;
        Moussaka assietteE = new Moussaka(500);
        tableau[4] = assietteE.nbCalories;
        Moussaka assietteF = new Moussaka(600);
        tableau[5] = assietteF.nbCalories;
        Moussaka assietteG = new Moussaka(700);
        tableau[6] = assietteG.nbCalories;
        Moussaka assietteH = new Moussaka(800);
        tableau[7] = assietteH.nbCalories;
        Moussaka assietteI = new Moussaka(900);
        tableau[8] = assietteI.nbCalories;
        Moussaka assietteJ = new Moussaka(1000);
        tableau[9] = assietteJ.nbCalories;
    }
}