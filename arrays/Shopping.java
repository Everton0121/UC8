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
            System.out.println("Sistema de Compras");
            System.out.println("1 - Adicionar produto\n" 
                    +"2 - Remover produto\n"  
                    +"3 - Ver carrinho\n" 
                    +"4 - Finalizar compra\n" 
                    +"5 - Sair\n"
                    +"Digite a opção desejada: ");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Escolha um produto para adicionar:\n" 
                        +" 1 - Televisão \n" 
                        +" 2 - Camiseta \n"
                        +" 3 - Batata frita congelada ");
                    int opcaoAdd = sc.nextInt();
                    Produto produto;
                    switch(opcaoAdd){
                        case 1:
                            produto = new Eletronico("Televisao",1999.99);
                            carrinho.add(produto);
                            System.out.println(produto.getName() + " adicionado ao carrinho");
                        break;
                        
                        case 2:
                            produto = new Vestuario("Camiseta",99.99);
                            carrinho.add(produto);
                            System.out.println(produto.getName() + " adicionado ao carrinho");
                        break;
                        
                        case 3:
                            produto = new Eletronico("Batata Frita Congelada",20.50);
                           exibir();
                        break;
                        default:
                            System.out.println("Opção invalida");
                        break;
                }
                break;
                    
                case 2:
                    if(!carrinho.isEmpty()){
                        System.out.println("Escolha o produto para remover");
                        exibir();
                        int opcaoRemove =sc.nextInt()-1;
                        if(opcaoRemove <= 0 || opcaoRemove > carrinho.size()){
                            System.out.println("Opção invalida");
                        }else{
                            carrinho.remove(opcaoRemove);
                            System.out.println("Produto removido!");
                        }
                    }else{
                        System.out.println("O carrinho está vazio. Não há o que remover.");
                    }
                break;
                
                case 3:
                    if(!carrinho.isEmpty()){
                    System.out.println("Seu carrinho tem estes itens");
                    }else{
                    exibir();
                    System.out.println("Seu carrinho não tem nada seu pobre!");
                    }
                break;
                    
                case 4:
                    if(!carrinho.isEmpty()){
                        double valor = 0;
                        for(Produto item: carrinho){
                            valor+= item.getPrice();
                        }
                        System.out.println("Valor total: R$" + valor);
                        System.out.println("Compra finalizada");
                    }else{
                        System.out.println("O carrinho esta vazio. Não é possivel finalizar a compra");
                    }
                break;
                
                case 5:
                    System.out.println("flw");
                    return;
                
                default:
                    System.out.println("Opção Invalida");
                break;
            }
        }
    }
    public void exibir(){
         for(int i = 0; i < carrinho.size(); i++){
        System.out.println(i+1 + " - " + carrinho.get(i).getName());
    
         }
    }
}
