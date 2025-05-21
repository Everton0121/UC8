/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.arrays;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Arrays {

    public static void main(String[] args) {int[] numeros = new int[3];
    /*
        numeros[0] = 30;
        numeros[1] = 60;
        numeros[2] = 90;
        System.out.println(numeros[0] + " " + numeros[1] + " " + numeros[2]);
        
        String[] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Éverton";
        nomes[2] = "Denise";
        System.out.println( nomes[0] + " " + nomes[1] + " " + nomes[2]);
    */
    
        String[] nomes = new String[5]; 
        
        int[] numeros2 = {10,20,30,40,50};
        System.out.println(numeros2.length);
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        for(int i:numeros2){
        System.out.println(i);
    }
        for(int i:numeros){
            System.out.println(i);}
        
        for(int i = 0;i < numeros.length; i ++){
            System.out.println(numeros[i]);
        }
        
        //foreach
         for(int numero : numeros ){
            System.out.println(numeros);      
         }
         
         /*
         
            criem um metodo que recebe email e uma senha 
            dentro do metodo, adicione estas duas Strings dentro de um array
            no fim, o metodo deve retornar o array
         
         */
         
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
    }                    
}
    

