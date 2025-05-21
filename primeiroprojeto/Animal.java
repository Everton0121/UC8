/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.primeiroprojeto;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Animal {
    private String name;
    private String species;
    private double weight;

    
    //o metodo construotr, em java, deve ser declarado como public
    //nao deve ir retorno(nem void)
    //deve ter o mesmo nome exato da classe

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        
    }
    
    public void emiteSom(){
        System.out.println("o animal emitiu um som");
    }
    
    
    // get e set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //get e set
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    //get e set
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    
    
}