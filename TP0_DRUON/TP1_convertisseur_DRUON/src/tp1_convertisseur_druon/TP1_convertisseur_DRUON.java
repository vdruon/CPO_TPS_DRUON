/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_druon;

import java.util.Scanner;

/**DRUON Victor
 *TDA
 * 26/09/2023
 * @author vdruo
 */
public class TP1_convertisseur_DRUON {

    /**
     * @param args the command line arguments
     */
    
    
    //methode pour convertir des celsisus en kelvin
    public static double CelsiusVersKelvin (double tCelsius) {
        double tKelvin = tCelsius + 273.15;   
        return tKelvin;    
    }
            
    //methode pour convertir des kelvin en celsius
    public static double KelvinVersCelsius (double tKelvin) {
        double tCelsius = tKelvin - 273.15;   
        return tCelsius;    
    }
    
    
    //methode pour convertir des farenheit en celsius
    public static double FarenheitVersCelsius (double tFarenheit) {
        double tCelsius = (tFarenheit - 32)*(5/9);   
        return tCelsius;
    }
    
    
    
   //methode pour convertir des celsius en farenheit
    public static double CelsiusVersFarenheit (double tCelsius) {
        double tFarenheit = tCelsius*(9/5) + 32;   
        return tFarenheit;
    }
    
    
    
    
    
   //methode pour convertir des kelvin en farenheit
    public static double KelvinVersFarenheit (double tKelvin) {
    double tCelsius = KelvinVersCelsius(tKelvin);
    double tFarenheit = CelsiusVersFarenheit(tCelsius);
    return tFarenheit;
    }
    
   //methode pour convertir des farenheit en kelvin
    public static double FarenheitVersKelvin (double tFarenheit) {
        double tCelsius = FarenheitVersCelsius(tFarenheit);
        double tKelvin = CelsiusVersKelvin(tCelsius);
        return tKelvin;
    }
   
   
   
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creation de la variable double qui contiendra la temperature de l'utilisateur
        double Temp1;
        
        // demander la valeur que l'utilisateur veut rentrer, et l'assigner à Temp1
        Scanner sc =new Scanner(System.in);
        System.out.println("entrer la temperature");
        Temp1 = sc.nextDouble();
        
        //proposer à l'utilisateur la convertion qu'il souhaite faire
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1) De Celsius vers Kelvin \n2) De Kelvin vers Celsius \n3) De Farenheit vers Celsius \n4) De Celsius vers Farenheit \n5) De Kelvin en Farenheit \n6) De Farenheit vers Kelvin");
        int nConvertion = sc.nextInt();
        
        
        //appliquer chaque convertion à sa methode
        switch (nConvertion) {
            case 1 :
                System.out.println("le resultat est " + CelsiusVersKelvin(Temp1) );
                break;
            case 2 :  
                System.out.
        }
    }
    
}
