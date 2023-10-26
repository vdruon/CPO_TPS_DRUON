/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_console_druon;

import java.util.ArrayList;

/**
 *
 * @author vdruo
 */
public class Joueur {
    
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons; 

    
    /**
     * permet d'obtenir le nom du joueur
     * @return le nom du joueur
     */
    public String getNom() {
        return nom;
    }
    

    

    /**
     * constructeur, initialise le nom du joueur et ses jetons
     * @param nom nom de l'utilisateur
     */
    public Joueur(String nom) {
        this.nom = nom;
        reserveJetons = new ArrayList<Jeton>();
    }
    
    /**
     * affecte une couleur au joueur
     * @param color couleur à affecter
     */
    public void affecterCouleur(String color) {
        couleur = color;
    }
    
    /**
     * renvoie la couleur du joueur
     * @return "jaune" ou "rouge"
     */
    public String lireCouleur() {
        return couleur;
    }
    
    /**
     * renvoie le nombre de jetons que le joueur dispose
     * @return un nombre de jetons
     */
    public int nombreDeJetons() {
        return reserveJetons.size();
    }
    
    /**
     * ajoute un jeton passer en paramètre
     * @param jeton jeton du joueur
     */
    public void ajouterJeton(Jeton jeton) {
        reserveJetons.add(jeton);
    }
    
    
    public Jeton jouerJeton() {
        Jeton j = reserveJetons.get(0);
        reserveJetons.remove(0);
        return j;
    }
    
}
