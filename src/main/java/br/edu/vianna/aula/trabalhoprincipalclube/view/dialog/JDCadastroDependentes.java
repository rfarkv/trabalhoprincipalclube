/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.aula.trabalhoprincipalclube.view.dialog;

import br.edu.vianna.aula.trabalhoprincipalclube.associado.subclass.Associado;
import br.edu.vianna.aula.trabalhoprincipalclube.associado.subclass.Dependente;
import br.edu.vianna.aula.trabalhoprincipalclube.database.connection.dao.DAODependente;
import br.edu.vianna.aula.trabalhoprincipalclube.enums.ETipoDependente;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author suporte
 */
public class JDCadastroDependentes extends javax.swing.JDialog {

    Associado associado = new Associado();

    public JDCadastroDependentes(java.awt.Frame parent, boolean modal, Associado associado) {
        super(parent, modal);
        initComponents();
        this.associado = associado;
        jtID.setText("");//ao abrir jdialog seta vazio no atributo que representa a chave primaria, 
            //isso foi feito para permitir a checagem se é um inser ou um update na hora de clicar no botao salvar
    }
    
    public JDCadastroDependentes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jtID.setText("");//ao abrir jdialog seta vazio no atributo que representa a chave primaria, 
            //isso foi feito para permitir a checagem se é um inser ou um update na hora de clicar no botao salvar
    }
    
    public String radioBoxDependenteVerificar(String sexo){
        if(rbFilho.isSelected()) {
             return ETipoDependente.Filho.toString();
        } else {
             return ETipoDependente.Conjuge.toString();
        }
    }
    
    public void alterarRegisto(Dependente u) {
        //criado pra alterar usuarios
        jtID.setText(String.valueOf(u.getId()));
        jtNome.setText(String.valueOf(u.getNome()));
        jftData.setText(String.valueOf(u.getDataNascimento()));
        setarTipo(u);
    }
        
    public void setarTipo(Dependente u){
        if(u.getTipo().toString().equals("Filho")){
            rbFilho.setSelected(true);
        }else{
            rbConjuge.setSelected(true);
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

        bgSexo = new javax.swing.ButtonGroup();
        bgTipoDependente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtNome = new javax.swing.JTextField();
        jlNome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbFilho = new javax.swing.JRadioButton();
        rbConjuge = new javax.swing.JRadioButton();
        jbGravarDependnete = new javax.swing.JButton();
        jbSairDependente = new javax.swing.JButton();
        jtID = new javax.swing.JTextField();
        jlID = new javax.swing.JLabel();
        jlNascimento = new javax.swing.JLabel();
        jftData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro de Dependentes"));

        jlNome.setText("Nome");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        jPanel2.setToolTipText("");

        bgSexo.add(rbFilho);
        rbFilho.setText("Filho");
        rbFilho.setName("F"); // NOI18N

        bgSexo.add(rbConjuge);
        rbConjuge.setText("Cônjuge");
        rbConjuge.setName("M"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbFilho)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rbConjuge)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbConjuge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFilho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbGravarDependnete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-file (2).png"))); // NOI18N
        jbGravarDependnete.setToolTipText("Salvar");
        jbGravarDependnete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarDependneteActionPerformed(evt);
            }
        });

        jbSairDependente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel (1).png"))); // NOI18N
        jbSairDependente.setToolTipText("Sair");
        jbSairDependente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairDependenteActionPerformed(evt);
            }
        });

        jtID.setFocusable(false);

        jlID.setText("ID");

        jlNascimento.setText("Nasc");

        jftData.setColumns(8);
        try {
            jftData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGravarDependnete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSairDependente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jftData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlNascimento))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlID))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbGravarDependnete)
                        .addComponent(jbSairDependente)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairDependenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairDependenteActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jbSairDependenteActionPerformed

    private void jbGravarDependneteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarDependneteActionPerformed
        //INSERIR
        String tipo = "";
        tipo = radioBoxDependenteVerificar(tipo);
        
        Dependente u = new Dependente(ETipoDependente.valueOf(tipo), associado , 0, jtNome.getText(), jftData.getText());
        try {
            if(!jtID.getText().isEmpty()){//se o campo da chave primeira desse objeto estiver 
                //vazio entao vai ser um insert, caso contrario vai ser um update
                u.setId(Integer.parseInt(jtID.getText()));
                new DAODependente().alterar(u);
                JOptionPane.showMessageDialog(null, "Registro alterado com sucesso.");

            } else {
                new DAODependente().inserirComAssociado(u,associado);
                JOptionPane.showMessageDialog(null, "Registro inserido com sucesso.");
            }
            
            setVisible(false);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco ou na consulta.");
        }
    }//GEN-LAST:event_jbGravarDependneteActionPerformed

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
            java.util.logging.Logger.getLogger(JDCadastroDependentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDCadastroDependentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDCadastroDependentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCadastroDependentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDCadastroDependentes dialog = new JDCadastroDependentes(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.ButtonGroup bgTipoDependente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbGravarDependnete;
    private javax.swing.JButton jbSairDependente;
    private javax.swing.JFormattedTextField jftData;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlNascimento;
    private javax.swing.JLabel jlNome;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNome;
    private javax.swing.JRadioButton rbConjuge;
    private javax.swing.JRadioButton rbFilho;
    // End of variables declaration//GEN-END:variables

    
}