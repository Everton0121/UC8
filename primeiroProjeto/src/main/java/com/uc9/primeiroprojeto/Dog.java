/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.primeiroprojeto;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Dog extends Animal {
    
    private String breed;
    
    public Dog(String name, String species, double weight, String breed) {
        super(name, species, weight);
        this.breed = breed;
    }

    //sobrescrever
    @Override
     public void emiteSom(){
        System.out.println("o cachorro latiu");
    }
    
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    
}
