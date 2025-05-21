/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.usuario;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Main {
    
    // Método que recebe email e senha, coloca em um array e retorna o array
    public static String[] criarArrayDeCredenciais(Usuario User) {
        
        // Cria um array com 2 posições
        String[] credenciais = new String[3];
        
        credenciais[0] = User.getName(); 
        
        // A posição 0 recebe o email       
        credenciais[1] = User.getEmail();    
        
         // A posição 1 recebe a senha
        credenciais[2] = User.getSenha(); 
        
        
        return credenciais;                 
    }

    // Método principal para testar
    public static void main(String[] args) {
          
          
          Usuario useer = new Usuario ("Éverton","everton.edu.2009@gmail.com","sei la");
          String[] resultado = criarArrayDeCredenciais(useer);

        // Exibe os valores armazenados no array   
        System.out.println("Everton: " + resultado[0]);
        System.out.println("Email: " + resultado[1]);
        System.out.println("Senha: " + resultado[2]);
        
     
        
    }
}
