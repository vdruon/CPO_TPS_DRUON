/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author vdruo
 */
public abstract class Arme {
    
    String name;
    int nivAttack;
    
    
    public Arme(String unNom , int unNivAttack) {
        name = unNom;
        if (unNivAttack < 0) {
        nivAttack = 0;
        } else if (unNivAttack > 100) {
            nivAttack = 100;
        } else {
            nivAttack = unNivAttack ;
        }
    }
    
   
    public int get_nivAttack() {
        return nivAttack;
    }
    
    @Override
    public String toString () {
    return "nom de l'arme : "+ name + "\nniveau d'attaque : " + nivAttack;
    }
    
    
}
