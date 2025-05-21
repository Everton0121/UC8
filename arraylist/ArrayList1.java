/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.arraylist;
import java.util.ArrayList;
/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class ArrayList2 {
    
    static ArrayList<Integer> numeros = new ArrayList<>();

    public static void main(String[] args) {
        
        //adiciona um elemento 
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(100);
       
        // remove um elemento
        
        numeros.remove(2);// remove o indice 2 (30)
              
        // consultar o valor por indice 
        System.out.println(numeros.get(2));
        
        //trocar o valor de um elemento 
        numeros.set(0, 100);
        System.out.println(numeros.get(0));
        
        //acessar a primeira ocorrencia de um valor
        System.out.println(numeros.lastIndexOf(100));
              
        //acessar a ultima ocorrencia de um valor
         System.out.println(numeros.indexOf(999));
         
        // Verifica o tamanho do ArrayList.
        System.out.println(numeros.size());
        
        // Verifica se o ArrayList esta vazio ou não.
        System.out.println(numeros.isEmpty());
        
        // Verifica se um elemento está na lista.
        System.out.println(numeros.contains(100));
    }
}


