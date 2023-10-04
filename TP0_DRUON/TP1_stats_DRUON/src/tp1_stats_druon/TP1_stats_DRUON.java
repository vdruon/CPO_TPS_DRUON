/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_druon;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**DRUON Victor
 * TDA
 * 28/09/2024
 *
 * @author vdruo
 */
public class TP1_stats_DRUON {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // explication des règles
        System.out.println("Vous lancez un des non pipe a 6 faces \nChoisissez le nombre de lancer que vous voulez faire \nLe programme vous retournera a combien de % chacune des faces est sortie");
        
        // création d'un tableau de 6 entiers
        double tab[] = new double [6];
        
        // demader à l'utilisateur de choisir le nombre de lancer
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisier le nombre de lancer");
        int m = sc.nextInt();
        
        // création d'une boucle for pour m itérations
        for (int i = 0 ; i <= m ; i++) {
        
          // tirer un nombre aléatoire entre 0 et 5
          Random generateurAleat = new Random();
          int random = generateurAleat.nextInt(6);
          
          
          // incrémenter chaque valeur de "random" dans la case d'indice "random"
          tab[random] += 1; 
        }
        
        // instruction pour n'afficher que 2 chiffres après la virgule (pour des soucis d'esthetique à l'affichage)
        DecimalFormat df = new DecimalFormat("#.##");
        
        
        // afficher le tableau
        for (int i=0 ; i <= 5 ; i++) {
            
            // variable double pour contenir la valeur exact du pourcentage de sortie de la face i
            double valeur_pourcentage = (tab[i]/m)*100;
            // variable pour contenir la valeur avec 2 chiffres après la virgule
            String valeur = df.format(valeur_pourcentage);
            
            
            System.out.println("la face " + (i+1) + " est sortie a " + valeur + "%");
        }
        
}
}
