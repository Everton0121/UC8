/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.pedrapapeltesoura;

import java.util.Random;
import java.util.Scanner;
 
/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Game {
        
        private GuessValidator guessValidator = new GuessValidator();
        int playerVitorias = 0;
        int pcVitorias = 0;
   
        public void jogo(){
                   
        while(true){
        
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //manda o jogador escolher umas das opcoes
        System.out.print("Escolha: pedra, papel ou tesoura: ");
        String jogador = scanner.nextLine();

        // faz o computar escolher aleatoriamente umas das tres(que no quaso e entre 0 a 2) opcoes
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String computador = opcoes[random.nextInt(3)];
        
        //mostra a escolha do computador
        System.out.println("Computador escolheu: " + computador);

        if(guessValidator.validateGuess(jogador, computador).equals("V" )) {
            System.out.println("adiciona uma vitoria");
            playerVitorias++;
        }
        else if(guessValidator.validateGuess(jogador, computador).equals("E" )) {
        System.out.println("adiciona uma empate");
                }else {
             System.out.println("foi derrotado");
             pcVitorias++;
        }
      
       
       // Mostra o placar atual
            System.out.println("Placar -> Você: " + playerVitorias + " | Computador: " + pcVitorias);
            System.out.println("------------------------------------------------");
            
         
        if (playerVitorias == 2 || pcVitorias == 2) {
            System.out.println("ACABOU O JOGO");
            return;
            
}
}
}
}
