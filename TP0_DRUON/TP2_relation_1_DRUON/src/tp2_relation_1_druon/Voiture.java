/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_druon;

/**
 *
 * @author vdruo
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String mod, String marq, int puiss) {
        Modele = mod;
        Marque = marq;
        PuissanceCV = puiss;
        Proprietaire = null;
    }
   
    @Override
    public String toString () {
    return Marque +" " + Modele + " " + PuissanceCV;
    }
    
}
