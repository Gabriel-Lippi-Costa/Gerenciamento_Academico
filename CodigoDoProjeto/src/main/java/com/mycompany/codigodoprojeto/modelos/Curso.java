package com.mycompany.codigodoprojeto.modelos;

public class Curso {
  private int codigo;
  private String nome;
  private String tipo;
  
  public Curso(int codigo, String nome, String tipo) {
    this.codigo = codigo;
    this.nome = nome;
    this.tipo = tipo;
  }
  
  public Curso(String nome, String tipo) {
    this.nome = nome;
    this.tipo = tipo;
  }
  
  public int getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  
}
