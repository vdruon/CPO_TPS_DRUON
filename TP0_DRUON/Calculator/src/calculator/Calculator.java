/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author vdruo
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator : \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        int result;
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n entrer le nombre :");
        operateur = sc.nextInt();

        int operande1;
        System.out.println("\n entrer une première valeur :");
        operande1 = sc.nextInt();

        int operande2;
        System.out.println("\n entrer une deuxième valeur :");
        operande2 = sc.nextInt();

        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                System.out.println("Le resultat est " + result);
                break;
            case 2:
                result = operande1 - operande2;
                System.out.println("Le resultat est " + result);
                break;
            case 3:
                result = operande1 * operande2;
                System.out.println("Le resultat est " + result);
                break;
            case 4:
                result = operande1 / operande2;
                System.out.println("Le resultat est " + result);
                break;
            case 5:
                result = operande1 % operande2;
                System.out.println("Le resultat est " + result);
                break;
            default:
                System.out.println("opérateur inconue");
                break;
        }

    }
}
