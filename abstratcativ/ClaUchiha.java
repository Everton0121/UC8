/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.abstratcativ;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class ClaUchiha extends Cla{
  
//       jeito mais facil
    public ClaUchiha(String lider){
         super("Uchiha", lider);
    }
//        jeito mais dificil
//    public ClaUchiha(String nomeDoCla, String lider) {
//        super(nomeDoCla, lider);
//    }
            
    @Override
    public void habilidadeEspecial() {
    System.out.println("Habilidade Especial: Sharingan.");
    }
    
}
