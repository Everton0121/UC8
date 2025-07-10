/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.conexaobanco242n;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class ConexaoBanco242n {

    public static void main(String[] args) {

//        Conexao.conectar();
        Usuario usuario = new Usuario("everton@gmail.com","comerOCuDoJoao");
        Crud.registrarUsuario(usuario);
    }
}
