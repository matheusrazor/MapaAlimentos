package view;

import java.awt.Color;

/**
 *
 * @author Matheus Raphael Soares de Oliveira
 * 
 */

public class TelaAlimento extends javax.swing.JFrame {
	
	public static String tNomeAlimento;
	public static int tQuant;
	public static double tCalories;
	public static double tProteins;
	public static double tCarbs;
	public static double tFats;
	
	public static double totalCal = 0;
	public static double totalPro = 0;
	public static double totalCarb = 0;
	public static double totalFat = 0;

    public TelaAlimento() {
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cabecalhoPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        quantLabel = new javax.swing.JLabel();
        caloriasLabel = new javax.swing.JLabel();
        protLabel = new javax.swing.JLabel();
        carbLabel = new javax.swing.JLabel();
        gorduraLabel = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        quantTextField = new javax.swing.JTextField();
        caloriasTextField = new javax.swing.JTextField();
        protTextField = new javax.swing.JTextField();
        carbTextField = new javax.swing.JTextField();
        gorduraTextField = new javax.swing.JTextField();
        confirmaButton = new javax.swing.JButton();
        cancelaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        cabecalhoPanel.setBackground(new java.awt.Color(120, 180, 250));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(75, 119, 190));
        jLabel7.setText("Menu Alimento");

        javax.swing.GroupLayout cabecalhoPanelLayout = new javax.swing.GroupLayout(cabecalhoPanel);
        cabecalhoPanel.setLayout(cabecalhoPanelLayout);
        cabecalhoPanelLayout.setHorizontalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cabecalhoPanelLayout.setVerticalGroup(
            cabecalhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nomeLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(250, 250, 250));
        nomeLabel.setText("Nome do Alimento");

        quantLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        quantLabel.setForeground(new java.awt.Color(250, 250, 250));
        quantLabel.setText("Quantidade (em g)");

        caloriasLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        caloriasLabel.setForeground(new java.awt.Color(250, 250, 250));
        caloriasLabel.setText("Calorias");

        protLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        protLabel.setForeground(new java.awt.Color(250, 250, 250));
        protLabel.setText("Proteinas (em g)");

        carbLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        carbLabel.setForeground(new java.awt.Color(250, 250, 250));
        carbLabel.setText("Carboidratos (em g)");

        gorduraLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        gorduraLabel.setForeground(new java.awt.Color(250, 250, 250));
        gorduraLabel.setText("Gorduras (em g)");

        quantTextField.setForeground(new java.awt.Color(100, 100, 100));
        quantTextField.setText("Gramas da tabela nutricional");
        quantTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantTextFieldFocusLost(evt);
            }
        });

        carbTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbTextFieldActionPerformed(evt);
            }
        });

        gorduraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorduraTextFieldActionPerformed(evt);
            }
        });

        confirmaButton.setText("Confirma");
        confirmaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmaButtonMouseClicked(evt);
            }
        });

        cancelaButton.setText("Cancela");
        cancelaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cabecalhoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(caloriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caloriasTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(protLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(protTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carbTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gorduraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gorduraTextField)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmaButton)
                .addGap(18, 18, 18)
                .addComponent(cancelaButton)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cabecalhoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caloriasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caloriasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(protLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(protTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carbLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carbTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gorduraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gorduraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaButton)
                    .addComponent(cancelaButton))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void carbTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void gorduraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void quantTextFieldFocusGained(java.awt.event.FocusEvent evt) {                                           
        
        if(quantTextField.getText().trim().toLowerCase().equals("gramas da tabela nutricional")) {
            quantTextField.setText("");
            quantTextField.setForeground(Color.black);
        }
        
    }                                          

    private void quantTextFieldFocusLost(java.awt.event.FocusEvent evt) {                                         
        
        if(quantTextField.getText().trim().equals("")) {
            quantTextField.setText("Gramas da tabela nutricional");
            quantTextField.setForeground(new Color(100, 100, 100));
        }
        
    }
                                                

    private void confirmaButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	tNomeAlimento = nomeTextField.getText();
    	tQuant = Integer.parseInt(quantTextField.getText());
    	tCalories = Double.parseDouble(caloriasTextField.getText());
    	tProteins = Double.parseDouble(protTextField.getText());
    	tCarbs = Double.parseDouble(carbTextField.getText());
    	tFats = Double.parseDouble(gorduraTextField.getText());
    	
    	dispose();
    }                                           

    private void cancelaButtonMouseClicked(java.awt.event.MouseEvent evt) {                                           
    	dispose();
    }                                          

    
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
            java.util.logging.Logger.getLogger(TelaAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlimento().setVisible(true);
            }
        });
		
		/** Dados para o historico */
		totalCal += tCalories;
		totalPro += tProteins;
		totalCarb += tCarbs;
		totalFat += tFats;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel cabecalhoPanel;
    private javax.swing.JLabel caloriasLabel;
    private javax.swing.JTextField caloriasTextField;
    private javax.swing.JButton cancelaButton;
    private javax.swing.JLabel carbLabel;
    private javax.swing.JTextField carbTextField;
    private javax.swing.JButton confirmaButton;
    private javax.swing.JLabel gorduraLabel;
    private javax.swing.JTextField gorduraTextField;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel protLabel;
    private javax.swing.JTextField protTextField;
    private javax.swing.JLabel quantLabel;
    private javax.swing.JTextField quantTextField;
    // End of variables declaration                   
}

