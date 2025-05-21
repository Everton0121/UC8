/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc9.credenciaisexemplosor2;

/**
 *
 * @author EDUARDOEVERTONRODRIG
 */
public class usuario {
     
    private String name;
    private String email;
    private String senha;

    public usuario(String name, String email, String senha) {
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
