/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.interfaces;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Bateria implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("bateria:Toc-toc-tum");
    }

    @Override
    public void afinar() {
        System.out.println("Foi afinada a bateria ");
    }
    
}
