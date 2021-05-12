package view;

/*
 * @author Matheus Raphael Soares de Oliveira
 */

public class TelaMenu extends javax.swing.JFrame {

	/**
	 * Cria uma nova tela
	 */
    public TelaMenu() {
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cabecalhoPanel = new javax.swing.JPanel();
        olaLabel = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        usuarioDisplayLabel = new javax.swing.JLabel();
        menuAlimentoPanel = new javax.swing.JPanel();
        menuAlimentoLabel = new javax.swing.JLabel();
        menuAlimentoButton = new javax.swing.JButton();
        calculadoraPanel = new javax.swing.JPanel();
        calculadoraLabel = new javax.swing.JLabel();
        calculadoraButton = new javax.swing.JButton();
        metasPanel = new javax.swing.JPanel();
        metasLabel = new javax.swing.JLabel();
        metasButton = new javax.swing.JButton();
        historicoPanel = new javax.swing.JPanel();
        historicoLabel = new javax.swing.JLabel();
        historicoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 370));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jPanel2.setBackground(new java.awt.Color(137, 196, 244));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 366));

        cabecalhoPanel.setBackground(new java.awt.Color(120, 180, 250));
        cabecalhoPanel.setPreferredSize(new java.awt.Dimension(146, 54));

        olaLabel.setText("Olá, ");

        menuLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(75, 119, 190));
        menuLabel.setText("Menu");

        usuarioDisplayLabel.setText(TelaUsuario.tNome);

        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(olaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(olaLabel)
                        .addComponent(usuarioDisplayLabel)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        menuAlimentoPanel.setBackground(new java.awt.Color(120, 180, 250));
        menuAlimentoPanel.setPreferredSize(new java.awt.Dimension(197, 220));

        menuAlimentoLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        menuAlimentoLabel.setForeground(new java.awt.Color(250, 250, 250));
        menuAlimentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuAlimentoLabel.setText("Menu Alimento");

        menuAlimentoButton.setText("Entre");
        menuAlimentoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlimentoButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuAlimentoPanelLayout = new javax.swing.GroupLayout(menuAlimentoPanel);
        menuAlimentoPanel.setLayout(menuAlimentoPanelLayout);
        menuAlimentoPanelLayout.setHorizontalGroup(
            menuAlimentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlimentoPanelLayout.createSequentialGroup()
                .addGroup(menuAlimentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAlimentoPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(menuAlimentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuAlimentoPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(menuAlimentoButton)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        menuAlimentoPanelLayout.setVerticalGroup(
            menuAlimentoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlimentoPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(menuAlimentoLabel)
                .addGap(18, 18, 18)
                .addComponent(menuAlimentoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        calculadoraPanel.setBackground(new java.awt.Color(120, 180, 250));
        calculadoraPanel.setPreferredSize(new java.awt.Dimension(197, 220));

        calculadoraLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        calculadoraLabel.setForeground(new java.awt.Color(250, 250, 250));
        calculadoraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculadoraLabel.setText("Calculadora");

        calculadoraButton.setText("Entre");
        calculadoraButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculadoraButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout calculadoraPanelLayout = new javax.swing.GroupLayout(calculadoraPanel);
        calculadoraPanel.setLayout(calculadoraPanelLayout);
        calculadoraPanelLayout.setHorizontalGroup(
            calculadoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculadoraPanelLayout.createSequentialGroup()
                .addGroup(calculadoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calculadoraPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(calculadoraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(calculadoraPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(calculadoraButton)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        calculadoraPanelLayout.setVerticalGroup(
            calculadoraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculadoraPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(calculadoraLabel)
                .addGap(18, 18, 18)
                .addComponent(calculadoraButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        metasPanel.setBackground(new java.awt.Color(120, 180, 250));

        metasLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        metasLabel.setForeground(new java.awt.Color(250, 250, 250));
        metasLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metasLabel.setText("Metas");

        metasButton.setText("Entre");
        metasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metasButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout metasPanelLayout = new javax.swing.GroupLayout(metasPanel);
        metasPanel.setLayout(metasPanelLayout);
        metasPanelLayout.setHorizontalGroup(
            metasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metasPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(metasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, metasPanelLayout.createSequentialGroup()
                        .addComponent(metasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, metasPanelLayout.createSequentialGroup()
                        .addComponent(metasButton)
                        .addGap(68, 68, 68))))
        );
        metasPanelLayout.setVerticalGroup(
            metasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(metasPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(metasLabel)
                .addGap(18, 18, 18)
                .addComponent(metasButton)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        historicoPanel.setBackground(new java.awt.Color(120, 180, 250));

        historicoLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        historicoLabel.setForeground(new java.awt.Color(250, 250, 250));
        historicoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historicoLabel.setText("/Historico/");

        historicoButton.setText("Entre");
        historicoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historicoButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout historicoPanelLayout = new javax.swing.GroupLayout(historicoPanel);
        historicoPanel.setLayout(historicoPanelLayout);
        historicoPanelLayout.setHorizontalGroup(
            historicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historicoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(historicoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(historicoPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(historicoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        historicoPanelLayout.setVerticalGroup(
            historicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historicoPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(historicoLabel)
                .addGap(18, 18, 18)
                .addComponent(historicoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(menuAlimentoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(calculadoraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historicoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(metasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuAlimentoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculadoraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(historicoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void menuAlimentoButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                
        TelaAlimento.main(null);
    }                                               

    private void calculadoraButtonMouseClicked(java.awt.event.MouseEvent evt) {                                               
        modelo.Usuario.indiceMC();
        modelo.Usuario.caloriasDiarias();
    	TelaCalculadora.main(null);
    }                                              

    private void historicoButtonMouseClicked(java.awt.event.MouseEvent evt) {     
        TelaHistorico.main(null);
    }                                            

    private void metasButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel cabecalhoPanel;
    private javax.swing.JButton calculadoraButton;
    private javax.swing.JLabel calculadoraLabel;
    private javax.swing.JPanel calculadoraPanel;
    private javax.swing.JButton historicoButton;
    private javax.swing.JLabel historicoLabel;
    private javax.swing.JPanel historicoPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton menuAlimentoButton;
    private javax.swing.JLabel menuAlimentoLabel;
    private javax.swing.JPanel menuAlimentoPanel;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JButton metasButton;
    private javax.swing.JLabel metasLabel;
    private javax.swing.JPanel metasPanel;
    private javax.swing.JLabel olaLabel;
    private javax.swing.JLabel usuarioDisplayLabel;
    // End of variables declaration                   
}
