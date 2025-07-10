/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.excesseos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Excesseos {

    public static void main(String[] args) throws FileNotFoundException {
         
        //tipos de excessoes
        
        String nome = null;
        System.out.println(nome.length());  // Lança NullPointerException
        
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);  // Lança ArrayIndexOutOfBoundsException
        
        int result = 10 / 0;  // Lança ArithmeticException
        
       // Class.forName("com.exemplo.MinhaClasse");  // Lança ClassNotFoundException se a classe não existir
        
        FileInputStream file = new FileInputStream("arquivo.txt");  // Lança FileNotFoundException se o arquivo não existir
        
        String str = "abc";
        int num = Integer.parseInt(str);  // Lança NumberFormatException
        
        try{
        FileReader arquivo = new FileReader("arquivo.txt");
        }catch(FileNotFoundException error){
        System.out.println(error.getMessage());
    }
        
       //tratamento de exessoes
        
       double resultado;
       
/*
        try significa 'tentar'
        tente fazer algo
       
       try = tente/tenta = tente executar o codigo
       cach = capturar - se gerar uma execessao, caputre-a e faça algo com isso
*/
       
       try{  resultado = 10 / 0;
           System.out.println(resultado); 
           
       }catch(ArithmeticException error){ //capturar
           //se der erro, me mostra uma mensagem
           System.out.println(error.getMessage());
             
    }   
       
        System.out.println("esse codigo deve ser execultad!");
    
       
    }
}


