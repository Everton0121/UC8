/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uc9.criadordepersonagem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Personagem extends javax.swing.JFrame {

    /**
     * Creates new form Personagem
     */
    public Personagem() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton3 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        PanelRosa = new javax.swing.JPanel();
        TxtNomeField = new javax.swing.JTextField();
        TxtIdadeField = new javax.swing.JTextField();
        BtnEnter = new javax.swing.JButton();
        racaLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        habilidadesLabel = new javax.swing.JLabel();
        classSelection = new javax.swing.JComboBox<>();
        PanelVermelho = new javax.swing.JPanel();
        CheckCura = new javax.swing.JCheckBox();
        CheckIntimidação = new javax.swing.JCheckBox();
        CheckFurtividade = new javax.swing.JCheckBox();
        CheckAtaqueDeEspasdas = new javax.swing.JCheckBox();
        CheckMagiaArcana = new javax.swing.JCheckBox();
        PanelBranco = new javax.swing.JPanel();
        radioHumano = new javax.swing.JRadioButton();
        radioElfo = new javax.swing.JRadioButton();
        radioAnao = new javax.swing.JRadioButton();
        radioHalfling = new javax.swing.JRadioButton();
        radioOrc = new javax.swing.JRadioButton();

        jRadioButton3.setForeground(new java.awt.Color(153, 0, 0));
        jRadioButton3.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRosa.setBackground(new java.awt.Color(255, 204, 204));

        TxtNomeField.setBackground(new java.awt.Color(153, 0, 0));
        TxtNomeField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        TxtNomeField.setForeground(new java.awt.Color(255, 255, 255));
        TxtNomeField.setText("Nome");

        TxtIdadeField.setBackground(new java.awt.Color(255, 255, 255));
        TxtIdadeField.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        TxtIdadeField.setForeground(new java.awt.Color(153, 0, 0));
        TxtIdadeField.setText("Idade");

        BtnEnter.setBackground(new java.awt.Color(153, 0, 0));
        BtnEnter.setText("Enter");
        BtnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnterActionPerformed(evt);
            }
        });

        racaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        racaLabel.setForeground(new java.awt.Color(255, 255, 255));
        racaLabel.setText("Raça");

        classLabel.setBackground(new java.awt.Color(255, 255, 255));
        classLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classLabel.setForeground(new java.awt.Color(255, 255, 255));
        classLabel.setText("Class");

        habilidadesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        habilidadesLabel.setForeground(new java.awt.Color(255, 255, 255));
        habilidadesLabel.setText("Habilidades ");

        classSelection.setBackground(new java.awt.Color(153, 0, 0));
        classSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guerreiro", "Mago", "Ladino", "Clérigo", "Bárbaro" }));

        PanelVermelho.setBackground(new java.awt.Color(153, 0, 0));

        CheckCura.setForeground(new java.awt.Color(255, 255, 255));
        CheckCura.setText("Cura");
        CheckCura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCuraActionPerformed(evt);
            }
        });

        CheckIntimidação.setForeground(new java.awt.Color(255, 255, 255));
        CheckIntimidação.setText("Intimidação");

        CheckFurtividade.setForeground(new java.awt.Color(255, 255, 255));
        CheckFurtividade.setText("Furtividade ");

        CheckAtaqueDeEspasdas.setForeground(new java.awt.Color(255, 255, 255));
        CheckAtaqueDeEspasdas.setText("Ataque com duas armas");
        CheckAtaqueDeEspasdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAtaqueDeEspasdasActionPerformed(evt);
            }
        });

        CheckMagiaArcana.setForeground(new java.awt.Color(255, 255, 255));
        CheckMagiaArcana.setText("Magia arcana");

        javax.swing.GroupLayout PanelVermelhoLayout = new javax.swing.GroupLayout(PanelVermelho);
        PanelVermelho.setLayout(PanelVermelhoLayout);
        PanelVermelhoLayout.setHorizontalGroup(
            PanelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVermelhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckAtaqueDeEspasdas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelVermelhoLayout.createSequentialGroup()
                        .addGroup(PanelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckFurtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckIntimidação, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckCura, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckMagiaArcana))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelVermelhoLayout.setVerticalGroup(
            PanelVermelhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVermelhoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CheckAtaqueDeEspasdas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckMagiaArcana)
                .addGap(8, 8, 8)
                .addComponent(CheckFurtividade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckIntimidação)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckCura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBranco.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(radioHumano);
        radioHumano.setForeground(new java.awt.Color(153, 0, 0));
        radioHumano.setText("Humano");
        radioHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHumanoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioElfo);
        radioElfo.setForeground(new java.awt.Color(153, 0, 0));
        radioElfo.setText("Elfo");
        radioElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioElfoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioAnao);
        radioAnao.setForeground(new java.awt.Color(153, 0, 0));
        radioAnao.setText("Anao");

        buttonGroup1.add(radioHalfling);
        radioHalfling.setForeground(new java.awt.Color(153, 0, 0));
        radioHalfling.setText("Halfling");
        radioHalfling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHalflingActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioOrc);
        radioOrc.setForeground(new java.awt.Color(153, 0, 0));
        radioOrc.setText("Orc");

        javax.swing.GroupLayout PanelBrancoLayout = new javax.swing.GroupLayout(PanelBranco);
        PanelBranco.setLayout(PanelBrancoLayout);
        PanelBrancoLayout.setHorizontalGroup(
            PanelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBrancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioHalfling)
                    .addComponent(radioOrc)
                    .addComponent(radioHumano)
                    .addComponent(radioElfo)
                    .addComponent(radioAnao))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelBrancoLayout.setVerticalGroup(
            PanelBrancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBrancoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(radioHumano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioElfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioAnao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioHalfling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioOrc)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelRosaLayout = new javax.swing.GroupLayout(PanelRosa);
        PanelRosa.setLayout(PanelRosaLayout);
        PanelRosaLayout.setHorizontalGroup(
            PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRosaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelRosaLayout.createSequentialGroup()
                            .addComponent(classSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(81, 81, 81))
                        .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classLabel)
                            .addGroup(PanelRosaLayout.createSequentialGroup()
                                .addComponent(TxtNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtIdadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(habilidadesLabel)
                    .addComponent(PanelVermelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRosaLayout.createSequentialGroup()
                        .addComponent(PanelBranco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(BtnEnter)
                        .addGap(15, 15, 15))
                    .addGroup(PanelRosaLayout.createSequentialGroup()
                        .addComponent(racaLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelRosaLayout.setVerticalGroup(
            PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRosaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIdadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(classLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRosaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(habilidadesLabel)
                            .addComponent(racaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PanelVermelho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRosaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEnter)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRosa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioElfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioElfoActionPerformed

    private void radioHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHumanoActionPerformed
        
    }//GEN-LAST:event_radioHumanoActionPerformed

    private void BtnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnterActionPerformed
    
        String Nome = TxtNomeField.getText();
        String Idade = TxtIdadeField.getText();
        String Clas = (String) classSelection.getSelectedItem();
        
        String Raca = "";
       
        
        //Raca
        
 
        
        if(radioHumano.isSelected()){
            Raca = "Humano";
        };
    
        if(radioElfo.isSelected()){
            Raca = "Elfo";
        };  
        
        if(radioAnao.isSelected()){
            Raca = "Anao";
        };
        
        if(radioHalfling.isSelected()){
            Raca = "Halfling";
        };
        
        if(radioOrc.isSelected()){
            Raca = "Orc";
        };   
        
        // Habilidades
         
        ArrayList<String> HabilidadesProficiencia = new ArrayList<>();
        
        if(CheckAtaqueDeEspasdas.isSelected()){
            HabilidadesProficiencia.add(CheckAtaqueDeEspasdas.getText());
        };
        
        if(CheckMagiaArcana.isSelected()){
            HabilidadesProficiencia.add(CheckMagiaArcana.getText()); 
        }; 
        
        if(CheckFurtividade.isSelected()){
             HabilidadesProficiencia.add(CheckFurtividade.getText());
        };
        
        if(CheckIntimidação.isSelected()){
             HabilidadesProficiencia.add(CheckIntimidação.getText());
        };
        
        if(CheckCura.isSelected()){
            HabilidadesProficiencia.add(CheckCura.getText());
        };
        
        new Estatisticas(Nome, Idade, Clas, Raca, HabilidadesProficiencia).setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_BtnEnterActionPerformed

    private void CheckCuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckCuraActionPerformed

    private void radioHalflingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHalflingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHalflingActionPerformed

    private void CheckAtaqueDeEspasdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAtaqueDeEspasdasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckAtaqueDeEspasdasActionPerformed

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
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personagem().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnter;
    private javax.swing.JCheckBox CheckAtaqueDeEspasdas;
    private javax.swing.JCheckBox CheckCura;
    private javax.swing.JCheckBox CheckFurtividade;
    private javax.swing.JCheckBox CheckIntimidação;
    private javax.swing.JCheckBox CheckMagiaArcana;
    private javax.swing.JPanel PanelBranco;
    private javax.swing.JPanel PanelRosa;
    private javax.swing.JPanel PanelVermelho;
    private javax.swing.JTextField TxtIdadeField;
    private javax.swing.JTextField TxtNomeField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel classLabel;
    private javax.swing.JComboBox<String> classSelection;
    private javax.swing.JLabel habilidadesLabel;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel racaLabel;
    private javax.swing.JRadioButton radioAnao;
    private javax.swing.JRadioButton radioElfo;
    private javax.swing.JRadioButton radioHalfling;
    private javax.swing.JRadioButton radioHumano;
    private javax.swing.JRadioButton radioOrc;
    // End of variables declaration//GEN-END:variables
}
