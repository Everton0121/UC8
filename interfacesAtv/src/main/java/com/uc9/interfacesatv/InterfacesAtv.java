/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.interfacesatv;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class InterfacesAtv {

    public static void main(String[] args) {
        
        // exemplo de substring
  // serve para retirar as letras do da palavras dai e so botar a condidade      
//        String palavra ="unhappy";
//        System.out.println(palavra.substring(2));
// 

    CartaoDeCredito cartaocredito = new CartaoDeCredito("12345678",1234);
    cartaocredito.processarPagamento(1000000);
        System.out.println( cartaocredito.obterDetalhes());
    
    PayPal paypal = new PayPal("everton.edu.2009@gmail.com");
    paypal.processarPagamento(20000);
        System.out.println(paypal.obterDetalhes());
    }
}
