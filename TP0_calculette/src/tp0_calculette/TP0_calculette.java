/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1)add");
        System.out.println("2)sub");
        System.out.println("3)multiply");
        System.out.println("4)divide");
        System.out.println("5)modulo");
        
        Scanner sc = new Scanner(System.in); 
        int operateur=0;
        operateur=sc.nextInt();
    }
    
}
