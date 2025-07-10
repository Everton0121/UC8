/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.conexaobanco242n;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public  class Crud {
    
  public static boolean registrarUsuario(Usuario usuario) {
      
      String sql = "INSERT INTO usuarios (email, senha) VALUES (?,?)";
      
      try(Connection conn = Conexao.conectar();
          PreparedStatement stmt = conn.prepareStatement(sql)){
          
          stmt.setString(1, usuario.getEmail());
          stmt.setString(2, usuario.getSenha());
          stmt.executeUpdate();
          return true;
      }catch(SQLException e){
          e.getMessage();
          return false;

      }
  }
}
