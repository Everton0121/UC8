/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.primeiroprojeto;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Tipos {
    
    String meuNome = "Everton";
    //string letras,palavras ou frases
    
    char minhaInicial = 'E';
    //char e so para uma letra
    
    int minhaIdade = 16;
    //numero inteiro
    
    float numeroComPonto = 16.5f;
    // nuemro com virgula/ponto
    //sempre botar 'F' no final do numero 
    
    double minhaAltura = 1.75;
    //numero que podem ter casas decimais
    
    boolean verdadeiroOuFalso = true;
    //verdade ou falsidade
    
    public void verificaIdade(int idade) {
        if(idade >= 18){
            System.out.println("parabens vc tem " + idade + " e sendo assim agr vc e maior de idade se fode na vida agr");
        } else {
            System.out.println("vc e menor de tem " + idade + " e é menor de idade sai daqui corno");
        }
    }
    
    //primeiro, dizemos se o metodo e public, private ou protected
    //depois, devemos especificar o tipo retorno do metodo
    // e depois, os parametros(se houverem)
    
        public int calculaSoma(int num1, int num2){
            return num1 + num2;
    }
        
       public void Nacionalidade(String pais){
           switch (pais){
               case "brasil":
                   System.out.println("voce e brasileiro(a) fudido(a) na vida");
                   break;
               case"angola":
                   System.out.println("voce e angolado mais ferrado na vida ");
                   break;
               default:
                   System.out.println("nacionalidade nao encontrada ");
                   break;
           }
       } 
        
    
}
