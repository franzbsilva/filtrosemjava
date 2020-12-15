package filtro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.Timer;


/**
 *
 * @author franz
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private Timer t;
    private final ActionListener ac;
    int x = 0;
    public  TelaPrincipal() {
        
        ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                x = x + 1;
                BarradeProgresso.setValue(x);
                
                if(BarradeProgresso.getValue()== 100){
                    
                    t.stop();
                    
                }
            }
        };
        t = new Timer(10, ac);
        t.start();
        initComponents();
        
    }
    
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jl_imagem = new javax.swing.JLabel();
        jB_adicionaImagem = new javax.swing.JButton();
        btn_negativa = new javax.swing.JRadioButton();
        btn_lumiar = new javax.swing.JRadioButton();
        btn_vermelho = new javax.swing.JRadioButton();
        btn_sepia = new javax.swing.JRadioButton();
        btn_ecasinza = new javax.swing.JRadioButton();
        bt_Salvar = new javax.swing.JToggleButton();
        btn_verde = new javax.swing.JRadioButton();
        btn_azul = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Amarelo = new javax.swing.JRadioButton();
        btn_ciano = new javax.swing.JRadioButton();
        BarradeProgresso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jl_imagem.setBackground(new java.awt.Color(240, 0, 255));
        jl_imagem.setForeground(new java.awt.Color(255, 51, 102));
        jl_imagem.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jB_adicionaImagem.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jB_adicionaImagem.setText("Escolhe Foto");
        jB_adicionaImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_adicionaImagemActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_negativa);
        btn_negativa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_negativa.setText("Negativa");

        buttonGroup1.add(btn_lumiar);
        btn_lumiar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_lumiar.setText("Limiarizar");
        btn_lumiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lumiarActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_vermelho);
        btn_vermelho.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_vermelho.setForeground(new java.awt.Color(255, 0, 0));
        btn_vermelho.setText("Vermelho");
        btn_vermelho.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_vermelho.setFocusTraversalPolicyProvider(true);
        btn_vermelho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_vermelhoStateChanged(evt);
            }
        });
        btn_vermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vermelhoActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_sepia);
        btn_sepia.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_sepia.setText("Sepia");
        btn_sepia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sepiaActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_ecasinza);
        btn_ecasinza.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_ecasinza.setSelected(true);
        btn_ecasinza.setText("Escala Cinza");

        bt_Salvar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        bt_Salvar.setText("Imagens");
        bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvarActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_verde);
        btn_verde.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_verde.setForeground(new java.awt.Color(0, 105, 0));
        btn_verde.setText("Verde");
        btn_verde.setFocusTraversalPolicyProvider(true);
        btn_verde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_verdeStateChanged(evt);
            }
        });
        btn_verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verdeActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_azul);
        btn_azul.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_azul.setForeground(new java.awt.Color(0, 0, 204));
        btn_azul.setText("Azul");
        btn_azul.setFocusTraversalPolicyProvider(true);
        btn_azul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_azulStateChanged(evt);
            }
        });
        btn_azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_azulActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Filtros");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Filtros Cores");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(btn_Amarelo);
        btn_Amarelo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_Amarelo.setForeground(new java.awt.Color(209, 209, 0));
        btn_Amarelo.setText("Amarelo");
        btn_Amarelo.setFocusTraversalPolicyProvider(true);
        btn_Amarelo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_AmareloStateChanged(evt);
            }
        });
        btn_Amarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AmareloActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn_ciano);
        btn_ciano.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btn_ciano.setForeground(new java.awt.Color(0, 204, 204));
        btn_ciano.setText("Ciano");
        btn_ciano.setFocusTraversalPolicyProvider(true);
        btn_ciano.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_cianoStateChanged(evt);
            }
        });
        btn_ciano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cianoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_adicionaImagem)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_lumiar)
                                    .addComponent(btn_sepia)
                                    .addComponent(btn_ecasinza)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_negativa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_vermelho)
                                    .addComponent(btn_verde)
                                    .addComponent(btn_azul)
                                    .addComponent(btn_Amarelo)
                                    .addComponent(btn_ciano)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(bt_Salvar)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_adicionaImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ecasinza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_lumiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sepia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_negativa)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_vermelho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_verde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_azul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Amarelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ciano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Salvar))
                    .addComponent(jl_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        BarradeProgresso.setForeground(new java.awt.Color(255, 51, 51));
        BarradeProgresso.setBorderPainted(false);
        BarradeProgresso.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                BarradeProgressoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BarradeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarradeProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_adicionaImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_adicionaImagemActionPerformed
    AplicaFiltros test = new AplicaFiltros(); 
         
    
    if(btn_vermelho.isSelected()){
        test.vermelho();
        }
    if(btn_verde.isSelected()){
        test.verde();
        }
    if(btn_azul.isSelected()){
        test.azul();
        }
    if(btn_Amarelo.isSelected()){
        test.amarelo();
        }
    if(btn_ciano.isSelected()){
        test.ciano();
        }
    if(btn_ecasinza.isSelected()){
        test.cinza();
    }
    if(btn_lumiar.isSelected()){
        test.limiariza();
    }
    if(btn_negativa.isSelected()){
        test.negativo();
    }
    if(btn_sepia.isSelected()){
        test.sepia();
    }
    
        
    }//GEN-LAST:event_jB_adicionaImagemActionPerformed

    private void btn_sepiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sepiaActionPerformed
        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_sepiaActionPerformed

    private void btn_vermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vermelhoActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_btn_vermelhoActionPerformed

    private void btn_vermelhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_vermelhoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vermelhoStateChanged

    private void BarradeProgressoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BarradeProgressoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BarradeProgressoAncestorAdded

    private void btn_lumiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lumiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lumiarActionPerformed

    private void btn_verdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_verdeStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verdeStateChanged

    private void btn_verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_verdeActionPerformed

    private void btn_azulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_azulStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_azulStateChanged

    private void btn_azulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_azulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_azulActionPerformed

    private void btn_AmareloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_AmareloStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AmareloStateChanged

    private void btn_AmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AmareloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AmareloActionPerformed

    private void btn_cianoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_cianoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cianoStateChanged

    private void btn_cianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cianoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cianoActionPerformed

    private void bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvarActionPerformed
        
        try {
            Process exec = Runtime.getRuntime().exec("explorer C:\\Users\\Public\\Pictures");
        } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_bt_SalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarradeProgresso;
    private javax.swing.JToggleButton bt_Salvar;
    private javax.swing.JRadioButton btn_Amarelo;
    private javax.swing.JRadioButton btn_azul;
    private javax.swing.JRadioButton btn_ciano;
    private javax.swing.JRadioButton btn_ecasinza;
    private javax.swing.JRadioButton btn_lumiar;
    private javax.swing.JRadioButton btn_negativa;
    private javax.swing.JRadioButton btn_sepia;
    private javax.swing.JRadioButton btn_verde;
    private javax.swing.JRadioButton btn_vermelho;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jB_adicionaImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jl_imagem;
    // End of variables declaration//GEN-END:variables
}
