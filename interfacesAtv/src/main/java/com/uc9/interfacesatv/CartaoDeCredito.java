/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.interfacesatv;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class CartaoDeCredito implements Pagamento {

    private String numeroCartao;
    int codigoDeSeguranca;

    public CartaoDeCredito(String numeroCartao, int codigoDeSeguranca) {
        this.numeroCartao = numeroCartao;
        this.codigoDeSeguranca = codigoDeSeguranca;
    }
    
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de  R$" +  valor + " processado via Cartão de Crédito");
    }

    @Override
    public String obterDetalhes() {
        return numeroCartao.substring(numeroCartao.length()-4);
    }
    
}
