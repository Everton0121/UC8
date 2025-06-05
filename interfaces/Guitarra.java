/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.interfaces;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Guitarra implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Guitarra:Bleeeeeeeeeeeem");
    }

    @Override
    public void afinar() {
        System.out.println("A Guitarra foi afinada");
    }
    
}
