package com.mycompany.codigodoprojeto.persistencia;

import com.mycompany.codigodoprojeto.modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
  public boolean existeUsuario(Usuario usuario) throws Exception{
    String sql = "SELECT * FROM " + "tb_usuario WHERE " + "emailUsuario = ? AND senhaUsuario = ?";
    
    try(Connection conn = ConnectionFactory.obterConexao(); 
        PreparedStatement ps = conn.prepareStatement(sql)
        ){
        ps.setString(1, usuario.getEmail());
        ps.setString(2, usuario.getSenha());
        try (ResultSet rs = ps.executeQuery()) {
          return rs.next();
        }
    }
  } 
}
