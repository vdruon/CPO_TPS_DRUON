/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_druon_version_console;

import java.util.Random;


/**
 *
 * @author vdruo
 */
public class GrilleDeCellules {
    
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    
    /**
     * Créé une grille de dimensions choisie en paramètre, et créé les cellules à l'intérieur de la grille
     * @param p_nbLignes le nombre de lignes de la grille
     * @param p_nbColonnes le nombre de colonne de la grille
     */
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        
        matriceCellules = new CelluleLumineuse[p_nbLignes][p_nbColonnes];
        
        for (int i=0 ; i < p_nbLignes ; i++) {
            for (int j=0 ; j < p_nbColonnes ; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    
    @Override
    public String toString() {
        
        // creer la premiere ligne contenant le numero des colonnes 
        String result;
        result = "   |";
        for (int i=1 ; i <= nbColonnes ; i++) {
            result += " " + i + " |";
        }
        
        
        // creer la ligne horiontale qui sépare les lignes
        String ligne_h;
        ligne_h ="\n----";
        for (int i=0 ; i < nbColonnes ; i++) {
            ligne_h += "----";
        }
        result += ligne_h;
        
        result += "\n";
        
        // creer le reste du tableau ligne par ligne
        for (int i=1 ; i <= nbLignes ; i++) {
            
            result += " " + i + " |";
            for (int j=0 ; j < nbColonnes ; j++) {
                
                result += " " + matriceCellules[i-1][j] + " |";
            }
          
        result += ligne_h + "\n";     
        }
        
        return result;
    }
    
    
    /**
     * active toutes les cellules d'une ligne rentrée en parametre 
     * @param idLigne n° de la ligne à activer
     */
    public void activerLigneDeCellules(int idLigne) {
         
        for (int i=0 ; i < nbColonnes ; i++) {
            matriceCellules[idLigne][i].activerCellule();
        }
    }
    
    /**
     * active toutes les cellules d'une colonne rentrée en parametre
     * @param idColonne n° de la colonne à activer
     */
    public void activerColonneDeCellules(int idColonne) {
         
        for (int i=0 ; i < nbLignes ; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
    
    /**
     * active les cellules de la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante() {
        for (int i=0 ; i < nbLignes ; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }
    
    /**
     * active les cellules de la diagonale descendante de la grille
     */
    public void activerDiagonaleMontante() {
        for (int i=0 ; i < nbLignes ; i++) {
            matriceCellules[nbLignes-1-i][i].activerCellule();
        }
    }
    
    /**
     * Active aléatoirement les cellules d'une ligne, d'une colonne ou d'une diagonale sur la grille
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random generateurAleat = new Random();
        int a = generateurAleat.nextInt(4);
        int b = generateurAleat.nextInt(nbLignes);
        int c = generateurAleat.nextInt(nbColonnes);
                
        switch (a) {
            case 0 : 
                activerLigneDeCellules(b);
                break;
            case 1 :
                activerColonneDeCellules(c);
                break;
            case 2 :
                activerDiagonaleDescendante();
                break;
            case 3 :
                activerDiagonaleMontante();
                break;   
        }
    }
    
    /**
     * Mélange la grille de jeu grace à la fonction activerLigneColonneOuDiagonaleAleatoire()
     * @param nbTours nombre de fois que l'on veut mélanger la grille 
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i=0 ; i < nbTours ; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
     * Eteins toutes les cellules de la grille 
     */
    public void eteindreToutesLesCellules() {
        for (int i=0 ; i<nbLignes ; i++) {
            for (int j=0 ; j<nbColonnes ; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    /**
     * Cette fonction vérifie si toutes les cellules de la grille sont éteintes
     * @return true si toutes les cellules sont eteintes, false le cas contraire
     */
    public boolean cellulesToutesEteintes() {
        boolean rep = true ;
        
        for (int i=0 ; i<nbLignes ; i++) {
            for (int j=0 ; j<nbColonnes ; j++) {
                if (matriceCellules[i][j].estEteint()==false) {
                    rep = false;
                }
            }
        }
        return rep;
    }
    
    
    
}
