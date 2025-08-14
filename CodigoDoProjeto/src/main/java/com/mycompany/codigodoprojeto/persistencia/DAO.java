
package com.mycompany.codigodoprojeto.persistencia;

import com.mycompany.codigodoprojeto.modelos.Aluno;
import com.mycompany.codigodoprojeto.modelos.Professor;
import com.mycompany.codigodoprojeto.modelos.UsuarioCriarConta;
import com.mycompany.codigodoprojeto.modelos.UsuarioEsqueceuSenha;
import com.mycompany.codigodoprojeto.modelos.UsuarioLogin;
import com.mycompany.codigodoprojeto.persistencia.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAO {

  public boolean existeUsuario(UsuarioLogin usuario) throws Exception {
    String sql = "SELECT * FROM " + "tb_usuario WHERE " + "emailUsuario = ? AND senhaUsuario = ?";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, usuario.getEmail());
      ps.setString(2, usuario.getSenha());
      try (ResultSet rs = ps.executeQuery()) {
        return rs.next();
      }
    }
  }
  
  public List<Aluno> listarAlunos() throws Exception {
    List<Aluno> lista = new ArrayList<>();
    
    String sql = "SELECT * FROM tb_aluno";
    
    try(Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
     while (rs.next()) {
       Aluno aluno = new Aluno(
         rs.getInt("codigoAluno"),
         rs.getString("nomeAluno"),
         rs.getString("cursoAluno"),
         rs.getString("inicioCursoAluno"),
         rs.getString("fimCursoAluno"),
         rs.getString("emailAluno"),
         rs.getString("senhaAluno"),
         rs.getString("salaAluno"),
         rs.getString("cpfAluno")
       );
       lista.add(aluno);
     } 
    }
    
    return lista;
    
  }

  public boolean criarContaUsuario(UsuarioCriarConta usuarioCriarConta) throws Exception {
    String sql = "INSERT INTO tb_usuario(nomeUsuario, cpfUsuario, dataNascimentoUsuario, emailUsuario, senhaUsuario) "
            + "VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {

      ps.setString(1, usuarioCriarConta.getNomeCompleto());
      ps.setString(2, usuarioCriarConta.getCpf());
      ps.setDate(3, java.sql.Date.valueOf(usuarioCriarConta.getDataNascimento())); // Assumindo que seja 'yyyy-MM-dd'
      ps.setString(4, usuarioCriarConta.getEmail());
      ps.setString(5, usuarioCriarConta.getSenha());

      int linhasAfetadas = ps.executeUpdate();
      return linhasAfetadas > 0;
    }
  }

  public boolean mudarSenhaUsuario(UsuarioEsqueceuSenha usuarioEsqueceuSenha) throws Exception {
    String sql = "UPDATE tb_usuario SET senhaUsuario = ? WHERE emailUsuario = ?";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, usuarioEsqueceuSenha.getNovaSenha());
      ps.setString(2, usuarioEsqueceuSenha.getEmail());

      int linhasAfetadas = ps.executeUpdate();
      return linhasAfetadas > 0;
    }
  }

  public boolean criarAluno(Aluno aluno) throws Exception {
    String sql = "INSERT INTO tb_aluno(nomeAluno, cursoAluno, inicioCursoAluno, fimCursoAluno, emailAluno, senhaAluno, salaAluno, cpfAluno) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, aluno.getNome());
      ps.setString(2, aluno.getCurso());
      ps.setString(3, aluno.getInicio());
      ps.setString(4, aluno.getFim());
      ps.setString(5, aluno.getEmail());
      ps.setString(6, aluno.getSenha());
      ps.setString(7, aluno.getSala());
      ps.setString(8, aluno.getCpf());

      int linhasAfetadas = ps.executeUpdate();
      return linhasAfetadas > 0;

    }

  }

  public boolean removerAluno(int codigo) throws Exception{

    String sql = "DELETE FROM tb_aluno WHERE codigoAluno = ?";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      
      ps.setInt(1, codigo);

        int linhasAfetadas = ps.executeUpdate();

        return linhasAfetadas > 0;

      } catch(Exception e) {
        e.printStackTrace();
        return false;
      }

    }

  public boolean atualizarAluno(Aluno aluno) throws Exception {
    String sql = "UPDATE tb_aluno SET nomeAluno = ?, cursoAluno = ?, inicioCursoAluno = ?, fimCursoAluno = ?, emailAluno = ?, senhaAluno = ?, salaAluno = ?, cpfAluno = ? WHERE codigoAluno = ?";
    
    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, aluno.getNome());
      ps.setString(2, aluno.getCurso());
      ps.setString(3, aluno.getInicio());
      ps.setString(4, aluno.getFim());
      ps.setString(5, aluno.getEmail());
      ps.setString(6, aluno.getSenha());
      ps.setString(7, aluno.getSala());
      ps.setString(8, aluno.getCpf());
      ps.setInt(9, aluno.getCodigo());
      
      int linhasAfetadas = ps.executeUpdate();
      return linhasAfetadas > 0;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
    
  }
  
  

  public boolean criarProfessor(Professor professor) throws Exception {
    String sql = "INSERT INTO tb_professor(nomeProfessor, ensinaCursoProfessor, emailProfessor, senhaProfessor, cpfProfessor) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setString(1, professor.getNome());
      ps.setString(2, professor.getEnsina());
      ps.setString(3, professor.getEmail());
      ps.setString(4, professor.getSenha());
      ps.setString(5, professor.getCpf());

      int linhasAfetadas = ps.executeUpdate();
      return linhasAfetadas > 0;

    }

  }
  
  public List<Professor> listarProfessor() throws Exception {
    List<Professor> lista = new ArrayList<>();
    
    String sql = "SELECT * FROM tb_professor";

    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
      while(rs.next()) {
        Professor professor = new Professor(
           rs.getInt("codigoProfessor"),
           rs.getString("nomeProfessor"),
           rs.getString("ensinaCursoProfessor"),
           rs.getString("emailProfessor"),
           rs.getString("senhaProfessor"),
           rs.getString("cpfProfessor")
        );
        lista.add(professor);
      }
    }
    return lista;

  }
  
  public boolean removerProfessor(int codigo) throws Exception {
    String sql = "DELETE FROM tb_professor WHERE codigoProfessor = ?";
    
    try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
      ps.setInt(1, codigo);
      int linhasAfetadas = ps.executeUpdate();
      return linhasAfetadas > 0;
    } catch(Exception e) {
      e.printStackTrace();
      return false;
    }
  }

}
