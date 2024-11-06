/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2_convertisseurobjet_herrada;

/**
 *
 * @author herra
 */
public class Interface extends javax.swing.JFrame {

    Convertisseur convertisseur1; // Ajouter un convertisseur

    public Interface() {
        initComponents();
        convertisseur1 = new Convertisseur(); // Instanciation dans le constructeur
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Presentation = new javax.swing.JLabel();
        Liste = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        OK = new javax.swing.JButton();
        Choix = new javax.swing.JTextField();
        Valeur = new javax.swing.JTextField();
        Result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Presentation.setText("Choisissez la conversion souhaité :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1 : Celcius Vers Kelvin\n2 : Kelvin Vers Celcius \n3 : Farenheit Vers Celcius \n4 : Celcius Vers Farenheit \n5 : Kelvin Vers farenheit \n6 : Farenheit Vers Kelvin");
        Liste.setViewportView(jTextArea1);

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Choix.setText("Saisissez un nombre");
        Choix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoixActionPerformed(evt);
            }
        });

        Valeur.setText("Saisissez valeur Choisi");
        Valeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValeurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Presentation, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(Liste, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Choix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Valeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Valeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(OK))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Presentation)
                            .addComponent(Choix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Liste, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChoixActionPerformed

    private void ValeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValeurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValeurActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
     try {
        // Récupérer le choix de conversion et la valeur à convertir
        String choixTexte = Choix.getText();
        int choix = Integer.parseInt(choixTexte); // Conversion en entier

        String valeurTexte = Valeur.getText();
        double valeur = Double.parseDouble(valeurTexte); // Conversion en double

        double resultat = 0;

        // Effectuer la conversion en fonction du choix
        switch (choix) {
            case 1:
                resultat = convertisseur1.CelciusVersKelvin(valeur);
                Result.setText(valeur + "°C = " + resultat + " K");
                break;
            case 2:
                resultat = convertisseur1.KelvinVersCelcius(valeur);
                Result.setText(valeur + " K = " + resultat + "°C");
                break;
            case 3:
                resultat = convertisseur1.FarenheitVersCelcius(valeur);
                Result.setText(valeur + "°F = " + resultat + "°C");
                break;
            case 4:
                resultat = convertisseur1.CelciusVersFarenheit(valeur);
                Result.setText(valeur + "°C = " + resultat + "°F");
                break;
            case 5:
                resultat = convertisseur1.KelvinVersFarenheit(valeur);
                Result.setText(valeur + " K = " + resultat + "°F");
                break;
            case 6:
                resultat = convertisseur1.FarenheitVersKelvin(valeur);
                Result.setText(valeur + "°F = " + resultat + " K");
                break;
            default:
                Result.setText("Choix non valide !");
                break;
        }
    } catch (NumberFormatException e) {
        Result.setText("Veuillez entrer des valeurs valides !");
    }
      
    }//GEN-LAST:event_OKActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Choix;
    private javax.swing.JScrollPane Liste;
    private javax.swing.JButton OK;
    private javax.swing.JLabel Presentation;
    private javax.swing.JLabel Result;
    private javax.swing.JTextField Valeur;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}