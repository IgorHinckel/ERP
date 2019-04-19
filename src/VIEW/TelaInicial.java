package VIEW;

import java.awt.Color;

/**
 * @author igorh
 */
public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRelatorioReceita = new javax.swing.JButton();
        jButtonCadastroDespesa = new javax.swing.JButton();
        jLabelRelatorios = new javax.swing.JLabel();
        jButtonCadastroRecebedor = new javax.swing.JButton();
        jLabelCadastros1 = new javax.swing.JLabel();
        jButtonCadastroPagante = new javax.swing.JButton();
        jButtonReceita2 = new javax.swing.JButton();
        jButtonRelatorioDespesas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonAplicacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ERP - MAIN");
        setAutoRequestFocus(false);
        setResizable(false);

        jButtonRelatorioReceita.setText("Relatório de Receitas");

        jButtonCadastroDespesa.setText("Cadastrar Despesa");
        jButtonCadastroDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroDespesaActionPerformed(evt);
            }
        });

        jLabelRelatorios.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelRelatorios.setText("Relatórios");

        jButtonCadastroRecebedor.setText("Cadastrar Recebedor");
        jButtonCadastroRecebedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroRecebedorActionPerformed(evt);
            }
        });

        jLabelCadastros1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabelCadastros1.setText("Cadastros");

        jButtonCadastroPagante.setText("Cadastrar Pagante");
        jButtonCadastroPagante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroPaganteActionPerformed(evt);
            }
        });

        jButtonReceita2.setText("Cadastrar Receita");
        jButtonReceita2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceita2ActionPerformed(evt);
            }
        });

        jButtonRelatorioDespesas.setText("Relatório Despesas");
        jButtonRelatorioDespesas.setPreferredSize(new java.awt.Dimension(285, 55));

        jButton1.setText("Receitas x Despesas");

        jButtonAplicacoes.setText("Aplicações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonReceita2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCadastroDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCadastroRecebedor, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCadastroPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRelatorioReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonRelatorioDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabelCadastros1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelCadastros1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReceita2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastroRecebedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastroDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastroPagante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRelatorioReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRelatorioDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAplicacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Chama tela de cadastro de Receita
    private void jButtonReceita2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceita2ActionPerformed
        CadastroReceita callCadastroReceita = new CadastroReceita();
        callCadastroReceita.setVisible(true);
    }//GEN-LAST:event_jButtonReceita2ActionPerformed

    //Chama tela de cadastro de Despesa
    private void jButtonCadastroDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroDespesaActionPerformed
        CadastroDespesa callCadastroDespesa = new CadastroDespesa();
        callCadastroDespesa.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroDespesaActionPerformed

    //Chama tela de cadastro de Recebedor
    private void jButtonCadastroRecebedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroRecebedorActionPerformed
        CadastroRecebedor callCadastroRecebedor = new CadastroRecebedor();
        callCadastroRecebedor.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroRecebedorActionPerformed

    //Chama tela de cadastro de Pagante
    private void jButtonCadastroPaganteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroPaganteActionPerformed
        CadastroPagante callCadastroPagante = new CadastroPagante();
        callCadastroPagante.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroPaganteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAplicacoes;
    private javax.swing.JButton jButtonCadastroDespesa;
    private javax.swing.JButton jButtonCadastroPagante;
    private javax.swing.JButton jButtonCadastroRecebedor;
    private javax.swing.JButton jButtonReceita2;
    private javax.swing.JButton jButtonRelatorioDespesas;
    private javax.swing.JButton jButtonRelatorioReceita;
    private javax.swing.JLabel jLabelCadastros1;
    private javax.swing.JLabel jLabelRelatorios;
    // End of variables declaration//GEN-END:variables
}
