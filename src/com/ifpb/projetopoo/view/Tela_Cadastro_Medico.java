/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.MedicoDAO;
import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import com.ifpb.projetopoo.model.Medico;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author IGOR
 */
public class Tela_Cadastro_Medico extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Cadastro_Medico
     */
    private final MedicoDAO dao;
    public Tela_Cadastro_Medico() {
        initComponents();
        dao = new MedicoDAO();
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

        jPanel1 = new javax.swing.JPanel();
        Usuario49 = new javax.swing.JLabel();
        Usuario45 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoNascimento = new javax.swing.JFormattedTextField();
        Usuario46 = new javax.swing.JLabel();
        CPF4 = new javax.swing.JLabel();
        campoCpf = new javax.swing.JFormattedTextField();
        campoTelefone = new javax.swing.JFormattedTextField();
        Usuario47 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        Usuario48 = new javax.swing.JLabel();
        campoSalario = new javax.swing.JTextField();
        Usuario52 = new javax.swing.JLabel();
        Usuario51 = new javax.swing.JLabel();
        Usuario54 = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        Usuario53 = new javax.swing.JLabel();
        Usuario55 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        campoEspecialidade = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        Usuario56 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Text_13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        Text_14 = new javax.swing.JLabel();
        Text_15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 153));

        Usuario49.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        Usuario49.setForeground(new java.awt.Color(241, 231, 254));
        Usuario49.setText("Informações");

        Usuario45.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario45.setForeground(new java.awt.Color(241, 231, 254));
        Usuario45.setText("Nome:");

        campoNome.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomecampoNomeActionPerformed(evt);
            }
        });

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

        CPF4.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        CPF4.setForeground(new java.awt.Color(241, 231, 254));
        CPF4.setText("CPF:");

        try {
            campoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpf.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        try {
            campoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoTelefone.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        Usuario47.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario47.setForeground(new java.awt.Color(241, 231, 254));
        Usuario47.setText("Email:");

        campoEmail.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailcampoEmailActionPerformed(evt);
            }
        });

        Usuario48.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario48.setForeground(new java.awt.Color(241, 231, 254));
        Usuario48.setText("Telefone:");

        campoSalario.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalariocampoRuaActionPerformed(evt);
            }
        });

        Usuario52.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario52.setForeground(new java.awt.Color(241, 231, 254));
        Usuario52.setText("Rua:");

        Usuario51.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario51.setForeground(new java.awt.Color(241, 231, 254));
        Usuario51.setText("Bairro:");

        Usuario54.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario54.setForeground(new java.awt.Color(241, 231, 254));
        Usuario54.setText("Estado:");

        campoBairro.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairrocampoBairroActionPerformed(evt);
            }
        });

        campoCidade.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadecampoCidadeActionPerformed(evt);
            }
        });

        Usuario53.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario53.setForeground(new java.awt.Color(241, 231, 254));
        Usuario53.setText("Salário: ");

        Usuario55.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario55.setForeground(new java.awt.Color(241, 231, 254));
        Usuario55.setText("Especialidade:");

        campoEstado.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadocampoEstadoActionPerformed(evt);
            }
        });

        campoEspecialidade.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEspecialidadecampoCidadeActionPerformed(evt);
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

        btnCadastrar.setBackground(new java.awt.Color(241, 231, 254));
        btnCadastrar.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarbtnCadastrarActionPerformed(evt);
            }
        });

        Usuario56.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario56.setForeground(new java.awt.Color(241, 231, 254));
        Usuario56.setText("Cidade:");

        campoRua.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRuacampoRuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(Usuario49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Usuario53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Usuario45)
                                            .addComponent(Usuario52)
                                            .addComponent(Usuario46)
                                            .addComponent(Usuario48))
                                        .addGap(0, 171, Short.MAX_VALUE))
                                    .addComponent(campoCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(40, 40, 40))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Usuario56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Usuario55)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoEspecialidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 124, Short.MAX_VALUE)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCadastrar))
                                    .addComponent(campoBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CPF4)
                                            .addComponent(Usuario47)
                                            .addComponent(Usuario51)
                                            .addComponent(Usuario54))
                                        .addGap(0, 329, Short.MAX_VALUE)))
                                .addGap(41, 41, 41))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Usuario49)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario45)
                    .addComponent(CPF4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoNome)
                    .addComponent(campoCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario46)
                    .addComponent(Usuario47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario48)
                    .addComponent(Usuario51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario52)
                    .addComponent(Usuario54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario55)
                    .addComponent(Usuario56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario53)
                    .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(36, 37, 42));

        Text_13.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_13.setForeground(new java.awt.Color(241, 231, 254));
        Text_13.setText("Cadastro");

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));

        Text_14.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_14.setForeground(new java.awt.Color(241, 231, 254));
        Text_14.setText("de");

        Text_15.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_15.setForeground(new java.awt.Color(241, 231, 254));
        Text_15.setText("Médico");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_13)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Text_15)
                                .addGap(11, 11, 11)))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Text_14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_15)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomecampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomecampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomecampoNomeActionPerformed

    private void campoNascimentocampoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNascimentocampoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNascimentocampoNascimentoActionPerformed

    private void campoEmailcampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailcampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailcampoEmailActionPerformed

    private void campoSalariocampoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalariocampoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalariocampoRuaActionPerformed

    private void campoBairrocampoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairrocampoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairrocampoBairroActionPerformed

    private void campoCidadecampoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadecampoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadecampoCidadeActionPerformed

    private void campoEstadocampoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadocampoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadocampoEstadoActionPerformed

    private void campoEspecialidadecampoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEspecialidadecampoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEspecialidadecampoCidadeActionPerformed

    private void btnVoltarbtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarbtnVoltarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new Tela_Principal().setVisible(true);
    }//GEN-LAST:event_btnVoltarbtnVoltarActionPerformed

    private void btnCadastrarbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarbtnCadastrarActionPerformed
        // TODO add your handling code here:
        
        if(verificarCampos() && verificarCpf()){
            
            String nascimento = campoNascimento.getText();

            int dia = Integer.parseInt(nascimento.substring(0, 2));
            int mes = Integer.parseInt(nascimento.substring(3, 5));
            int ano = Integer.parseInt(nascimento.substring(6, 10));
            
            if(dao.create(new Medico(Float.parseFloat(campoSalario.getText()), LocalDate.now(), campoCpf.getText(), campoNome.getText(), LocalDate.of(ano, mes, dia), new Endereco(campoRua.getText(), campoCidade.getText(), campoBairro.getText(), campoEstado.getText()), new Contato(campoEmail.getText(), campoTelefone.getText())))){
                JOptionPane.showMessageDialog(this, "Medico cadastrado com sucesso!");
                new Tela_Principal().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar-se");
            }
            
        }
        
        
    }//GEN-LAST:event_btnCadastrarbtnCadastrarActionPerformed

    private void campoRuacampoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRuacampoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRuacampoRuaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Medico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro_Medico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF4;
    private javax.swing.JLabel Text_13;
    private javax.swing.JLabel Text_14;
    private javax.swing.JLabel Text_15;
    private javax.swing.JLabel Usuario45;
    private javax.swing.JLabel Usuario46;
    private javax.swing.JLabel Usuario47;
    private javax.swing.JLabel Usuario48;
    private javax.swing.JLabel Usuario49;
    private javax.swing.JLabel Usuario51;
    private javax.swing.JLabel Usuario52;
    private javax.swing.JLabel Usuario53;
    private javax.swing.JLabel Usuario54;
    private javax.swing.JLabel Usuario55;
    private javax.swing.JLabel Usuario56;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JFormattedTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEspecialidade;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JFormattedTextField campoNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoRua;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JFormattedTextField campoTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCampos() {
        
        if (campoBairro.getText().length() == 0 || campoCidade.getText().length() == 0 || campoCpf.getText().equals("   .   .   -  ") || campoEmail.getText().length() == 0
                || campoEstado.getText().length() == 0 || campoNascimento.getText().equals("  /  /    ") || campoNome.getText().length() == 0
                || campoSalario.getText().length() == 0 || campoTelefone.getText().equals("(  )          ")) {

            JOptionPane.showMessageDialog(this, "Algum campo obrigatório não foi preenchido!\nTodos os campos são obrigatórios menos as especificações");

            return false;

        }
        return true;
        
    }

    private boolean verificarCpf() {
        
        if(dao.search(campoCpf.getText()) == null){
            return true;
        }
        
        JOptionPane.showMessageDialog(this, "Esse CPF já está cadastrado no sistema!\nVerifique se o CPF foi digitado corretamente.");
        return false;
    }
}