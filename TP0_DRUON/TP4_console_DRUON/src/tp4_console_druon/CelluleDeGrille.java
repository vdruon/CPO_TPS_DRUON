/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_console_druon;

/**
 *
 * @author vdruo
 */
public class CelluleDeGrille {
    
    private Jeton jetonCourant;

    /**
     * Constructeur : il initialise la cellule à null
     */
    public CelluleDeGrille() {
        this.jetonCourant = null;
    }
    
    /**
     * Indique si un jeton est présent ou non sur la cellule
     * @return true si oui, false si non
     */
    public boolean presenceJeton() {
        if (jetonCourant == null) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * permet de placer un jeton sur une cellule
     * @param jeton affecte le jeton à la cellule
     */
    public void affecterJeton(Jeton jeton) {
        if (presenceJeton()==false) {
            jetonCourant = jeton;
        }
    }
    
    /**
     * permet d'obtenir la couleur du jeton sur la case
     * @return "jaune", "rouge" ou "vide" 
     */
    public String lireCouleurDuJeton() {
        if (presenceJeton()==false) {
            return "vide";
        } else {
            return jetonCourant.lireCouleur();
        }
    }

    @Override
    public String toString() {
        
        if (presenceJeton()){
            return "" + jetonCourant;
        } else {
           return  " ";
        }
    }

    
    
    
    
    
    
}
