/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.abstracts;


/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Abstracts {

    public static void main(String[] args) {

        Mobilia sofa = new Sofa("azul", "madeira");
        Mobilia mesa = new Mesa("preta", "metal");

        sofa.montar();  // Saída: Montando o sofá de cor azul feito de madeira.
        mesa.montar();  // Saída: Montando a mesa de cor preta feita de metal.
        sofa.desmontar(); // Saída: Desmontando a mobília.
    }
}
    

