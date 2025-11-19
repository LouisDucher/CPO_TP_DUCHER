/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_ducher;

/**
 *
 * @author louis
 */
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import java.util.ArrayList;
import Armes.*;
import Armes.Baton;
import Armes.Epee;
import  Personnages .*;

import Armes.Arme;
public class TP3_Heroic_Fantasy_DUCHER {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    Epee e1 = new Epee(7 ,"excallibur", 5);
    Epee e2 = new Epee(4 ,"durandal", 7);
    Baton b1 = new Baton(4 ,"chene", 5);
    Baton b2 = new Baton(5 ,"charme", 6);
    
     ArrayList<Arme> armes = new ArrayList<>();

        armes.add(e1);
        armes.add(e2);
        armes.add(b1);
        armes.add(b2);
        
        int tailleDearmes = armes.size();
            System.out.println(tailleDearmes);
        for (Arme a : armes) {
            System.out.println(a);
            
        
        }
    Magicien Gandalf = new Magicien("Gandalf",65,true);
    Magicien Garcimore = new Magicien("Garcimore",44,false);
    
    Guerrier Conan = new Guerrier ( "Conan", 78,false);
    Guerrier Lannister = new Guerrier( "Lannister", 45,true);
    
    ArrayList<Personnage> personnages = new ArrayList<>();
       
    personnages.add(Gandalf);
    personnages.add(Garcimore);
    personnages.add(Conan);
    personnages.add(Lannister);
    
    int t = personnages.size();
            System.out.println(tailleDearmes);
        for (Personnage b : personnages) {
            System.out.println(b);
    }
    }

}
