/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_druon;

import java.util.Random;
import java.util.Scanner;

/**
 * DRUON Victor TDA 26/09/2023
 *
 * @author vdruo
 */
public class TP1_guessMyNumber_DRUON {

    /**
     * @param args the command line arguments
     *
     */
    // creation de la methode diabolique  
    public static int diabolique() {

        // generer un chiffre entre 0 et 9, soit une possibilité de 10 chiffres
        Random generateurAleat = new Random();
        int n_diab = generateurAleat.nextInt(9);
        int a = 0;

        // on souhaite une probabilité de 30%, on va donc creer une boucle "if" avec comme conditions d'avoir 1 chiffre sur 3 différents, afin de créer une probabilité de 3/10
        if (n_diab == 0 || n_diab == 1 || n_diab == 2) {
            a = 1;
        } 
        else {
            a = 0;
        }
        
        return a;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        // instruction permettant de générer des nombres aléatoires
        Random generateurAleat = new Random();

        // creer le compteur, afin de savoir en combien de coup le joueur a trouvé le bon nombre (le compteur commence a 1 car le joueur vient de saisir son premier nombre
        int nb_tour = 1;

        // créer les différents modes facile, normal, difficile
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel mode voulez vous choisir ? \n\n\nLe mode FACILE : \nIntervalle : entre 0 et 100 \nNombre de coups : illimite \nMessages d'aide ameliores \n\nLe mode NORMAL : \nIntervalle : entre 0 et 100 \nNombre de coups : 15 \nMessages d'aide \n\nLe mode DIFFICILE : \nIntervalle : entre 0 et 300 \nNombre de coups : 15 \nMessages d'aide \n\n\nTapez 1 pour FACILE\nTapez 2 pour NORMAL\nTapez 3 pour DIFFICILE");
        int mode = sc.nextInt();
        
        //creer le mode diabolique
        System.out.println("\n\n\n\nVoulez vous jouer en mode DIABOLIQUE ? \nTapez 1 pour oui \nTapez 0 pour non");
        int mode_diab = sc.nextInt();
                
                
                
                
        switch (mode) {

            // l'utilisateur choisit FACILE
            case 1:

                // générons maintenant un entier alétoire inférieur ou égale à 100 (positif)
                int n = generateurAleat.nextInt(100);

                // l'utilisateur doit trouver ce nombre, demandons lui quel nombre veut-il choisir
                System.out.println("\n\n\n\nChoisir un nombre entier entre 0 et 100");
                int n_user = sc.nextInt();

                // créons une boucle while "tant que les nombres sont différents" pour que l'utilisateur trouve le bon nombre
                while (n != n_user) {

                    // si le nombre de l'utilisateur est plus grand, afficher "Vraiment trop grand !" ou "Trop grand !" 
                    if (n < n_user) {
                        
                        // si le nombre de l'utilisateur est vraiment trop grand
                        if (n_user - n > 30) {
                            
                            // si le mode diabolique est activé, affiché l'inverse en utilisant la methode diabolique qui à 30% de succes
                            if (mode_diab == 1) {
                                if (diabolique() == 1) {
                                System.out.println("Vraiment trop petit !");
                                }
                                // si diabolique() != 1 afficher le message initalement prévu
                                else {
                                  System.out.println("Vraiment trop grand !");
                                }
                            }
                                // si mode diabolique pas activé
                                else {
                            System.out.println("Vraiment trop grand !");
                            }
                        } 
                         // si le nombre de l'utilisateur est trop grand
                        else {
                            
                              // si mode diabolique activé 
                              if (mode_diab == 1) {
                                  if (diabolique() == 1) {
                                      System.out.println("Trop petit !");
                                  }
                                  // si mode diabolique sans succes
                                  else {
                                      System.out.println("Trop grand !");
                                  }
                              // si mode diabolique pas activé    
                              } else {
                                  System.out.println("Trop grand !");
                              }
                            }
                        
                    
                    } 
                       
                    // si le nombre de l'utilisateur est plus petit, afficher "Vraiment trop petit !" ou "Trop petit !"
                    else { 
                        
                        //si le nombre de l'utilisateur est vraiment trop petit 
                        if (n - n_user > 30) {
                            
                            // si le mode diabolique est activé, affiché l'inverse en utilisant la methode diabolique qui à 30% de succes
                            if (mode_diab == 1) {
                                if (diabolique() == 1) {
                                System.out.println("Vraiment trop grand !");
                                }
                                //si mode diabolique sans succes
                                else {
                                    System.out.println("Vraiment trop petit !");
                                }
                                
                            // si mode diabolique pas activé
                            } else {
                                System.out.println("Vraiment trop petit !");
                                     }
                            
                        // si le nombre de l'utilisateur est trop petit
                        }else {
                            
                              // si mode diabolique activé 
                              if (mode_diab == 1) {
                                  if (diabolique() == 1) {
                                      System.out.println("Trop grand !");
                                  } 
                                  
                                  //si mode diabolique sans succes
                                  else {
                                      System.out.println("Trop petit !");
                                  }
                                  
                                  
                              // si mode diabolique pas activé    
                              } else {
                                  System.out.println("Trop petit !");
                              }
                            }
                    }
                    
                     // demander à l'utilisateur de choisir un autre nombre
                    System.out.println("Choisir un nombre entier entre 0 et 100");
                    n_user = sc.nextInt();

                    // mettre à jour le compteur
                    nb_tour += 1;
                }
                    

                //L'utilisateur a trouvé le bon nombre, félicitons-le
                System.out.println("Bravo vous avez trouve le bon nombre " + n + " en " + nb_tour + " coup !");
                break ;

                
                
                
                
                
                
            // l'utilisateur choisit NORMAL
            case 2:

                // générons maintenant un entier alétoire inférieur ou égale à 100 (positif)
                n = generateurAleat.nextInt(100);

                // l'utilisateur doit trouver ce nombre, demandons lui quel nombre veut-il choisir
                System.out.println("\n\n\n\nChoisir un nombre entier entre 0 et 100");
                n_user = sc.nextInt();

                // créons une boucle while "tant que les nombres sont différents" pour que l'utilisateur trouve le bon nombre
                while (n != n_user) {

                    // si le nombre de l'utilisateur est plus grand, afficher "Trop grand !" 
                    if (n < n_user) {
                        
                        // si mode diabolique activé 
                              if (mode_diab == 1) {
                                  if (diabolique() == 1) {
                                      System.out.println("Trop petit !");
                                  } 
                                  
                                  //si mode diabolique sans succes
                                  else {
                                      System.out.println("Trop grand !");
                                  }
                                  
                                  
                              // si mode diabolique pas activé    
                              } else {
                                  System.out.println("Trop grand !");
                              }
                        
                    } 
                    
                    // si le nombre de l'utilisateur est plus petit, afficher "Trop petit !"
                    else {
                        
                        // si mode diabolique activé 
                              if (mode_diab == 1) {
                                  if (diabolique() == 1) {
                                      System.out.println("Trop grand !");
                                  } 
                                  
                                  //si mode diabolique sans succes
                                  else {
                                      System.out.println("Trop petit !");
                                  }
                                  
                                  
                              // si mode diabolique pas activé    
                              } else {
                                  System.out.println("Trop petit !");
                              }
                        
                    }

                    // demander à l'utilisateur de choisir un autre nombre
                    System.out.println("Choisir un nombre entier entre 0 et 100");
                    n_user = sc.nextInt();

                    // mettre à jour le compteur
                    nb_tour += 1;

                    // arreter la boucle while si le joueur dépasse les 10 coups
                    if (nb_tour == 15) {
                        break;
                    }

                }

                //L'utilisateur a trouvé le bon nombre, félicitons-le
                if (n == n_user){
                    System.out.println("Bravo vous avez trouve le bon nombre " + n + " en " + nb_tour + " coup !");
                    break;  
                }
                // sinon arreter la partie
                else {
                    System.out.println("Vous avez depasse le nombre de coups maximal. Le bon nombre etait " + n + ". Retentez votre chance pour faire mieux ! ");
                    break;
                }
                
                

            // l'utilateur chosit DIFFICILE
            case 3:

                // générons maintenant un entier alétoire inférieur ou égale à 300 (positif)
                n = generateurAleat.nextInt(300);

                // l'utilisateur doit trouver ce nombre, demandons lui quel nombre veut-il choisir
                System.out.println("\n\n\n\nChoisir un nombre entier entre 0 et 300");
                n_user = sc.nextInt();

                // créons une boucle while "tant que les nombres sont différents" pour que l'utilisateur trouve le bon nombre
                while (n != n_user) {

                    // si le nombre de l'utilisateur est plus grand, afficher "Trop grand !" 
                    if (n < n_user) {
                        
                              // si mode diabolique activé 
                              if (mode_diab == 1) {
                                  if (diabolique() == 1) {
                                      System.out.println("Trop petit !");
                                  } 
                                  
                                  //si mode diabolique sans succes
                                  else {
                                      System.out.println("Trop grand !");
                                  }
                                  
                                  
                              // si mode diabolique pas activé    
                              } else {
                                  System.out.println("Trop grand !");
                              }
                    } 

                    // si le nombre de l'utilisateur est plus petit, afficher "Vraiment trop petit !" ou "Trop petit !"
                    else {
                        
                        // si mode diabolique activé 
                              if (mode_diab == 1) {
                                  if (diabolique() == 1) {
                                      System.out.println("Trop grand !");
                                  } 
                                  
                                  //si mode diabolique sans succes
                                  else {
                                      System.out.println("Trop petit !");
                                  }
                                  
                                  
                              // si mode diabolique pas activé    
                              } else {
                                  System.out.println("Trop petit !");
                              }
                        
                    }

                    // demander à l'utilisateur de choisir un autre nombre
                    System.out.println("Choisir un nombre entier entre 0 et 300");
                    n_user = sc.nextInt();

                    // mettre à jour le compteur
                    nb_tour += 1;

                    // arreter la boucle while si le joueur dépasse les 10 coups
                    if (nb_tour == 15) {
                        break;
                    }
                }
               
                //L'utilisateur a trouvé le bon nombre, félicitons-le
                if (n == n_user){
                    System.out.println("Bravo vous avez trouve le bon nombre " + n + " en " + nb_tour + " coup !");
                    break;  
                }
                // sinon arreter la partie
                else {
                    System.out.println("Vous avez depasse le nombre de coups maximal. Le bon nombre etait " + n + ". Retentez votre chance pour faire mieux ! ");
                    break;
                }
                
        }

    }

}
