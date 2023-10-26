/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_console_druon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vdruo
 */
public class Partie {
    
    private Joueur[] listeJoueurs = new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;
    Random generateurAleat = new Random();
    Scanner sc = new Scanner(System.in);

    /**
     *Affecte les deux joueurs passés en paramètre aux deux cellules de listeJoueurs, et crée un nouveau plateau de jeu
     * @param j1 joueur 1
     * @param j2 joueur 2
     */
    public Partie(Joueur j1, Joueur j2) {
        listeJoueurs[0]=j1;
        listeJoueurs[1]=j2;
        plateau = new PlateauDeJeu();
        joueurCourant = listeJoueurs[0];
    }
    
    /**
     *: distribue une couleur aléatoire aux deux joueurs, rouge ou jaune
     */
    public void attribuerCouleurAuxJoueurs() {
        int a = generateurAleat.nextInt(1);
        if (a==0){
            listeJoueurs[0].affecterCouleur("rouge");
            listeJoueurs[1].affecterCouleur("jaune");
        } else {
            listeJoueurs[0].affecterCouleur("jaune");
            listeJoueurs[1].affecterCouleur("rouge");
        }
    }
    
    /**
     *crée 30 jetons de la couleur du joueur passé en paramètre, et les lui donne en utilisant sa méthode ajouterJeton()
     * @param j joueur
     */
    public void creerEtAffecterJeton(Joueur j) {
        for (int i=0 ; i<30 ; i++) {
            Jeton jeton = new Jeton(j.lireCouleur());
            j.ajouterJeton(jeton);
        }
    }
    
    /**
     * change l'état du joueur courrant, utile pour les changements de tours
     */
    public void changerJoueurCourant(){
        if (joueurCourant==listeJoueurs[0]){
            joueurCourant=listeJoueurs[1];
        } else {
            joueurCourant=listeJoueurs[0];
        }
    }
    
    /**
     * Attribut les couleurs aux joueurs et créé leurs jetons
     */
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(joueurCourant);
        changerJoueurCourant();
        creerEtAffecterJeton(joueurCourant);
    }
    
    public void lancerPartie() {
        
        System.out.println(plateau.afficherGrilleSurConsole());
        
        while (plateau.etreGagnantePourCouleur("rouge")==false && plateau.etreGagnantePourCouleur("jaune")==false && plateau.grilleRemplie()==false) {
            System.out.println("\n\n" + joueurCourant.getNom() + ", sur quelle colonne souhaitez vous placer un jeton ?");
            int idCol = sc.nextInt();
            plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), idCol-1);
            System.out.println("\n\n" + plateau.afficherGrilleSurConsole());
            changerJoueurCourant();
        }
        
        if (plateau.etreGagnantePourCouleur("rouge")) {
            System.out.println("\n\nBravo les rouges, vous avez gagnez !" );
        } else if (plateau.etreGagnantePourCouleur("jaune")) {
            System.out.println("\n\nBravo les jaunes, vous avez gagnez !" );
        } else {
            System.out.println("\n\nEgalité, la grille est pleine !");
        }
        
    }
    
}
