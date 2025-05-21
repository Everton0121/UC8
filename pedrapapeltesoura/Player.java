/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.pedrapapeltesoura;

import java.util.Scanner;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Player {

    private String name;
    private int idade;
    private int plays;
    
     public Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        this.name = scanner.nextLine(); 
        
        System.out.println("digite sua idade: ");
        this.idade = scanner.nextInt();
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
    
    public int getIdade(){
        return idade;
    }
}


