/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Ex1 {
    public static void parOuImpar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("insira um numero");
        
        int numero = sc.nextInt();
        String parImpar = (numero % 2 == 0)? "par":"impar";
        
        System.out.println("numero " + numero + " é " + parImpar + ".");
      
    }
}
