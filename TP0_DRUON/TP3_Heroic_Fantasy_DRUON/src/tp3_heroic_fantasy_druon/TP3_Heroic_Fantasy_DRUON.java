/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_druon;

import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
import Personnages.Guerrier;
import Personnages.Magicien;
import Personnages.Personnage;
import java.util.ArrayList;

/**
 *
 * @author vdruo
 */
public class TP3_Heroic_Fantasy_DRUON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee epee1 = new Epee("Excalibur" , 7 , 5);
        Epee epee2 = new Epee("Durandal" , 4 , 7);
        Epee epee3 = new Epee("victor" , 45 , 10);
        Baton baton1 = new Baton("Chene" , 4 , 5);
        Baton baton2 = new Baton("Charme" , 5 , 6);
        Baton baton3 = new Baton("thomas" , 3 , 59);
        
       
        
        Magicien Gandalf = new Magicien("Gandalf" , 65 , true);
        Magicien Garcimore = new Magicien("Garcimore" , 44 , false);
        Guerrier Conan = new Guerrier("Conan" , 78 , false);
        Guerrier Lannister = new Guerrier("Lannister" , 45 , true);
        
    
        Gandalf.addArme(baton1);
        Gandalf.addArme(baton2);
        Gandalf.addArme(epee3);
        Gandalf.choisirArme("victor");
        
        Conan.addArme(epee1);
        Conan.addArme(epee2);
        Conan.addArme(baton3);
        
        System.out.println(Gandalf);
        System.out.println(Conan);
        
    }
    
}
