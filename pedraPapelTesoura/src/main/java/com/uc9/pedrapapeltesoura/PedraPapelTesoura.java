/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.pedrapapeltesoura;


import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class PedraPapelTesoura {

    public static void main(String[] args) {
        
       Game game = new Game ();
       game.jogo();
    }
}

// significado de equals
//   O método equals
// é um método da classe Object em Java e é usado para comparar o conteúdo de dois objetos,
// ou seja, verificar se os dois objetos são igualmente representados.
// exemplo
/*
String a = "pedra";
String b = "pedra";
String c = "papel";

System.out.println(a.equals(b));  // true, pois "pedra" é igual a "pedra"
System.out.println(a.equals(c));  // false, pois "pedra" é diferente de "papel"
*/