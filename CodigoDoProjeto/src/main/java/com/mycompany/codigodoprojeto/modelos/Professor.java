package com.mycompany.codigodoprojeto.modelos;

public class Professor {
  
  private int codigo;
  private String nome;
  private String ensina;
  private String email;
  private String senha;
  private String cpf;
  
  public Professor (String nome, String ensina, 
          String email, String senha, String cpf) {
    
    this.nome = nome;
    this.ensina = ensina;
    this.email = email;
    this.senha = senha;
    this.cpf = cpf;
  }
  
  public Professor (int codigo, String nome, String ensina, 
          String email, String senha, String cpf) {
    
    this.codigo = codigo;
    this.nome = nome;
    this.ensina = ensina;
    this.email = email;
    this.senha = senha;
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEnsina() {
    return ensina;
  }

  public void setEnsina(String ensina) {
    this.ensina = ensina;
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  
}
