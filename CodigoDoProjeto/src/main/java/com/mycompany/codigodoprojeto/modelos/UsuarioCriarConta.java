package com.mycompany.codigodoprojeto.modelos;

public class UsuarioCriarConta {
  private String email;
  private String senha;
  private String nomeCompleto;
  private String cpf;
  private String dataNascimento;

  public UsuarioCriarConta(String email, String senha, String nomeCompleto, String cpf, String dataNascimento) {
    this.email = email;
    this.senha = senha;
    this.nomeCompleto = nomeCompleto;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
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

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  
}
