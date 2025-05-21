/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.atividade;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */

public class Atividade {
          
    // Método que recebe email e senha, coloca em um array e retorna o array
    
    public static String[] criarArrayDeCredenciais(String email, String senha) {
        
        // Cria um array com 2 posições
        String[] credenciais = new String[2];
        
        // A posição 0 recebe o email       
        credenciais[0] = email;    
        
         // A posição 1 recebe a senha
        credenciais[1] = senha;             
        return credenciais;                 
    }

    // Método principal para testar
    public static void main(String[] args) {
        
        String[] resultado = criarArrayDeCredenciais("everton.edu.2009@gmail.com", "ta procurando oq?");

        // Exibe os valores armazenados no array
        System.out.println("Email: " + resultado[0]);
        System.out.println("Senha: " + resultado[1]);
      
        
    }
}