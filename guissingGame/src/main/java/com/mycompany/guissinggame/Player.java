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
public class Player {
     private String name;
     private int plays;
     /*
     criar um atributo jogadas para o player //player
     criar um metodo que incrementa as jogadas e outro que mostra o numero de jogadas //player
     mudar a logica do jogo para, no final, mostra quantas o player precisou fazer ate acertar //game
     */
     
     
     
     
    public Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        this.name = scanner.nextLine();
        
    }

    public void addPlays() {
        this.plays++;
    }

     public int getPlays() {
        return this.plays;
    }
   
    
    public String getName(){
        return name;
    }
}

