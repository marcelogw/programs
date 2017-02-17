/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.awt.Dimension;
import java.awt.Toolkit;
import Menu.*;

/**
 *
 * @author WTF!?
 */
public class JComporMensagem extends javax.swing.JFrame {

    /**
     * Creates new form JComporMensagem
     */
    public JComporMensagem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_title = new javax.swing.JLabel();
        JL_dest = new javax.swing.JLabel();
        JP_msg = new javax.swing.JScrollPane();
        JT_area = new javax.swing.JTextArea();
        JB_voltar = new javax.swing.JButton();
        JB_eviar = new javax.swing.JButton();
        JT_dest = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL_title.setFont(new java.awt.Font("Traditional Arabic", 2, 36)); // NOI18N
        JL_title.setForeground(new java.awt.Color(204, 0, 51));
        JL_title.setText("Mensagens");

        JL_dest.setText("Destinatário:");

        JT_area.setColumns(20);
        JT_area.setRows(5);
        JP_msg.setViewportView(JT_area);

        JB_voltar.setText("Voltar");
        JB_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_voltarActionPerformed(evt);
            }
        });

        JB_eviar.setText("Enviar");
        JB_eviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_eviarActionPerformed(evt);
            }
        });

        JT_dest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_destActionPerformed(evt);
            }
        });

        jLabel1.setText("Mensagem:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JB_voltar)
                                .addGap(297, 297, 297)
                                .addComponent(JB_eviar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(JL_dest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JT_dest, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JL_title, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JP_msg)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_dest)
                    .addComponent(JT_dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(JP_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_eviar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_voltarActionPerformed
         JMensagem jm = new JMensagem();
       Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        jm.setLocation((tela.width - jm.getSize().width)/2,(tela.height - jm.getSize().height)/2);
        jm.show();
       
        this.dispose();
    }//GEN-LAST:event_JB_voltarActionPerformed

    private void JT_destActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_destActionPerformed

    }//GEN-LAST:event_JT_destActionPerformed

    private void JB_eviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_eviarActionPerformed
		Comandos cd = new Comandos();
		
		cd.enviaMensagem(UsuarioAtual.getInstace().ID, JT_dest.getText(), JT_area.getText());
    }//GEN-LAST:event_JB_eviarActionPerformed

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
            java.util.logging.Logger.getLogger(JComporMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JComporMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JComporMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JComporMensagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JComporMensagem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_eviar;
    private javax.swing.JButton JB_voltar;
    private javax.swing.JLabel JL_dest;
    private javax.swing.JLabel JL_title;
    private javax.swing.JScrollPane JP_msg;
    private javax.swing.JTextArea JT_area;
    private javax.swing.JTextField JT_dest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
