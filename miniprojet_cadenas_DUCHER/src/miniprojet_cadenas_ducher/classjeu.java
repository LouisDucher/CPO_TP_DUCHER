/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_ducher;

/**
 *
 * @author louis
 */
public class classjeu {

               
    
    int exact = 0;
    int tropHaut = 0;
    int tropBas = 0;
    

   
    public classjeu() {
        genererCombinaison();}
    
    public int[] solution = new int[4]; 

  
    public void genererCombinaison() {
        for (int i = 0; i < 4; i++) {
            solution[i] = (int)(Math.random() * 10); 
        }
    }
 
}
