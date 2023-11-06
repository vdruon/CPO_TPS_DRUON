/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_druon_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author vdruo
 */
public class CelluleGraphique extends JButton {
        
    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee; 
        
        
    // constructeur (appelé depuis FenetrePrincipale)
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
    }
 
 
    // Methode gérant le dessin de la cellule 
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        if (celluleLumineuseAssociee.getEtat()==1){
            g.setColor(Color.green);
        } else if (celluleLumineuseAssociee.getEtat()==2){
            g.setColor(Color.red);
        } else if (celluleLumineuseAssociee.getEtat()==3) {
            g.setColor(Color.yellow);
        } else {
            g.setColor(Color.blue);
        }
        
        g.fillOval(7, 7, 35, 35);
         
        //this.setText(celluleLumineuseAssociee.toString());
    }
}
    
  