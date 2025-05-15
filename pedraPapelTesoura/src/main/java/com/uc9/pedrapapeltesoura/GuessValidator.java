/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.pedrapapeltesoura;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class GuessValidator {
    
      public String validateGuess(String playerMao, String pcMao) {
          String resultado;
       if (playerMao.equals(pcMao)) {

                       resultado = "E";                    
            
        } else if ((playerMao.equals("pedra") && pcMao.equals("tesoura")) ||
                   (playerMao.equals("papel") && pcMao.equals("pedra")) ||
                   (playerMao.equals("tesoura") && pcMao.equals("papel"))) {
          
            resultado = "V";
        } else {
           resultado = "D";
        }
      return resultado;
      }
      }



