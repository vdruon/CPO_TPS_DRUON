/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_druon;

import java.util.Scanner;

/**
 *
 * @author vdruo
 */
public class TP2_convertisseurObjet_DRUON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creons un nouvel objet de type convertisseur
        Convertisseur Objet1 = new Convertisseur();
        
        Objet1.CelciusVersFarenheit(458);
        Objet1.FarenheitVersCelcius(458);
        System.out.println(Objet1);
        
        //creons un autre objet
        Convertisseur Objet2 = new Convertisseur();
        
        Objet2.KelvinVersFarenheit(521);
        Objet2.CelciusVersKelvin(485);
        Objet2.FarenheitVersKelvin(854);
        System.out.println(Objet2);
        
        
        // creons un objet convertisseur pour l'utilisateur
        Convertisseur userObject = new Convertisseur();
        
        // creation de la variable float qui contiendra la temperature de l'utilisateur
        float Temp1;
        
        // demander la valeur que l'utilisateur veut rentrer, et l'assigner à Temp1
        Scanner sc =new Scanner(System.in);
        System.out.println("entrer la temperature");
        Temp1 = sc.nextFloat();
        
        //proposer à l'utilisateur la convertion qu'il souhaite faire
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1) De Celsius vers Kelvin \n2) De Kelvin vers Celsius \n3) De Farenheit vers Celsius \n4) De Celsius vers Farenheit \n5) De Kelvin en Farenheit \n6) De Farenheit vers Kelvin");
        int nConvertion = sc.nextInt();
        
        
        //appliquer chaque convertion à sa methode, à l'aide de "switch", l'équivalent de if en plus simple je trouve, en fonction de ce que l'utilisateur souhaite
        switch (nConvertion) {
            case 1 :
                System.out.println(Temp1 + " degre Celcius est egal a " + userObject.CelciusVersKelvin(Temp1) + " degre Kelvin" );
                break;
            case 2 :  
                System.out.println(Temp1 + " degre Kelvin est egal a " + userObject.KelvinVersCelcius(Temp1) + " degre Celcius" );
                break;
            case 3 :
                System.out.println(Temp1 + " degre Farenheit est egal a " + userObject.FarenheitVersCelcius(Temp1) + " degre Celcius" );
                break;
            case 4 : 
                System.out.println(Temp1 + " degre Celcius est egal a " + userObject.CelciusVersFarenheit(Temp1) + " degre Farenheit");
                break;
            case 5 :
                System.out.println(Temp1 + "degre Kelvin est egal a " + userObject.KelvinVersFarenheit(Temp1) + " degre Farenheit");
                break;
            case 6 :
                System.out.println(Temp1 + " degre Farenheit est egal a " + userObject.FarenheitVersKelvin(Temp1) + " degre Kelvin");
                break;
            default :
                System.out.println("veuillez choisir une conversion entre 1 et 6");
                break;
        }
        
        System.out.println(userObject);
    }
    
}
