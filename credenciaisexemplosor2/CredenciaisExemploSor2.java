/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.credenciaisexemplosor2;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class CredenciaisExemploSor2 {

    public static String[] info(usuario usuario){
        return new String[]{usuario.getEmail(), usuario.getSenha(), usuario.getName()};
    }
    
    public static void main(String[] args){
        //Usuario usuario = new Usuario("everton.edu.2009@gmail.com", "sei la");
     String[] info = info (new usuario("everotn","everton.edu.2009@gmail.com",  "123"));
        System.out.println(info[0] + " " + info[1]);
    }
}
