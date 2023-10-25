/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author vdruo
 */
public class Magicien extends Personnage {
   
    boolean confirme;

    public Magicien (String unNom, int unNivVie, boolean Confirme) {
        super(unNom, unNivVie);
        
        confirme = Confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    
    
    
    
}
