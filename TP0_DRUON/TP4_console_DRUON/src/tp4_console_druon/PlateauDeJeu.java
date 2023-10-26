/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_console_druon;

/**
 *
 * @author vdruo
 */
public class PlateauDeJeu {
    
    CelluleDeGrille[][] grille = new CelluleDeGrille [6][7];

    /**
     *créer 42 cellules vides de type CelluleDeGrille et de les stocker dans chacune des 42 cellules de grille
     */
    public PlateauDeJeu() {
        
        // une boucle for pour creer chaque cellule du tableau
        for (int i=0 ; i<6 ; i++) {
            for (int j=0 ; j<7 ; j++) {
                grille[i][j] = new CelluleDeGrille();
            }
        }
        
    }
    
    /**
     * ajoute un jeton passé en paramètre dans la colonne dont l’indice est aussi passé en paramètre, sur la cellule vide la plus basse
     * @param jeton jeton du joueur
     * @param idColonne indice de la colonne
     * @return indice de la ligne sur laquelle le jeton à été mis
     */
    public int ajouterJetonDansColonne(Jeton jeton, int idColonne) {
        
        if (colonneRemplie(idColonne)==false) {
            // boucle for pour ajouter un jeton sur la ligne la plus basse possible dans la colonne passée en parametre
            for (int i=0 ; i<6 ; i++) {
           
                if (grille[5-i][idColonne].presenceJeton()==false){
                    grille[5-i][idColonne].affecterJeton(jeton);
                    return 5-i;
                } 
            }
        }
        return -1;
        
    }
    
    /**
     * Vérifie si la grille de jeu est remplie, càd on ne peut plus jouer
     * @return true si elle est remplie, false sinon
     */
    public boolean grilleRemplie() {
        
        boolean rep = true;
        
        for (int i=0 ; i<6 ; i++) {
            for (int j=0 ; j<7 ; j++) {
                if (grille[i][j].presenceJeton()==false) {
                    rep = false;
                }
            }
        }
        
        if (rep) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * affiche la grille de jeu actuelle avec toutes ces caractéristiques
     * @return la grille sous forme de String
     */
    public String afficherGrilleSurConsole() {
        
        // creer la premiere ligne contenant le numero des colonnes 
        String result;
        result = "   |";
        for (int i=1 ; i <= 7 ; i++) {
            result += " " + i + " |";
        }
        
        // creer la ligne horiontale qui sépare les lignes
        String ligne_h;
        ligne_h ="\n----";
        for (int i=0 ; i < 7 ; i++) {
            ligne_h += "----";
        }
        result += ligne_h;
        
        result += "\n";
        
        // creer le reste du tableau ligne par ligne
        for (int i=1 ; i <= 6 ; i++) {
            
            result += " " + i + " |";
            for (int j=0 ; j < 7 ; j++) {
                
                result += " " + grille[i-1][j] + " |";
            }
          
            result += ligne_h + "\n";     
        }
        
        return result;
    }
    
    /**
     * Indique si un jeton est present sur la cellule de la ligne et de la colonne entrées en paramètre
     * @param x n° de ligne
     * @param y n° de colonne
     * @return true si un jeton est present, false sinon
     */
    public boolean presenceJeton(int x, int y) {
        return grille[x][y].presenceJeton();
    }
    
    /**
     * Indique la couleur du jeton present sur la cellule de la ligne et de la colonne entrées en paramètre 
     * @param x n° de ligne
     * @param y n° de colonne
     * @return "jaune", "rouge", ou "vide"
     */
    public String lireCouleurDuJeton(int x, int y) {
        return grille[x][y].lireCouleurDuJeton();
    }
    
    /**
     * renvoie true si la colonne dont l’indice est passé en paramètre remplie (on ne peut y jouer de jeton), et false sinon
     * @param idColonne n° de la colonne
     * @return "true" ou "false"
     */
    public boolean colonneRemplie(int idColonne) {
        if (grille[0][idColonne].presenceJeton()) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Vérifie s'il y'a une ligne gagnante pour la couleur entrée en paramètre
     * @param color couleur à tester 
     * @return true si une ligne est gagnante, false sinon
     */
    private boolean ligneGagnantePourCouleur(String color) {
        
        //boucle for pour parcourir l'ensemble des lignes de la grille
        for (int i=0 ; i<6 ; i++) {
            //boucle for pour parcourir les 4 premières colonnes de la grille
            for (int j=0 ; j<4 ; j++) {
                //test pour vérifier qu'une ligne de 4 jetons de même couleur existe
                if (grille[i][j].lireCouleurDuJeton()==color && grille[i][j].lireCouleurDuJeton()==grille[i][j+1].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i][j+2].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i][j+3].lireCouleurDuJeton())  {
                    return true;
                }  
            }
        }
    return false;
    }
    
    /**
     * Vérifie s'il y'a une colonne gagnante pour la couleur entrée en paramètre
     * @param color couleur à tester 
     * @return true si une colonne est gagnante, false sinon
     */
    private boolean  colonneGagnantePourCouleur(String color) {
        
        // boucle for pour parcourir les 3 premières lignes de la grille
        for (int i=0 ; i<3 ; i++){
            // boucle for pour parcourir l'ensemble des colonnes de la grille
            for (int j=0 ; j<7 ; j++) {
                // test pour vérifier qu'une colonne de 4 jetons existe
                if (grille[i][j].lireCouleurDuJeton()==color && grille[i][j].lireCouleurDuJeton()==grille[i+1][j].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i+2][j].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i+3][j].lireCouleurDuJeton()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Vérifie s'il y'a une diagonale montante gagnante pour la couleur entrée en paramètre
     * @param color couleur à tester 
     * @return true si une diagonale montante est gagnante, false sinon
     */
    private boolean diagonaleMontanteGagnantePourCouleur(String color) {
        
        for (int i=0 ; i<3 ; i++) {
            for (int j=3 ; j<7 ; j++) {
                if (grille[i][j].lireCouleurDuJeton()==color && grille[i][j].lireCouleurDuJeton()==grille[i+1][j-1].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i+2][j-2].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i+3][j-3].lireCouleurDuJeton() ) {
                    return true;
                }
            }
        }
    return false;
    }
    
    /**
     * Vérifie s'il y'a une diagonale descendante gagnante pour la couleur entrée en paramètre
     * @param color couleur à tester 
     * @return true si une diagonale descendante est gagnante, false sinon
     */
    private boolean diagonaleDescendanteGagnantePourCouleur(String color) {
        for (int i=0 ; i<3 ; i++) {
            for (int j=0 ; j<4 ; j++) {
                if (grille[i][j].lireCouleurDuJeton()==color && grille[i][j].lireCouleurDuJeton()==grille[i+1][j+1].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i+2][j+2].lireCouleurDuJeton() && grille[i][j].lireCouleurDuJeton()==grille[i+3][j+3].lireCouleurDuJeton()) {
                    return true;
                }
            } 
        }
        return false;
    }

    /**
     * Vérifie s'il y'a une ligne, une colonne ou une diagonale gagnante pour une couleur entrée en paramètre
     * @param color couleur à tester
     * @return true si ça gagne, false sinon
     */
    public boolean etreGagnantePourCouleur(String color) {
        if (ligneGagnantePourCouleur(color) || colonneGagnantePourCouleur(color) || diagonaleMontanteGagnantePourCouleur(color) || diagonaleDescendanteGagnantePourCouleur(color)) {
            return true;
        } else {
            return false;
        }
    }
    
    
        
        
}
    
