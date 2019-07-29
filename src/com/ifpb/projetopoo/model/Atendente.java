/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author IGOR
 */
public class Atendente extends Pessoa {
    
    private float salario;
    private LocalDate dataAdmissao;
    private String usuario;
    private String senha;
    
    public Atendente(float salario, LocalDate dataAdmissao, String cpf, String nome, LocalDate nascimento, String Usuario, String Senha, Endereco endereco, Contato contato) {
        super(cpf, nome, nascimento, endereco, contato);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setSenha(String Senha) {
        this.senha = senha;
    }
    
    public String getSenha() {
        return senha;
    }
    
}