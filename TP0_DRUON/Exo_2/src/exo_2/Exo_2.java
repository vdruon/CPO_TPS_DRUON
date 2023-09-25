/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo_2;

import java.util.Scanner;

/**
 *
 * @author vdruo
 */
public class Exo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaration des variables
        int nb;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n entrer le nombre :");
        nb = sc.nextInt();
        int result;
        int ind;
        result = 0;

        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind = ind + 1;
        }
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }

}
