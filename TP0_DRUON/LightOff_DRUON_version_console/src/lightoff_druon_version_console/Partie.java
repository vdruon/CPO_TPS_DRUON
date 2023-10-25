/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_druon_version_console;

import java.util.Scanner;

/**
 *
 * @author vdruo
 */
public class Partie {
    
    GrilleDeCellules grille;
    int nbCoups;

    /**
     *crée une nouvelle instance de la grille de cellules lumineuses
     * @param p_nbLignes nombre de lignes de la grille
     * @param p_nbColonnes nombre de colonnes de la grille
     */
    public Partie(int p_nbLignes, int p_nbColonnes) {
        grille = new GrilleDeCellules(p_nbLignes, p_nbColonnes);
        nbCoups = 0;
    }
    
    /**
     * mélange la grille de jeu pour initialiser la partie
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(50);
    }
    
    /**
     * permet de jouer au jeu, appelez cette fonction et tout se fera automatiquement 
     */
    public void lancerPartie() {
        
    initialiserPartie();
    System.out.println(grille);
    
    while (grille.cellulesToutesEteintes()==false) {
        
        
        // demander au joueur de saisir un coup
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel coup voulez-vous jouez ? \nSous la forme : (ligne ou colonne ou diagonal) et numero (ex: c1 pour colonne 1) ");                
        String rep = sc.next();    
        int indice = rep.charAt(1) -'0';
        
        // activer la ligne, la colonne ou la diagonale correspondante
        switch (rep.charAt(0)) {
            case 'l' :
                grille.activerLigneDeCellules(indice-1);
                break;
                 
            case 'c' :
                grille.activerColonneDeCellules(indice-1);
                break;
                
            case 'd' :
                if (indice == 1) {
                    grille.activerDiagonaleMontante();
                } else {
                    grille.activerDiagonaleDescendante();
                }
                break; 
        }
        
        
        // incrémenter le nombre de coups
        nbCoups += 1;
        
        // afficher la nouvelle grille
        System.out.println(grille);
    }
     
    // fin du jeu, afficher le nombre de coups
    System.out.println("\n Felicitations, vous avez termine le jeu TERMINATOR en " + nbCoups + " coups !");
        
    } 
    
    
    
}
