/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.credenciais;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Credenciais {

         public static String[] info(String email, String senha){
        
//        String[] info = new String[2];
//        info[0] = email;
//        info[1] = senha;
//        return info;

        return new String[]{email, senha};
    }
    
    public static void main(String []args){
        
         String[] info = info("everton.edu.20092gmail.com","123");
         System.out.println(info[0] + " " + info[1]);
    }
}
 
/*
    refaça o metodo anterior, mas agora ele retorna um array de String
    e ele aceita como parametro um objeto do tipo usuario
]
*/

