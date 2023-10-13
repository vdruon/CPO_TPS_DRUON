/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_druon;

/**
 *
 * @author vdruo
 */
public class TP2_manip_DRUON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;                        // deux tartifletes ont été créer, tartie 2 et 3 sont les memes
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        assiette2.nbCalories +=100;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;   
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        // les objets 2 et 3 sont les memes, donc 1 seul objet 2 et 3
        
        //interchangeons les objets 1 et 2
        int cal = assiette2.nbCalories;
        assiette2.nbCalories = assiette1.nbCalories;
        assiette1.nbCalories = cal;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        
        
       // Moussaka assiette666 = assiette1 ;
       // Moussaka assiette667 = new Tartiflette() ;
       // ces deux lignes sont fausses, on ne peut pas creer ou assigner des objets avec une classe differentes
       
       // creer un tableau de 10 moussakas
       Moussaka [] tab_moussaka = new Moussaka [10]; 
       
       for (int i=0 ; i<10 ; i++) {
           tab_moussaka[i] = new Moussaka(i+10);
       }

        
        

    
        
        
        
        
        
        
        
    }
    
}
