/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Shopping {
    
    ArrayList<Produto> carrinho;
    Scanner sc;
    
    public Shopping(){
        carrinho = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    
    public void menu(){
        
        while(true){
        System.out.println("sistema de compras");
        System.out.println("1 - adicionar produto \n" 
                + "2 - remover Produto \n"
                + "3 - ver carinho \n"
                + "4 - finalizar compra \n"
                + "5 - sair \n"
                + "digite a opcao desejada:");
        int opcaoAdd = sc.nextInt();
        Produto produto;
        switch(opcaoAdd){
            case 1:
             produto = new Eletronico("televisao",1999.99);
             carrinho.add(produto);
                System.out.println(produto.getName()+ "adicionado ao carrinho");
            break;
            case 2:
             produto = new Vestuario("camisa",20.99);
             carrinho.add(produto);
                System.out.println(produto.getName()+ "adicionado ao carrinho");
            break;
            case 3:
            produto = new Alimento("batata frita",50.99);
             carrinho.add(produto);
                System.out.println(produto.getName()+ "adicionado ao carrinho");
            break;
            default:
                System.out.println("opcao invalida");
                break;
          
                   
        }
        
        int opcao = sc.nextInt();
        
        switch (opcao){
               case 1:
                    System.out.println("Escolha um produto para adicionar: \n"
                    + " 1 - televisao \n"
                    + " 2 - camisa \n"
                    + " 3 - batata firta");
                    
                break;
                    
                case 2:
                    System.out.println("Produto removido");
                break;
                
                case 3:
                    System.out.println("seu carrinho tem estes intes");
                    for (Produto item: carrinho) {
                    System.out.println(item.getName());
                    
                }
                break;
                    
                case 4:
                    System.out.println("compra concluida");
                break;
                
                case 5:
                    System.out.println("saindo....");
                    return;
                
                default:
                    System.out.println("Opção Invalida");
                break;
            }
        
        }
        
    }
    
}
