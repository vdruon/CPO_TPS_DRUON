/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_console_druon;

/**
 *
 * @author vdruo
 */
public class TP4_console_DRUON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Joueur j1 = new Joueur("Victor");
        Joueur j2 = new Joueur("Alex");
        Partie p = new Partie(j1, j2);
        p.initialiserPartie();
        p.lancerPartie();
        

                
                
        
    }
    
}
