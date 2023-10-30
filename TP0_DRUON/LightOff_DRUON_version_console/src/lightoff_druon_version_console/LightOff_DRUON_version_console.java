/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_druon_version_console;

import java.util.Scanner;

/**
 *
 * @author vdruo
 */
public class LightOff_DRUON_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
    Scanner sc = new Scanner(System.in); 
    System.out.println("Combien de lignes voulez-vous ?");
    int n_lignes = sc.nextInt();
    System.out.println("\nCombien de colonnes voulez-vous ?");
    int n_colonnes = sc.nextInt();
    System.out.println("\nQuelle dificulté voulez-vous ? 0 pour NORMAL(2 couleurs), 1 pour DIFFICILE(3 couleurs)");
    int diff = sc.nextInt();
    Partie p1 = new Partie(n_lignes,n_colonnes, diff);
    
    p1.lancerPartie();
    
    }
    
}
