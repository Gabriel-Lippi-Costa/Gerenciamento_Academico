package com.mycompany.codigodoprojeto.persistencia;

import com.mycompany.codigodoprojeto.modelos.UsuarioCriarConta;
import com.mycompany.codigodoprojeto.modelos.UsuarioEsqueceuSenha;
import com.mycompany.codigodoprojeto.modelos.UsuarioLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
