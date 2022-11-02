package com.mycompany.aula10;

public class Admin extends Pessoa{
    
    //Atributos
    private String login;
    private String senha;
    
    //Construtor
    public Admin(){
        this.setNome("Jubiscleison");
        this.setIdade(25);
        this.setSexo("Masculino");
        this.login = "jubinho";
        this.senha = "*U4578%IjC";
    }

    //Métodos
    public boolean checarLogin(String login){
        if(this.getLogin().equals(login)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checarSenha(String senha){
        if(this.getSenha().equals(senha)){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Métodos especiais
    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    
    
}
