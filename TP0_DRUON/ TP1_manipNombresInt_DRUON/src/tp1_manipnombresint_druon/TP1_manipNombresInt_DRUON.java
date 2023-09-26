/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_druon;

import java.util.Scanner;

/**
 *DRUON Victor
 * TDA
 * 26/09/2023
 * @author vdruo
 */
public class TP1_manipNombresInt_DRUON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // création des deux variables pour stocker les valeurs
        int nombre1;
        int nombre2;
        
        // programme pour demander la valeur à l'utilisateur
        Scanner sc = new Scanner(System.in);
        //demander la valeur du nombre 1 puis l'affecter
        System.out.println("entrer la valeur du nombre 1");
        nombre1 = sc.nextInt();
        //idem pour le nombre 2
        System.out.println("entrer la valeur du nombre 2");
        nombre2 = sc.nextInt();
        
        // afficher le résultat des opérations "+" "-" "*"
        System.out.println("la somme des deux nombres est " + (nombre1+nombre2) + "\nla difference des deux nombres est " + (nombre1-nombre2) + "\nle produit des deux nombres est " + (nombre1*nombre2) );
       
        // afficher le résultat du quotient et du reste de la division euclidienne entre le premier et le deuxieme nombre
        System.out.println("le quotient de la division euclidienne de " + nombre1 + " et de " + nombre2 + " est " + (nombre1/nombre2) + "\nle reste de cette dividion euclidienne est " + (nombre1%nombre2));
        
    }
    
}
