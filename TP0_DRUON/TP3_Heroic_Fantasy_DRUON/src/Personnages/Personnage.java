package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vdruo
 */
public abstract class Personnage {
    
    String name;
    int nivVie;
    Arme Arme_en_Main = null;

    public Personnage(String name, int nivVie) {
        this.name = name;
        this.nivVie = nivVie;
    }
    
    public int get_nivVie() {
        return nivVie;
    }
    
    ArrayList<Arme> Arme_perso = new ArrayList<Arme>();
    
    public void addArme(Arme arme){
        
        if (Arme_perso.size() < 5) {
            Arme_perso.add(arme);
        }
    }

    public Arme getArme() {
        return Arme_en_Main;
    }
    
    
    
    public void choisirArme(String nom_arme) {
        
        for (int i = 0 ; i < Arme_perso.size() ; i++) {
            
            if (Arme_perso.get(i).getName() == nom_arme) {
                Arme_en_Main = Arme_perso.get(i);
                System.out.println(nom_arme + " est equipe");
            } else {
            System.out.println(nom_arme + " n'est pas disponible dans votre inventaire");
            }
        }
        
        }
    
    @Override
    public String toString () {
    return "nom du personnage : "+ name + "\nniveau de vie : " + nivVie + "\narme en main : " + Arme_en_Main;
    }
        
    }
    

