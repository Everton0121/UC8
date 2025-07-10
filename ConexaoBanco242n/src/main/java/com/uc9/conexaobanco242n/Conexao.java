/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.conexaobanco242n;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Conexao {
    
    //Connection representa uma conexao
    private static Connection connection;
    
    //variaveis de conexao
    private static final String URL = "jdbc:mysql://localhost:3306/meu_banco";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    
    // conecta ao banco de dados
    public static Connection conectar(){
    
        try{  
            // se ainda nao houver conexa, cria uma nova
           if(connection == null || connection.isClosed()){
            
          //DriverManeger encontra o driver adequado para o meu tipo de banco de dados
          //um dirver de banco de dados e como um tradutor entre o java e o banco de daods que
          //fornece o metodo getConnetion()
          connection = DriverManager.getConnection(URL,DB_USER,DB_PASSWORD);
          criarTabela();
          System.out.println("Conectado ao banco. ");
           }
        }catch(SQLException error) {//caputure a exessao
            System.out.println(error.getMessage());
        }
          
         return connection;
        }
    
    // cria a tabela de usuarios se ela nao existir
    private static void criarTabela(){
        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
        + "id INT AUTO_INCREMENT PRIMARY KEY, "
        + "email VARCHAR(255) NOT NULL UNIQUE, "
        + "senha VARCHAR(255) NOT NULL)";
        // Statement (declaracao) e uma classe que permite executar comandos SQL
        try(Statement stmt = connection.createStatement()){
            //executa o comando sql
            stmt.execute(sql);
        }catch(SQLException error){
            System.out.println(error.getMessage());
        }
    }

}
    

