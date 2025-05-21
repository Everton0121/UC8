/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guissinggame;

import java.util.Scanner;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Game {
       private int numberToGuess; // numero aleatorio
        
       private Player player;
       private GuessValidator guessValidator;
       private Scanner scanner;
       
    public Game(){
        this.numberToGuess = (int) (Math.random() * 100)+ 1;
        //gera numero aleatorio enre e 1 e 100
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }
    
    
    public void start(){
        //logica do jogo sera adicionada aqui
        System.out.println("bem vindo ao jogo de chute, " + player.getName() +  "!");
        boolean hasWon = false;
        
        while(!hasWon) {
        System.out.println("digite seu palpite ");
        int guess = scanner.nextInt();
        this.player.addPlays();
        
        hasWon = guessValidator.validateGuess(guess, numberToGuess);
    }
        System.out.println("parabens," + player.getName() + "! voce acertou o numero genio "
        + player.getPlays() + " jogadas! " );           
    }      
}


