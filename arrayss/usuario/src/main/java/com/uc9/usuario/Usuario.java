/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc9.usuario;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class Usuario {
    
    private String name;
    private String email;
    private String senha;

    public Usuario(String name, String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.name = name;
    }

  
     public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }
     
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
            
        
  
    
}
/*
    refaça o metodo anterior, mas agora ele retorna um array de String
    e ele aceita como parametro um objeto do tipo usuario
*/
    

