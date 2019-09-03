/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.PacienteDAO;
import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import com.ifpb.projetopoo.model.Paciente;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Tela_Atualizar_Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Atualizar_Paciente
     */
    
    private Paciente paciente;
    private final PacienteDAO dao;
    public Tela_Atualizar_Paciente(Paciente paciente) {
        dao = new PacienteDAO();
        setExtendedState(MAXIMIZED_BOTH);
        this.paciente = paciente;
        initComponents();
        campoCpf.setEnabled(false);
        preencherCampos();
    }

    public Tela_Atualizar_Paciente(){
        initComponents();
        dao = new PacienteDAO();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Right_Menu4 = new javax.swing.JPanel();
        CPF4 = new javax.swing.JLabel();
        Usuario45 = new javax.swing.JLabel();
        campoCpf = new javax.swing.JFormattedTextField();
        campoNascimento = new javax.swing.JFormattedTextField();
        Usuario46 = new javax.swing.JLabel();
        Usuario47 = new javax.swing.JLabel();
        Usuario48 = new javax.swing.JLabel();
        Usuario49 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        Usuario52 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JFormattedTextField();
        Left_Menu = new javax.swing.JPanel();
        Text_1 = new javax.swing.JLabel();
        Text_2 = new javax.swing.JLabel();
        Text_3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Right_Menu4.setBackground(new java.awt.Color(102, 51, 153));

        CPF4.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        CPF4.setForeground(new java.awt.Color(241, 231, 254));
        CPF4.setText("CPF:");

        Usuario45.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario45.setForeground(new java.awt.Color(241, 231, 254));
        Usuario45.setText("Nome:");

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        try {
            campoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNascimento.setText("dd/mm/aaaa   ");
        campoNascimento.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNascimentocampoNascimentoActionPerformed(evt);
            }
        });

        Usuario46.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario46.setForeground(new java.awt.Color(241, 231, 254));
        Usuario46.setText("Data de Nascimento:");

        Usuario47.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario47.setForeground(new java.awt.Color(241, 231, 254));
        Usuario47.setText("Email:");

        Usuario48.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario48.setForeground(new java.awt.Color(241, 231, 254));
        Usuario48.setText("Telefone:");

        Usuario49.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        Usuario49.setForeground(new java.awt.Color(241, 231, 254));
        Usuario49.setText("Informações");

        btnCadastrar.setBackground(new java.awt.Color(241, 231, 254));
        btnCadastrar.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnCadastrar.setText("Atualizar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarbtnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(241, 231, 254));
        btnVoltar.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarbtnVoltarActionPerformed(evt);
            }
        });

        campoNome.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomecampoNomeActionPerformed(evt);
            }
        });

        campoEmail.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailcampoEmailActionPerformed(evt);
            }
        });

        campoEndereco.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecocampoRuaActionPerformed(evt);
            }
        });

        Usuario52.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario52.setForeground(new java.awt.Color(241, 231, 254));
        Usuario52.setText("Endereço");

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefone.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        javax.swing.GroupLayout Right_Menu4Layout = new javax.swing.GroupLayout(Right_Menu4);
        Right_Menu4.setLayout(Right_Menu4Layout);
        Right_Menu4Layout.setHorizontalGroup(
            Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_Menu4Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(Usuario49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Right_Menu4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNome)
                    .addGroup(Right_Menu4Layout.createSequentialGroup()
                        .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNascimento)
                            .addGroup(Right_Menu4Layout.createSequentialGroup()
                                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Usuario45)
                                    .addComponent(Usuario52)
                                    .addComponent(Usuario46)
                                    .addComponent(Usuario48))
                                .addGap(0, 179, Short.MAX_VALUE))
                            .addComponent(campoTelefone))
                        .addGap(40, 40, 40)
                        .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Right_Menu4Layout.createSequentialGroup()
                                .addGap(0, 152, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrar))
                            .addComponent(campoEmail)
                            .addComponent(campoCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addGroup(Right_Menu4Layout.createSequentialGroup()
                                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPF4)
                                    .addComponent(Usuario47))
                                .addGap(0, 356, Short.MAX_VALUE))))
                    .addComponent(campoEndereco))
                .addGap(41, 41, 41))
        );
        Right_Menu4Layout.setVerticalGroup(
            Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_Menu4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Usuario49)
                .addGap(30, 30, 30)
                .addComponent(Usuario45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario46)
                    .addComponent(CPF4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario48)
                    .addComponent(Usuario47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Usuario52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
        );

        jScrollPane1.setViewportView(Right_Menu4);

        Left_Menu.setBackground(new java.awt.Color(36, 37, 42));
        Left_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        Text_1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_1.setForeground(new java.awt.Color(241, 231, 254));
        Text_1.setText("Cadastro");

        Text_2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_2.setForeground(new java.awt.Color(241, 231, 254));
        Text_2.setText("de");

        Text_3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_3.setForeground(new java.awt.Color(241, 231, 254));
        Text_3.setText("Paciente");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Left_MenuLayout = new javax.swing.GroupLayout(Left_Menu);
        Left_Menu.setLayout(Left_MenuLayout);
        Left_MenuLayout.setHorizontalGroup(
            Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(Left_MenuLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_3)
                            .addComponent(Text_1))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Left_MenuLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Text_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Left_MenuLayout.setVerticalGroup(
            Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_MenuLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Left_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Left_Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNascimentocampoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNascimentocampoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNascimentocampoNascimentoActionPerformed

    private void btnCadastrarbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarbtnCadastrarActionPerformed
        // TODO add your handling code here:
        
        
        if (verificarCampos()) {
            String nascimento = campoNascimento.getText();

            int dia = Integer.parseInt(nascimento.substring(0, 2));
            int mes = Integer.parseInt(nascimento.substring(3, 5));
            int ano = Integer.parseInt(nascimento.substring(6, 10));

            if(dao.update(paciente.getCpf(),new Paciente(campoCpf.getText(), campoNome.getText(), LocalDate.of(ano, mes, dia), new Endereco(campoEndereco.getText(), "", "", ""), new Contato(campoEmail.getText(), campoTelefone.getText())))){
                JOptionPane.showMessageDialog(this, "Paciente atualizado com sucesso!");
                new Tela_Principal().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao atualizar paciente");
            }

        }
    }//GEN-LAST:event_btnCadastrarbtnCadastrarActionPerformed

    private void btnVoltarbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarbtnVoltarActionPerformed
        // TODO add your handling code here:
        new Tela_Principal().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnVoltarbtnVoltarActionPerformed

    private void campoNomecampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomecampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomecampoNomeActionPerformed

    private void campoEmailcampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailcampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailcampoEmailActionPerformed

    private void campoEnderecocampoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecocampoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecocampoRuaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Atualizar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Atualizar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Atualizar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Atualizar_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Atualizar_Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF4;
    private javax.swing.JPanel Left_Menu;
    private javax.swing.JPanel Right_Menu4;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    private javax.swing.JLabel Usuario45;
    private javax.swing.JLabel Usuario46;
    private javax.swing.JLabel Usuario47;
    private javax.swing.JLabel Usuario48;
    private javax.swing.JLabel Usuario49;
    private javax.swing.JLabel Usuario52;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JFormattedTextField campoNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
    
    
    
    private boolean verificarCampos() {

        if (campoCpf.getText().equals("   .   .   -  ") || campoEmail.getText().length() == 0
                || campoNascimento.getText().equals("  /  /    ") || campoNome.getText().length() == 0
                || campoEndereco.getText().length() == 0 || campoTelefone.getText().equals("(  )          ")) {

            JOptionPane.showMessageDialog(this, "Algum campo obrigatório não foi preenchido!\nTodos os campos são obrigatórios menos as especificações");

            return false;

        }
        return true;

    }

    

    private void preencherCampos() {
        
        campoCpf.setText(paciente.getCpf());
        campoEmail.setText(paciente.getContato().getEmail());
        campoNascimento.setText("");
        campoNome.setText(paciente.getNome());
        campoEndereco.setText(paciente.getEndereco().getEnderecoCompleto());
        campoTelefone.setText(paciente.getContato().getTelefone());
    }
    
    

}