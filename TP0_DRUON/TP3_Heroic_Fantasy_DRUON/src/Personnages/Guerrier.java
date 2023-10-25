/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author vdruo
 */
public class Guerrier extends Personnage {
    
    boolean aCheval ;

    public Guerrier(String name, int nivVie , boolean aCheval) {
        super(name, nivVie);
        this.aCheval = aCheval;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    
    
    
    
}
