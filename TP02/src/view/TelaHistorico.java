package view;

/**
 * 
 * @author Matheus Raphael Soares de Oliveira
 *
 */

import controle.ControleAlimento;

public class TelaHistorico extends javax.swing.JFrame {

    /** Creates new form TelaHistorico */
    public TelaHistorico() {
        initComponents();
    }
               
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        panelCabecalho = new javax.swing.JPanel();
        labelCabecalho = new javax.swing.JLabel();
        totalCaloriasLabel = new javax.swing.JLabel();
        totalProteinasLabel = new javax.swing.JLabel();
        totalCarbsLabel = new javax.swing.JLabel();
        totalFatsLabel = new javax.swing.JLabel();
        caloriasDisplay = new javax.swing.JLabel();
        proteinasDisplay = new javax.swing.JLabel();
        carbsDisplay = new javax.swing.JLabel();
        fatsDisplay = new javax.swing.JLabel();
        fecharButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(137, 196, 244));

        panelCabecalho.setBackground(new java.awt.Color(120, 180, 250));
        panelCabecalho.setPreferredSize(new java.awt.Dimension(339, 54));

        labelCabecalho.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        labelCabecalho.setForeground(new java.awt.Color(75, 119, 190));
        labelCabecalho.setText("Historico");

        javax.swing.GroupLayout panelCabecalhoLayout = new javax.swing.GroupLayout(panelCabecalho);
        panelCabecalho.setLayout(panelCabecalhoLayout);
        panelCabecalhoLayout.setHorizontalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabecalhoLayout.setVerticalGroup(
            panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        totalCaloriasLabel.setForeground(new java.awt.Color(250, 250, 250));
        totalCaloriasLabel.setText("Total calorias");

        totalProteinasLabel.setForeground(new java.awt.Color(250, 250, 250));
        totalProteinasLabel.setText("Total proteinas");

        totalCarbsLabel.setForeground(new java.awt.Color(250, 250, 250));
        totalCarbsLabel.setText("Total carboidratos");

        totalFatsLabel.setForeground(new java.awt.Color(250, 250, 250));
        totalFatsLabel.setText("Total gorduras");

        caloriasDisplay.setForeground(new java.awt.Color(250, 250, 250));
        caloriasDisplay.setText(String.valueOf(TelaAlimento.totalCal));

        proteinasDisplay.setForeground(new java.awt.Color(250, 250, 250));
        proteinasDisplay.setText(String.valueOf(TelaAlimento.totalPro));

        carbsDisplay.setForeground(new java.awt.Color(250, 250, 250));
        carbsDisplay.setText(String.valueOf(TelaAlimento.totalCarb));

        fatsDisplay.setForeground(new java.awt.Color(250, 250, 250));
        fatsDisplay.setText(String.valueOf(TelaAlimento.totalFat));

        fecharButton.setText("Fechar");
        fecharButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addComponent(totalCaloriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(caloriasDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalFatsLabel)
                            .addComponent(totalCarbsLabel)
                            .addComponent(totalProteinasLabel))
                        .addGap(53, 53, 53)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fatsDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(carbsDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(proteinasDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecharButton)
                .addGap(125, 125, 125))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCaloriasLabel)
                    .addComponent(caloriasDisplay))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalProteinasLabel)
                    .addComponent(proteinasDisplay))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCarbsLabel)
                    .addComponent(carbsDisplay))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalFatsLabel)
                    .addComponent(fatsDisplay))
                .addGap(18, 18, 18)
                .addComponent(fecharButton)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                        

    private void fecharButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        dispose();
    }                                         

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
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel caloriasDisplay;
    private javax.swing.JLabel carbsDisplay;
    private javax.swing.JLabel fatsDisplay;
    private javax.swing.JButton fecharButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCabecalho;
    private javax.swing.JPanel panelCabecalho;
    private javax.swing.JLabel proteinasDisplay;
    private javax.swing.JLabel totalCaloriasLabel;
    private javax.swing.JLabel totalCarbsLabel;
    private javax.swing.JLabel totalFatsLabel;
    private javax.swing.JLabel totalProteinasLabel;
    // End of variables declaration                   

}
