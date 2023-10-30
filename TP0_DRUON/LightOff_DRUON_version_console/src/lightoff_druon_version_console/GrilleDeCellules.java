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
    int difficulte;

    
    /**
     * Créé une grille de dimensions choisie en paramètre, et créé les cellules à l'intérieur de la grille
     * @param p_nbLignes le nombre de lignes de la grille
     * @param p_nbColonnes le nombre de colonne de la grille
     */
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes, int diffuclte) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.difficulte = diffuclte;
        
        matriceCellules = new CelluleLumineuse[p_nbLignes][p_nbColonnes];
        
        for (int i=0 ; i < p_nbLignes ; i++) {
            for (int j=0 ; j < p_nbColonnes ; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public String ligne_h() {
        // creer la ligne horiontale qui sÃ©pare les lignes
        String ligne_h;
        ligne_h ="\n----";
        for (int i=0 ; i < nbColonnes ; i++) {
            ligne_h += "----";
        }
        return ligne_h;
    }
    
    
    @Override
    public String toString() {
        
        // creer la premiere ligne contenant le numero des colonnes 
        String result;
        result = "   |";
        for (int i=1 ; i <= nbColonnes ; i++) {
            result += " " + i + " |";
        }
        
        result += ligne_h();
        
        result += "\n";
        
        // creer le reste du tableau ligne par ligne
        for (int i=1 ; i <= nbLignes ; i++) {
            
            result += " " + i + " |";
            for (int j=0 ; j < nbColonnes ; j++) {
                
                result += " " + matriceCellules[i-1][j] + " |";
            }
          
            result += ligne_h() + "\n";     
        }
        
        
        return result;
    }
    
    
    /**
     * active toutes les cellules d'une ligne rentrée en paramètre 
     * @param idLigne n° de la ligne à activer
     */
    public void activerLigneDeCellules(int idLigne) {
         
        for (int i=0 ; i < nbColonnes ; i++) {
            matriceCellules[idLigne][i].activerCellule(difficulte);
        }
    }
    
    /**
     * active toutes les cellules d'une colonne rentrée en paramètre
     * @param idColonne n° de la colonne à activer
     */
    public void activerColonneDeCellules(int idColonne) {
         
        for (int i=0 ; i < nbLignes ; i++) {
            matriceCellules[i][idColonne].activerCellule(difficulte);
        }
    }
    
    /**
     * active les cellules de la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante() {
        if (nbLignes<nbColonnes){
            for (int i=0 ; i < nbLignes ; i++) {
                matriceCellules[i][i].activerCellule(difficulte);
            }
        } else {
            for (int i=0 ; i < nbColonnes ; i++) {
                matriceCellules[i][i].activerCellule(difficulte);
            }
        }
    }
    
    /**
     * active les cellules de la diagonale descendante de la grille
     */
    public void activerDiagonaleMontante() {
        if (nbLignes<nbColonnes) {
            for (int i=0 ; i < nbLignes ; i++) {
                matriceCellules[nbLignes-1-i][i].activerCellule(difficulte);
            }
        } else {
            for (int i=0 ; i < nbColonnes ; i++) {
                matriceCellules[nbLignes-1-i][i].activerCellule(difficulte);
            }
        }
    }
    
    /**
     * Active aléatoirement les cellules d'une ligne, d'une colonne ou d'une diagonale sur la grille
     */
     void activerLigneColonneOuDiagonaleAleatoire() {
        Random generateurAleat = new Random();
        int a = generateurAleat.nextInt(4);
        int b = generateurAleat.nextInt(nbLignes);
        int c = generateurAleat.nextInt(nbColonnes);
                
        switch (a) {
            case 0 : 
                activerLigneDeCellules(b);
                activerDiagonaleDescendante();
                break;
            case 1 :
                activerColonneDeCellules(c);
                activerDiagonaleDescendante();
                break;
            case 2 :
                activerDiagonaleMontante();
                activerLigneDeCellules(b);
                break;
            case 3 :
                activerColonneDeCellules(c);
                activerDiagonaleMontante();
                break;   
        }
    }
    
    /**
     * Mélange la grille de jeu grace à la fonction activerLigneColonneOuDiagonaleAleatoire()
     * @param nbTours nombre de fois que l'on veut mélanger la grille 
     */
    public void melangerMatriceAleatoirement() {
        eteindreToutesLesCellules();
        for (int i=0 ; i < 10 ; i++) {
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
     * @return true si toutes les cellules sont éteintes, false le cas contraire
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
