/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author vdruo
 */
public class Baton extends Arme {
    
    int age;

    public Baton(String unNom, int unNivAttack, int unAge) {
        super(unNom, unNivAttack);
        
        if (unAge < 0) {
            this.age = 0;
        } else if (unAge > 100) {
            this.age = 100;
        } else {
            this.age = unAge ;
        }
    }
    
    
    
}
