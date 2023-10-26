/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_console_druon;

/**
 *
 * @author vdruo
 */
public class Jeton {
    
    private String couleur;
    String ANSI_RESET = "\u001B[0m";    
    String ANSI_RED = "\u001B[31m";
    String ANSI_YELLOW = "\u001B[33m";

    /**
     * permet de créer un jeton avec une couleur spécifique, rouge ou jaune, qui ne pourra plus être changée
     * @param couleur assigne la couleur du jeton
     */
    public Jeton(String couleur) {
        this.couleur = couleur;
    }
    
    /**
     * Permet d'avoir accès à la couleur d'un jeton
     * @return la couleur du jeton
     */
    public String lireCouleur() {
        return couleur;
    }

    /**
     * Imprime "J" si le jeton est jaune, "R" s'il est rouge
     * @return "J" ou "R"
     */
    @Override
    public String toString() {
        if (couleur == "jaune") {
            return ANSI_YELLOW + "O" + ANSI_RESET;
        } else {
            return ANSI_RED + "O" + ANSI_RESET;
        }
    }
    
    
    
    
}
