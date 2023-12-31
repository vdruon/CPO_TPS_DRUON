/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lightoff_druon_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author vdruo
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeCellules grille;
    int nbCoups;
    int i;
    boolean cellEteint = true;
    int nbLignes;
    int nbColonnes;
    int diff;
    
        
    
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        nbCoups=0;
        initComponents();
        
        
        FenetreDebutPartie f1 = new FenetreDebutPartie();
        f1.setVisible(true);
        diff = f1.ChoixDiff();
        nbLignes = f1.nbLignes();
        nbColonnes = f1.nbColonnes();
        f1.setVisible(false);
        
        
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes, diff);
        
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                CelluleGraphique bouton_cellule = new CelluleGraphique( grille.matriceCellules[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, nbColonnes*50, nbLignes*50));
        this.pack();
        this.revalidate();
        
        initialiserPartie();
        
        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1 * 50, nbLignes * 50));
        this.pack();
        this.revalidate();
        
        // cr�ation du panneau de boutons verticaux (pour les lignes) 
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            bouton_ligne.setText(i+1+"");
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    partieFinie(nbLignes, nbColonnes);
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonVerticaux.add(bouton_ligne);

        }
        
        
        PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, nbColonnes * 50, 1* 50));
        this.pack();
        this.revalidate();
        
        // cr�ation du panneau de boutons verticaux (pour les lignes) 
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            bouton_colonne.setText(i+1+"");
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    partieFinie(nbLignes, nbColonnes);
                }
            };
        bouton_colonne.addActionListener(ecouteurClick);
        PanneauBoutonHorizontaux.add(bouton_colonne);
 
        }
        
        
        PanneauBoutonDiagonale1.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonDiagonale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1 * 50, 1* 50));
        this.pack();
        this.revalidate();
        JButton bouton_diag1 = new JButton();
        bouton_diag1.setText("D1");
        ActionListener ecouteurClick = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleDescendante();
                    repaint();
                    partieFinie(nbLignes, nbColonnes);
                }
            };
        bouton_diag1.addActionListener(ecouteurClick);
        PanneauBoutonDiagonale1.add(bouton_diag1);
        
        
        
        PanneauBoutonDiagonale2.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonDiagonale2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70 + nbLignes*50 + 10 , 1 * 50, 1* 50));
        this.pack();
        this.revalidate();
        JButton bouton_diag2 = new JButton();
        bouton_diag2.setText("D2");
        ActionListener ecouteurClick1 = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleMontante();
                    repaint();
                    partieFinie(nbLignes, nbColonnes);
                }
              
            };
        bouton_diag2.addActionListener(ecouteurClick1);
        PanneauBoutonDiagonale2.add(bouton_diag2);
        
        
    }

    public void partieFinie(int nbLignes, int nbColonnes) {
        
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                if (grille.matriceCellules[i][j].estEteint()==false){
                    cellEteint = false;
                }
            }
        }
        
        if (cellEteint == true) {
            FenetreVictoire f = new FenetreVictoire() ;
            f.setVisible(true) ;
        }
        
        cellEteint = true;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonVerticaux = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        PanneauBoutonDiagonale1 = new javax.swing.JPanel();
        PanneauBoutonDiagonale2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 550, 430));

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanneauBoutonVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonVerticaux);
        PanneauBoutonVerticaux.setLayout(PanneauBoutonVerticauxLayout);
        PanneauBoutonVerticauxLayout.setHorizontalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonVerticauxLayout.setVerticalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 430));

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanneauBoutonHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonHorizontaux);
        PanneauBoutonHorizontaux.setLayout(PanneauBoutonHorizontauxLayout);
        PanneauBoutonHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        PanneauBoutonHorizontauxLayout.setVerticalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 550, 70));

        PanneauBoutonDiagonale1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanneauBoutonDiagonale1Layout = new javax.swing.GroupLayout(PanneauBoutonDiagonale1);
        PanneauBoutonDiagonale1.setLayout(PanneauBoutonDiagonale1Layout);
        PanneauBoutonDiagonale1Layout.setHorizontalGroup(
            PanneauBoutonDiagonale1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonDiagonale1Layout.setVerticalGroup(
            PanneauBoutonDiagonale1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagonale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 70));

        PanneauBoutonDiagonale2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanneauBoutonDiagonale2Layout = new javax.swing.GroupLayout(PanneauBoutonDiagonale2);
        PanneauBoutonDiagonale2.setLayout(PanneauBoutonDiagonale2Layout);
        PanneauBoutonDiagonale2Layout.setHorizontalGroup(
            PanneauBoutonDiagonale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonDiagonale2Layout.setVerticalGroup(
            PanneauBoutonDiagonale2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonDiagonale2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonDiagonale1;
    private javax.swing.JPanel PanneauBoutonDiagonale2;
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables



public void initialiserPartie() {
 grille.eteindreToutesLesCellules();
 grille.melangerMatriceAleatoirement();
 }

}