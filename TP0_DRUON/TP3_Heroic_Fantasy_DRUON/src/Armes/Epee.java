/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author vdruo
 */
public class Epee extends Arme {
    
    int indice;

    public Epee(String unNom, int unNivAttack, int unIndice) {
        super(unNom, unNivAttack);
        
        if (unIndice < 0) {
            this.indice = 0;
        } else if (unIndice > 100) {
            this.indice = 100;
        } else {
            this.indice = unIndice ;
        }
    }
    
 
    
    
    
}
