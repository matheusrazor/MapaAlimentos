package view;

/**
*
* @author Matheus Raphael Soares de Oliveira
* 
*/

import modelo.Usuario;

public class TelaCalculadora extends javax.swing.JFrame {

   /**
    * Cria uma nova tela
    */
   public TelaCalculadora() {
       initComponents();
   }
                  
   private void initComponents() {

       panelCabecalho = new javax.swing.JPanel();
       labelCalculadora = new javax.swing.JLabel();
       panelCorpo = new javax.swing.JPanel();
       labelIMC = new javax.swing.JLabel();
       labelCalMan = new javax.swing.JLabel();
       labelIMCDisplay = new javax.swing.JLabel();
       labelCalManDisplay = new javax.swing.JLabel();
       fecharButton = new javax.swing.JButton();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       setBackground(new java.awt.Color(137, 196, 244));

       panelCabecalho.setBackground(new java.awt.Color(120, 180, 250));

       labelCalculadora.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
       labelCalculadora.setForeground(new java.awt.Color(75, 119, 190));
       labelCalculadora.setText("Calculadora");

       javax.swing.GroupLayout panelCabecalhoLayout = new javax.swing.GroupLayout(panelCabecalho);
       panelCabecalho.setLayout(panelCabecalhoLayout);
       panelCabecalhoLayout.setHorizontalGroup(
           panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelCabecalhoLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(labelCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );
       panelCabecalhoLayout.setVerticalGroup(
           panelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelCabecalhoLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(labelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
               .addContainerGap())
       );

       panelCorpo.setBackground(new java.awt.Color(120, 180, 250));
       panelCorpo.setForeground(new java.awt.Color(250, 250, 250));

       labelIMC.setForeground(new java.awt.Color(250, 250, 250));
       labelIMC.setText("IMC");

       labelCalMan.setForeground(new java.awt.Color(250, 250, 250));
       labelCalMan.setText("Calorias de manutenção");
       labelCalMan.setVerticalAlignment(javax.swing.SwingConstants.TOP);

       labelIMCDisplay.setForeground(new java.awt.Color(250, 250, 250));
       labelIMCDisplay.setText(String.valueOf(modelo.Usuario.imc));

       labelCalManDisplay.setForeground(new java.awt.Color(250, 250, 250));
       labelCalManDisplay.setText(String.valueOf(modelo.Usuario.ans + 5) + " para homens e " + String.valueOf(modelo.Usuario.ans - 161) + " para mulheres.");
       labelCalManDisplay.setAutoscrolls(true);
       
       fecharButton.setText("Fechar");
       fecharButton.addMouseListener(new java.awt.event.MouseAdapter() {
           public void mouseClicked(java.awt.event.MouseEvent evt) {
               fecharButtonMouseClicked(evt);
           }
       });

       javax.swing.GroupLayout panelCorpoLayout = new javax.swing.GroupLayout(panelCorpo);
       panelCorpo.setLayout(panelCorpoLayout);
       panelCorpoLayout.setHorizontalGroup(
           panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(panelCorpoLayout.createSequentialGroup()
               .addGroup(panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(panelCorpoLayout.createSequentialGroup()
                       .addContainerGap()
                       .addComponent(labelCalMan))
                   .addGroup(panelCorpoLayout.createSequentialGroup()
                       .addGap(37, 37, 37)
                       .addComponent(labelIMC)))
               .addGroup(panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(panelCorpoLayout.createSequentialGroup()
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addGroup(panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(labelIMCDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(labelCalManDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                       .addContainerGap())
                   .addGroup(panelCorpoLayout.createSequentialGroup()
                       .addGap(264, 264, 264)
                       .addComponent(fecharButton)
                       .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
       );
       
       panelCorpoLayout.setVerticalGroup(
               panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panelCorpoLayout.createSequentialGroup()
                   .addContainerGap()
                   .addGroup(panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(labelIMCDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(labelIMC))
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                   .addGroup(panelCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(labelCalManDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(labelCalMan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                   .addComponent(fecharButton)
                   .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(panelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addComponent(panelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addComponent(panelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(panelCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       pack();
   }
   
   private void fecharButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
       dispose();
   }
   
   public static void main(String args[]) {
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new TelaCalculadora().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton fecharButton;
   private javax.swing.JLabel labelCalMan;
   private javax.swing.JLabel labelCalManDisplay;
   private javax.swing.JLabel labelCalculadora;
   private javax.swing.JLabel labelIMC;
   private javax.swing.JLabel labelIMCDisplay;
   private javax.swing.JPanel panelCabecalho;
   private javax.swing.JPanel panelCorpo;
   // End of variables declaration                   
}
