/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_druon_version_console;

/**
 *
 * @author vdruon
 */
public class CelluleLumineuse {
    
    
    private int etat;
    String ANSI_RESET = "\u001B[0m";    
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    
    public CelluleLumineuse() {
        this.etat = 1;
    }
    
    /**
     * Change l'�tat de la cellule 
     */
    public void activerCellule(int diff) {
        if (diff==1) {
            if (etat == 1) {
                etat=2;
            } else if (etat==2) {
                etat=3;
            } else {
                etat=1;
            }
        } else {
            if (etat == 1) {
                etat=2;
            } else {
                etat=1;
            }
        }
    }
    
    /**
     * Eteins la cellule si elle est allumée, ne fait rien sinon
     */
    public void eteindreCellule() {
        if (etat == 2 || etat==3) {
            etat=1;
        }
    }
    
    /**
     *Retourne l'etat de la cellule
     * 
     * @return true si la cellule est éteinte, false sinon
     */
    public boolean estEteint() {
        if (etat==1) {
            return true;
        } else {
            return false;
        }
    }

    
    /**
     * Retourne l'etat de la cellule 
     * 
     * @return etat
     */
    public int getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        if (etat == 2) {
            return ANSI_RED + "X" + ANSI_RESET;
        } else if (etat == 1) {
            return ANSI_GREEN + "O" + ANSI_RESET;
        } else {
            return ANSI_YELLOW + "I" + ANSI_RESET;
        }
    }
    
    
    
    
    
    
}
