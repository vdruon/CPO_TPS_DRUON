/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_druon_version_console;

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
    
    GrilleDeCellules g1 = new GrilleDeCellules(7,7);
    System.out.println(g1);
    g1.melangerMatriceAleatoirement(50);
    System.out.println(g1);
    System.out.println(g1.cellulesToutesEteintes());
    g1.eteindreToutesLesCellules();
    System.out.println(g1);
    System.out.println(g1.cellulesToutesEteintes());
    }
    
}
