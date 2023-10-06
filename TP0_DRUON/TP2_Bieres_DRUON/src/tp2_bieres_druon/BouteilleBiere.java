/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_druon;

/**
 *
 * @author vdruo
 */
public class BouteilleBiere {

    //
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    //creation du constructeur
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {

        // completons les différents attributs de la classe
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    // creation de la premiere methode de la classe, qui ne renvoie rien (void) mais affiche les informations de la bouteilles (attributs de la classe)
    public void lireEtiquette() {

        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie);
    }

    // creation de la methode décapsuler
    public boolean Decapsuler() {

        //si la biere n'est pas ouverte 
        if (ouverte == false) {
            ouverte = true;
            return true;
        } //si la biere est deja ouverte
        else {
            System.out.println("erreur : biere deja ouverte");
            return false;
        }
    }

    // redifinissons la methode toString
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? "; 
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }

}
