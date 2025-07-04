/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uc9.pokemon;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Treinador extends javax.swing.JFrame {

    ArrayList<Pokemon> computador = new ArrayList<>(); // Criar um ArrayList
    ArrayList<Pokemon> mochila = new ArrayList<>(); // Criar um ArrayList
    
    private DefaultListModel<String> modeloComputador;
    private DefaultListModel<String> modeloMochila;
    
    /**
     * Creates new form Treinador
     */
    public Treinador() {
         
        initComponents();
        modeloComputador = new DefaultListModel<>();
        modeloMochila = new DefaultListModel<>();
         
        listaComputador.setModel(modeloComputador);
        listaMochila.setModel(modeloMochila);
        
        
        computador.add(new Pokemon("Squirtle", "Água", 100));
        computador.add(new Pokemon("Bulbasaur", "Grama", 31));
        computador.add(new Pokemon("zoroark", "Normal", 80));
        computador.add(new Pokemon("Gengar", "Fantasma", 50));
        computador.add(new Pokemon("Snorlax", "Normal", 40));
        computador.add(new Pokemon("Eevee", "Normal", 10));
        computador.add(new Pokemon("Magikarp", "Água", 55));
        computador.add(new Pokemon("Dragonite", "Dragão", 25));
        computador.add(new Pokemon("Mewtwo", "Psíquico", 30));
        computador.add(new Pokemon("Arcanine", "Fogo", 18));
        computador.add(new Pokemon("Lapras", "Água", 20));
        computador.add(new Pokemon("Gyarados", "Água", 22));
        computador.add(new Pokemon("Vaporeon", "Água", 19));
        computador.add(new Pokemon("Jolteon", "Elétrico", 18));
        computador.add(new Pokemon("Flareon", "Fogo", 19));
        computador.add(new Pokemon("Alakazam", "Psíquico", 21));
        computador.add(new Pokemon("Gyarados", "Lutador", 23));
        computador.add(new Pokemon("Ditto", "Normal", 70));
      
        //getSize.modeloMochila( < q 6
         
        
     for (Pokemon poke: computador) {
    modeloComputador.addElement(poke.nome); 
}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnRemover = new javax.swing.JButton();
        BtnAdicionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaMochila = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaComputador = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        BtnRemover.setBackground(new java.awt.Color(255, 255, 255));
        BtnRemover.setForeground(new java.awt.Color(0, 0, 0));
        BtnRemover.setText("<-------");
        BtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoverActionPerformed(evt);
            }
        });

        BtnAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        BtnAdicionar.setForeground(new java.awt.Color(0, 0, 0));
        BtnAdicionar.setText("------->");
        BtnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdicionarActionPerformed(evt);
            }
        });

        listaMochila.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(listaMochila);

        listaComputador.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane4.setViewportView(listaComputador);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Computador");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mochila");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(175, 175, 175))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAdicionar)
                        .addGap(349, 349, 349)
                        .addComponent(BtnRemover))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAdicionar)
                    .addComponent(BtnRemover))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdicionarActionPerformed
        int index = listaComputador.getSelectedIndex();

    if (index == -1) {
        JOptionPane.showMessageDialog(this, "Selecione um Pokémon primeiro!");
        return;
    }

    if (mochila.size() >= 6) {
        JOptionPane.showMessageDialog(this, "A mochila já tem 6 Pokémon!");
        return;
    }

    // Pega o Pokémon selecionado
    Pokemon pokemon = computador.get(index);

    // Move o Pokémon do computador para a mochila
    computador.remove(index);
    mochila.add(pokemon);

    // Atualiza as listas visuais
    atualizarLista();

    
    }//GEN-LAST:event_BtnAdicionarActionPerformed

    private void BtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoverActionPerformed

        //Pega o índice do item selecionado na lista da minha mochila
        int index = listaMochila.getSelectedIndex();
        
        //Se eu não selecionei nada ainda, ele mostra uma janela que contém a mensagem abaixo
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um Pokémon na mochila!");
            return;
        }
        
        // A variável pokemon pega o pokemon de acordo com o índice e armazena nela
        Pokemon pokemon = mochila.get(index);
        
        // Aqui, eu removo o pokemon do ArrayList mochila
        mochila.remove(index);
        
        // Aqui, eu adiciono o pokemon ao ArrayList computador
        computador.add(0,pokemon);

        atualizarLista();
    }//GEN-LAST:event_BtnRemoverActionPerformed

        private void atualizarLista() {
         // Limpa os modelos das listas
         modeloComputador.clear();
         modeloMochila.clear();

        // Atualiza a lista do computador com os Pokémon disponíveis
        // "Para cada poke dentro do ArrayList computador, faça algo"
        for (Pokemon poke : computador) {
            modeloComputador.addElement(poke.nome);
}

        for (Pokemon poke : mochila) {
             modeloMochila.addElement(poke.nome + " do tipo " + poke.tipo + " de nível " + poke.nivel);
}

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
            java.util.logging.Logger.getLogger(Treinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treinador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdicionar;
    private javax.swing.JButton BtnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listaComputador;
    private javax.swing.JList<String> listaMochila;
    // End of variables declaration//GEN-END:variables
}
