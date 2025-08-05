package com.mycompany.codigodoprojeto.modelos;

public class Aluno {
  
  private String nome;
  private String curso;
  private String inicio;
  private String fim;
  private String email;
  private String senha;
  private String sala;
  private String cpf;

  public Aluno(String nome, String curso, String inicio, String fim,
          String email, String senha, String sala, String cpf) {
  
    this.nome = nome;
    this.curso = curso;
    this.inicio = inicio;
    this.fim = fim;
    this.email = email;
    this.senha = senha;
    this.sala = sala;
    this.cpf = cpf;
  }

  public String getSala() {
    return sala;
  }

  public void setSala(String sala) {
    this.sala = sala;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getInicio() {
    return inicio;
  }

  public void setInicio(String inicio) {
    this.inicio = inicio;
  }

  public String getFim() {
    return fim;
  }

  public void setFim(String fim) {
    this.fim = fim;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

}
