/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.AtendenteDAO;
import com.ifpb.projetopoo.model.Atendente;
import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author IGOR
 */
public class Tela_Cadastro_Atendente extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cadastro_Atendente
     */
    public Tela_Cadastro_Atendente() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left_Menu = new javax.swing.JPanel();
        Text_1 = new javax.swing.JLabel();
        Text_2 = new javax.swing.JLabel();
        Text_3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Right_Menu4 = new javax.swing.JPanel();
        Usuario44 = new javax.swing.JLabel();
        Senha4 = new javax.swing.JLabel();
        CPF4 = new javax.swing.JLabel();
        Usuario45 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        campoSenha4 = new javax.swing.JPasswordField();
        campoCpf4 = new javax.swing.JFormattedTextField();
        campoNascimento4 = new javax.swing.JFormattedTextField();
        Usuario46 = new javax.swing.JLabel();
        Usuario47 = new javax.swing.JLabel();
        Usuario48 = new javax.swing.JLabel();
        Usuario49 = new javax.swing.JLabel();
        btnCadastrar4 = new javax.swing.JButton();
        btnVoltar4 = new javax.swing.JButton();
        Usuario50 = new javax.swing.JLabel();
        campoDataDeAdmissao4 = new javax.swing.JFormattedTextField();
        campoNome4 = new javax.swing.JTextField();
        campoEmail4 = new javax.swing.JTextField();
        Usuario51 = new javax.swing.JLabel();
        campoRua4 = new javax.swing.JTextField();
        Usuario52 = new javax.swing.JLabel();
        campoBairro4 = new javax.swing.JTextField();
        Usuario53 = new javax.swing.JLabel();
        Usuario54 = new javax.swing.JLabel();
        campoEstado4 = new javax.swing.JTextField();
        campoCidade4 = new javax.swing.JTextField();
        campoUsuario4 = new javax.swing.JTextField();
        campoCpf5 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Cadastro");

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
        Text_3.setText(" Atendente");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Left_MenuLayout = new javax.swing.GroupLayout(Left_Menu);
        Left_Menu.setLayout(Left_MenuLayout);
        Left_MenuLayout.setHorizontalGroup(
            Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_MenuLayout.createSequentialGroup()
                .addGroup(Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_MenuLayout.createSequentialGroup()
                        .addGroup(Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_MenuLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(Text_1))
                            .addGroup(Left_MenuLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(Text_2))
                            .addGroup(Left_MenuLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Text_3)))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(Left_MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))))
                .addContainerGap())
        );
        Left_MenuLayout.setVerticalGroup(
            Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_MenuLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right_Menu4.setBackground(new java.awt.Color(102, 51, 153));

        Usuario44.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario44.setForeground(new java.awt.Color(241, 231, 254));
        Usuario44.setText("Usuario:");

        Senha4.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Senha4.setForeground(new java.awt.Color(241, 231, 254));
        Senha4.setText("Senha:");

        CPF4.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        CPF4.setForeground(new java.awt.Color(241, 231, 254));
        CPF4.setText("CPF:");

        Usuario45.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario45.setForeground(new java.awt.Color(241, 231, 254));
        Usuario45.setText("Nome:");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setToolTipText("");

        campoSenha4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoSenha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenha4campoSenhaActionPerformed(evt);
            }
        });

        try {
            campoCpf4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        try {
            campoNascimento4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNascimento4.setText("dd/mm/aaaa   ");
        campoNascimento4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoNascimento4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNascimento4campoNascimentoActionPerformed(evt);
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

        btnCadastrar4.setBackground(new java.awt.Color(241, 231, 254));
        btnCadastrar4.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnCadastrar4.setText("Cadastrar");
        btnCadastrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar4btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar4.setBackground(new java.awt.Color(241, 231, 254));
        btnVoltar4.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnVoltar4.setText("Voltar");
        btnVoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar4btnVoltarActionPerformed(evt);
            }
        });

        Usuario50.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario50.setForeground(new java.awt.Color(241, 231, 254));
        Usuario50.setText("Data de Admissão:");

        try {
            campoDataDeAdmissao4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoDataDeAdmissao4.setText("dd/mm/aaaa   ");
        campoDataDeAdmissao4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoDataDeAdmissao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataDeAdmissao4campoDataDeAdmissaoActionPerformed(evt);
            }
        });

        campoNome4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNome4campoNomeActionPerformed(evt);
            }
        });

        campoEmail4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEmail4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmail4campoEmailActionPerformed(evt);
            }
        });

        Usuario51.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario51.setForeground(new java.awt.Color(241, 231, 254));
        Usuario51.setText("Bairro:");

        campoRua4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoRua4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRua4campoRuaActionPerformed(evt);
            }
        });

        Usuario52.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario52.setForeground(new java.awt.Color(241, 231, 254));
        Usuario52.setText("Rua:");

        campoBairro4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoBairro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairro4campoBairroActionPerformed(evt);
            }
        });

        Usuario53.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario53.setForeground(new java.awt.Color(241, 231, 254));
        Usuario53.setText("Cidade:");

        Usuario54.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario54.setForeground(new java.awt.Color(241, 231, 254));
        Usuario54.setText("Estado:");

        campoEstado4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEstado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstado4campoEstadoActionPerformed(evt);
            }
        });

        campoCidade4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoCidade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidade4campoCidadeActionPerformed(evt);
            }
        });

        campoUsuario4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoUsuario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuario4campoUsuarioActionPerformed(evt);
            }
        });

        try {
            campoCpf5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        javax.swing.GroupLayout Right_Menu4Layout = new javax.swing.GroupLayout(Right_Menu4);
        Right_Menu4.setLayout(Right_Menu4Layout);
        Right_Menu4Layout.setHorizontalGroup(
            Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_Menu4Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(Usuario49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Right_Menu4Layout.createSequentialGroup()
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right_Menu4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5))
                    .addGroup(Right_Menu4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Senha4)
                            .addComponent(Usuario44))
                        .addGap(37, 37, 37)
                        .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSenha4)
                            .addComponent(campoUsuario4)))
                    .addGroup(Right_Menu4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRua4)
                            .addComponent(campoNascimento4)
                            .addGroup(Right_Menu4Layout.createSequentialGroup()
                                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Usuario45)
                                    .addComponent(Usuario52)
                                    .addComponent(Usuario46)
                                    .addComponent(Usuario48)
                                    .addComponent(Usuario53))
                                .addGap(0, 157, Short.MAX_VALUE))
                            .addComponent(campoCidade4)
                            .addComponent(campoNome4)
                            .addComponent(campoCpf5))
                        .addGap(40, 40, 40)
                        .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Right_Menu4Layout.createSequentialGroup()
                                .addGap(0, 110, Short.MAX_VALUE)
                                .addComponent(btnVoltar4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrar4))
                            .addComponent(campoBairro4)
                            .addComponent(campoDataDeAdmissao4)
                            .addComponent(campoEstado4)
                            .addComponent(campoEmail4)
                            .addComponent(campoCpf4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addGroup(Right_Menu4Layout.createSequentialGroup()
                                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPF4)
                                    .addComponent(Usuario50)
                                    .addComponent(Usuario47)
                                    .addComponent(Usuario51)
                                    .addComponent(Usuario54))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        Right_Menu4Layout.setVerticalGroup(
            Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_Menu4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right_Menu4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(campoUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Usuario44))
                .addGap(18, 18, 18)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha4)
                    .addComponent(campoSenha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario49)
                .addGap(31, 31, 31)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario45)
                    .addComponent(CPF4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario46)
                    .addComponent(Usuario47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNascimento4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario48)
                    .addComponent(Usuario50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDataDeAdmissao4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario52)
                    .addComponent(Usuario51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRua4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBairro4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario53)
                    .addComponent(Usuario54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCidade4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(Right_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Right_Menu4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Left_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(Left_Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoSenha4campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenha4campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenha4campoSenhaActionPerformed

    private void campoNascimento4campoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNascimento4campoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNascimento4campoNascimentoActionPerformed

    private void btnCadastrar4btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar4btnCadastrarActionPerformed
        // TODO add your handling code here:

        AtendenteDAO atendentedao = new AtendenteDAO();

        if (verificarCampos()) {

            if (atendentedao.search(campoCpf4.getText()) != null) {
                JOptionPane.showMessageDialog(null, "Essa pessoa já está cadastrada no sistema!\nVerifique se você digitou o CPF corretamente");
            } else {
                String nascimento = campoNascimento4.getText();

                int dia = Integer.parseInt(nascimento.substring(0, 2));
                int mes = Integer.parseInt(nascimento.substring(3, 5));
                int ano = Integer.parseInt(nascimento.substring(6, 10));

                if (atendentedao.create(new Atendente(0, LocalDate.now(), campoCpf4.getText(), campoNome4.getText(), LocalDate.of(ano, mes, dia), campoUsuario4.getText(), campoSenha4.getText(), new Endereco(campoRua4.getText(), campoCidade4.getText(), campoBairro4.getText(), campoEstado4.getText()), new Contato(campoEmail4.getText(), campoTelefone4.getText())))) {
                    JOptionPane.showMessageDialog(null, "Atendente Cadastrado com sucesso!");
                    new Tela_Login_Atendente().setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar atendente!");
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Algum campo obrigatório não foi preenchido!\nTodos os campos são obrigatórios menos o email.");
        }


    }//GEN-LAST:event_btnCadastrar4btnCadastrarActionPerformed

    private void btnVoltar4btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar4btnVoltarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new Tela_Login_Atendente().setVisible(true);
    }//GEN-LAST:event_btnVoltar4btnVoltarActionPerformed

    private void campoDataDeAdmissao4campoDataDeAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataDeAdmissao4campoDataDeAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataDeAdmissao4campoDataDeAdmissaoActionPerformed

    private void campoNome4campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNome4campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNome4campoNomeActionPerformed

    private void campoEmail4campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmail4campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmail4campoEmailActionPerformed

    private void campoRua4campoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRua4campoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRua4campoRuaActionPerformed

    private void campoBairro4campoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairro4campoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairro4campoBairroActionPerformed

    private void campoEstado4campoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstado4campoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstado4campoEstadoActionPerformed

    private void campoCidade4campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidade4campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidade4campoCidadeActionPerformed

    private void campoUsuario4campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuario4campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuario4campoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Atendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro_Atendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF4;
    private javax.swing.JPanel Left_Menu;
    private javax.swing.JPanel Right_Menu4;
    private javax.swing.JLabel Senha4;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    private javax.swing.JLabel Usuario44;
    private javax.swing.JLabel Usuario45;
    private javax.swing.JLabel Usuario46;
    private javax.swing.JLabel Usuario47;
    private javax.swing.JLabel Usuario48;
    private javax.swing.JLabel Usuario49;
    private javax.swing.JLabel Usuario50;
    private javax.swing.JLabel Usuario51;
    private javax.swing.JLabel Usuario52;
    private javax.swing.JLabel Usuario53;
    private javax.swing.JLabel Usuario54;
    private javax.swing.JButton btnCadastrar4;
    private javax.swing.JButton btnVoltar4;
    private javax.swing.JTextField campoBairro4;
    private javax.swing.JTextField campoCidade4;
    private javax.swing.JFormattedTextField campoCpf4;
    private javax.swing.JFormattedTextField campoCpf5;
    private javax.swing.JFormattedTextField campoDataDeAdmissao4;
    private javax.swing.JTextField campoEmail4;
    private javax.swing.JTextField campoEstado4;
    private javax.swing.JFormattedTextField campoNascimento4;
    private javax.swing.JTextField campoNome4;
    private javax.swing.JTextField campoRua4;
    private javax.swing.JPasswordField campoSenha4;
    private javax.swing.JTextField campoUsuario4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCampos() {
        AtendenteDAO dao = new AtendenteDAO();

        if (campoBairro4.getText().length() == 0 || campoCidade4.getText().length() == 0 || campoCpf4.getText().equals("   .   .   -  ") || campoDataDeAdmissao4.getText().equals("  /  /    ")
                || campoEstado4.getText().length() == 0 || campoNascimento4.equals("  /  /    ") || campoNome4.getText().length() == 0 || campoRua4.getText().length() == 0 || campoSenha4.getText().length() == 0
                || campoTelefone4.getText().length() == 0 || campoUsuario4.getText().length() == 0) {

            return false;

        }


        return true;
    }
}
