/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Escrever {
    public static void escrever(){
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
           
        String name;
        
        // Declara duas variáveis inteiras para armazenar os números digitados pelo usuário
        int numero1, numero2;
        
        System.out.println("digite seu nome");
        name = sc.nextLine();
        
        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        // Lê o próximo inteiro digitado pelo usuário e o armazena em numero1
        numero1 = sc.nextInt(); 
        
        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro número: ");
        // Lê o próximo inteiro digitado pelo usuário e o armazena em numero2
        numero2 = sc.nextInt(); 

        // Exibe uma mensagem para indicar que o resultado será mostrado
        
       //jeito dificil:
       //int soma = numero1 + numero2;
       // System.out.println("Resultado: " + soma);
       
        //jeito mais facil:
         System.out.println(name +", O Resultado: " + (numero1 + numero2));
        
         
        // Fecha o objeto Scanner para liberar os recursos utilizados
        sc.close();
    }
}
    


