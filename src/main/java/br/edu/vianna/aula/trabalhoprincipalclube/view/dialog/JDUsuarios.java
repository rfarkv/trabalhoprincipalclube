/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.aula.trabalhoprincipalclube.view.dialog;


import br.edu.vianna.aula.trabalhoprincipalclube.database.connection.dao.DAOUsuario;
import br.edu.vianna.aula.trabalhoprincipalclube.usuario.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author suporte
 */
public class JDUsuarios extends javax.swing.JDialog {

    public void alterarRegisto(Usuario u) {
        //criado pra alterar usuarios
        jtID.setText(String.valueOf(u.getId()));
        jtNome.setText(String.valueOf(u.getNome()));
        jtUsername.setText(String.valueOf(u.getUserName()));
        jtSenha.setText(String.valueOf(u.getSenha()));
    }
    
    

    /**
     * Creates new form JDAnimais
     */
    public JDUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jtID.setText("");//ao abrir jdialog seta vazio no atributo que representa a chave primaria, 
            //isso foi feito para permitir a checagem se é um inser ou um update na hora de clicar no botao salvar
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
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jlUsername = new javax.swing.JLabel();
        jbGravarUsuario = new javax.swing.JButton();
        jtUsername = new javax.swing.JTextField();
        jtSenha = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jbSairConfig = new javax.swing.JButton();
        jtID = new javax.swing.JTextField();
        jlID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro de Usuários"));

        jlNome.setText("Nome");

        jlUsername.setText("Username");

        jbGravarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-file (2).png"))); // NOI18N
        jbGravarUsuario.setToolTipText("Salvar");
        jbGravarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarUsuarioActionPerformed(evt);
            }
        });

        jlSenha.setText("Senha");

        jbSairConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel (1).png"))); // NOI18N
        jbSairConfig.setToolTipText("Sair");
        jbSairConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairConfigActionPerformed(evt);
            }
        });

        jtID.setFocusable(false);

        jlID.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNome)
                            .addComponent(jlUsername)
                            .addComponent(jlSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGravarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSairConfig)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlSenha)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGravarUsuario)
                    .addComponent(jbSairConfig)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlID)))
                .addContainerGap())
        );

        jtNome.getAccessibleContext().setAccessibleName("");
        jtNome.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairConfigActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jbSairConfigActionPerformed

    private void jbGravarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarUsuarioActionPerformed
        //INSERIR
        Usuario u = new Usuario(0, jtNome.getText(), jtUsername.getText(),
                jtSenha.getText());
        try {
            if(!jtID.getText().isEmpty()){//se o campo da chave primeira desse objeto estiver 
                //vazio entao vai ser um insert, caso contrario vai ser um update
                u.setId(Integer.parseInt(jtID.getText()));
                new DAOUsuario().alterar(u);
                JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.");

            } else {
                new DAOUsuario().inserir(u);
                JOptionPane.showMessageDialog(null, "Registro inserido com sucesso.");

            }
            
            setVisible(false);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco ou na consulta.");
        }
    }//GEN-LAST:event_jbGravarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(JDUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDUsuarios dialog = new JDUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGravarUsuario;
    private javax.swing.JButton jbSairConfig;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtSenha;
    private javax.swing.JTextField jtUsername;
    // End of variables declaration//GEN-END:variables
}
