/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_druon;

/**
 *
 * @author vdruo
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    
    public Personne(String n, String p){
        nom = n;
        prenom = p;
        nbVoitures = 0;
    }
    
    
    @Override
    public String toString () {
    return nom + " " + prenom;
    }
    
    
}
