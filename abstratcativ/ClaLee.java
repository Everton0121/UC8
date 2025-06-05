/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.abstratcativ;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class ClaLee extends Cla{
    
    public ClaLee(String lider){
    super("Lee", lider);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Dominio de taijutsu e aberturas dos 8 portoes");
    }
    
   public void ataqueEspecial(){
       System.out.println("Furação da Folha");
   }
}
