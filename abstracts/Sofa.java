/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.abstracts;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
    
    // Classe concreta que herda de Mobilia
    class Sofa extends Mobilia {
    public Sofa(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("Montando o sofá de cor " + cor + " feito de " + material + ".");
    }
}

