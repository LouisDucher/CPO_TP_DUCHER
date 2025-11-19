/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author louis
 */
public class Guerrier extends Personnage{
    Boolean Cheval;

    public Guerrier( String nom, int pv, Boolean Cheval) {
        super(nom, pv);
        this.Cheval = Cheval;
    }

    public void setCheval(Boolean Cheval) {
        this.Cheval = Cheval;
    }
    
}
