/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import Menu.Comandos;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class JCadEstabelecimento extends javax.swing.JFrame {

    /**
     * Creates new form JCadEstabelecimento
     */
    public JCadEstabelecimento() {
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
        JL_nome = new javax.swing.JLabel();
        JF_nome = new javax.swing.JTextField();
        JL_cnpj = new javax.swing.JLabel();
        JF_cnpj = new javax.swing.JTextField();
        JC_tipo = new javax.swing.JComboBox();
        JL_tipo = new javax.swing.JLabel();
        JL_desc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JA_desc = new javax.swing.JTextArea();
        JB_cadastrar = new javax.swing.JButton();
        JB_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JT_rua = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JT_num = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JT_bairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JT_cidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JC_UF = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL_title.setFont(new java.awt.Font("Traditional Arabic", 2, 36)); // NOI18N
        JL_title.setForeground(new java.awt.Color(204, 0, 51));
        JL_title.setText("Estabelecimento");

        JL_nome.setText("Nome:");

        JL_cnpj.setText("CNPJ:");
        JL_cnpj.setToolTipText("");

        JC_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alimentação", "Lazer e Turismo", "Hospedagem" }));

        JL_tipo.setText("Tipo:");

        JL_desc.setText("Descrição:");

        JA_desc.setColumns(20);
        JA_desc.setRows(5);
        jScrollPane1.setViewportView(JA_desc);

        JB_cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JB_cadastrar.setText("Cadastrar");
        JB_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_cadastrarActionPerformed(evt);
            }
        });

        JB_voltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JB_voltar.setText("Voltar");
        JB_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_voltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Rua:");

        jLabel2.setText("Numero:");

        jLabel3.setText("Bairro:");

        JT_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_bairroActionPerformed(evt);
            }
        });

        jLabel4.setText("Cidade:");

        JT_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JT_cidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("UF:");

        JC_UF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_nome)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(JL_cnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(JT_num, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3))
                                            .addComponent(JT_cidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(JC_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(JT_bairro)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JF_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(43, 43, 43)
                                            .addComponent(JL_tipo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JC_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(JT_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(JF_nome))
                        .addGap(268, 268, 268))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JB_cadastrar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JL_desc))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JL_title, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JL_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_nome)
                    .addComponent(JF_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JF_cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_cnpj)
                    .addComponent(JL_tipo)
                    .addComponent(JC_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JT_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JT_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JT_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JT_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JC_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(JL_desc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(430, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JB_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_voltarActionPerformed
        JDono jd = new JDono();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        jd.setLocation((tela.width - jd.getSize().width)/2,(tela.height - jd.getSize().height)/2);
        jd.show();
       
        this.dispose();
    }//GEN-LAST:event_JB_voltarActionPerformed

    private void JB_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_cadastrarActionPerformed
        Comandos cd = new Comandos();
        
        try{
            if(!cd.confere(JF_cnpj.getText(), "o CNPJ"))                        return;
            if(!cd.confere(JF_nome.getText(), "o nome do estabelecimento"))     return;
            if(!cd.confere(JT_rua.getText(), "a rua do estabelecimento"))       return;
            if(!cd.confere(JT_num.getText(), "o numero"))                       return;
            if(!cd.confere(JT_cidade.getText(), "a cidade"))                    return;
            if(!cd.confere(JT_bairro.getText(), "o bairro do estabelecimento")) return;
            if(!cd.confere(JC_tipo.toString(), "o tipo do estabelecimento"))     return;

            if(Integer.parseInt(JF_cnpj.getText()) > 0){
                cd.inserirEstabelecimento(UsuarioAtual.getInstace().ID,Integer.parseInt(JF_cnpj.getText()),
                        JF_nome.getText() ,JA_desc.getText(),JC_tipo.getName(),JT_rua.getText(),
                       Integer.parseInt(JT_num.getText()),JT_cidade.getText(), JC_UF.getName(),JT_bairro.getText() );
            }
        
        }catch(NumberFormatException numberFormatException){
            JOptionPane.showMessageDialog(null, "CNPJ invalido!");
        }
    }//GEN-LAST:event_JB_cadastrarActionPerformed

    private void JT_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_cidadeActionPerformed

    private void JT_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JT_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JT_bairroActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadEstabelecimento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JA_desc;
    private javax.swing.JButton JB_cadastrar;
    private javax.swing.JButton JB_voltar;
    private javax.swing.JComboBox JC_UF;
    private javax.swing.JComboBox JC_tipo;
    private javax.swing.JTextField JF_cnpj;
    private javax.swing.JTextField JF_nome;
    private javax.swing.JLabel JL_cnpj;
    private javax.swing.JLabel JL_desc;
    private javax.swing.JLabel JL_nome;
    private javax.swing.JLabel JL_tipo;
    private javax.swing.JLabel JL_title;
    private javax.swing.JTextField JT_bairro;
    private javax.swing.JTextField JT_cidade;
    private javax.swing.JTextField JT_num;
    private javax.swing.JTextField JT_rua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
