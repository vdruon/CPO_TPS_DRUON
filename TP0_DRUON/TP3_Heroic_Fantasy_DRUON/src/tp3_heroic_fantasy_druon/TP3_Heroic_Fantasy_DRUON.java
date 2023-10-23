/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_druon;

import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
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
        
        Epee Excalibur = new Epee("Excalibur" , 7 , 5);
        Epee Durandal = new Epee("Durandal" , 4 , 7);
        
        Baton Chene = new Baton("Chene" , 4 , 5);
        Baton Charme = new Baton("Charme" , 5 , 6);
        
        ArrayList<Arme> Tab_Arme = new ArrayList<Arme>();
        Tab_Arme.add(Excalibur);
        Tab_Arme.add(Durandal);
        Tab_Arme.add(Chene);
        Tab_Arme.add(Charme);        
        
        System.out.println(Tab_Arme);
        
        
        
        
        
        
    }
    
}
