/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_druon;

/** DRUON Victor
 * TDA
 * 06/10/2023
 *
 * @author vdruo
 */
public class TP2_Bieres_DRUON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creation d'une premiere reference objet qui s'apelle "uneBiere"
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls" , (float) 7.0, "Dubuisson");
        //appelons la methode de la classe BouteilleBiere pour afficher les attribut de la nouvelle reférence objet
        uneBiere.lireEtiquette();
        
        
        // creeons une deuxieme reference objet "
        BouteilleBiere Leffe = new BouteilleBiere("Leffe" , (float) 6.6 , "Abbaye de Leffe");
        Leffe.lireEtiquette();
        
        // creons 2 autres bieres
        BouteilleBiere TripleK = new BouteilleBiere("Triple Karmeliet" , (float) 8.4 , "Brasserie de Bosteels");
        TripleK.lireEtiquette();
        
        BouteilleBiere Chouffe = new BouteilleBiere("Chouffe" , (float) 8.0 , "Brasserie d'Achouffe");
        Chouffe.lireEtiquette();
        
        //Decapsulons quelques bières
        uneBiere.Decapsuler();
        Chouffe.Decapsuler();
        
        //affichons les differentes bières
        System.out.println(uneBiere);
        System.out.println(Leffe);
        System.out.println(TripleK);
        System.out.println(Chouffe);
       
        
    }  
    
}
