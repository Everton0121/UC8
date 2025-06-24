/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.aluno;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Aluno {
    
 private String nome;
 private String personalidade; // Ex: Corajoso, Astuto, Leal, Inteligente

 
  public Aluno(String nome, String personalidade) {
        this.nome = nome;
        this.personalidade = personalidade;
    }
  
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }

   
 @Override
    public String toString() {
        return nome + " (" + personalidade + ")";
    }
    
    // Construtor, getters e setters
    public static void main(String[] args) {
       
    }
    
}
