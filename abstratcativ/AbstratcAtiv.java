/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.abstratcativ;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class AbstratcAtiv {

    public static void main(String[] args) {
        
         // Criando instâncias de cada clã
        Cla uchiha = new ClaUchiha("Sasuke Uchiha");
        Cla hyuga = new ClaHyuuga(" HiashiHyuga");
        Cla nara = new ClaNara("Shikamaru Nara");
        Cla akimichi = new ClaAkimichi("Choji Akimichi");
         Cla Lee = new ClaLee("Rock Lee");
        
        Cla[] clanList = {uchiha, hyuga, nara, akimichi, Lee };

        for (Cla clan : clanList) {
            clan.exibirDetalhes();
            clan.habilidadeEspecial();
            System.out.println();  // Adiciona uma linha em branco para melhor legibilidade
        }
    }
}
