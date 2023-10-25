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
    
    
    private boolean etat;

    
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     * Change l'état de la cellule 
     */
    public void activerCellule() {
        if (etat == true) {
            etat=false;
        } else {
            etat=true;
        }
    }
    
    /**
     * Eteins la cellule si elle est allumée, ne fait rien sinon
     */
    public void eteindreCellule() {
        if (etat == true) {
            etat=false;
        }
    }
    
    /**
     *Retourne l'etat de la cellule
     * 
     * @return true si la cellule est éteinte, false sinon
     */
    public boolean estEteint() {
        if (etat==true) {
            return false;
        } else {
            return true;
        }
    }

    
    /**
     * Retourne l'etat de la cellule 
     * 
     * @return etat
     */
    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        if (etat == true) {
            return "X";
        } else {
            return "O";
        }
    }
    
    
    
    
    
    
}
