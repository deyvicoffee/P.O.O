package com.mycompany.aula14_projetofinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    //Como Gafanhoto é uma Pessoa é necessário passar os atributos nome, idade e sexo na inicialização.

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        /**
         * O super é usado para referir elementos das superclasses, portanto, se a classe mãe possui
         * um construtor que recebe alguns parametros na inicialização, por meio do super conseguimos
         * chamar esse construtor e passar os parametros que são obrigatórios na criação de qualquer 
         * Pessoa para ele.
         */ 
        super(nome, idade, sexo); 
        
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
        System.out.println("Parabéns por assistir mais um vídeo! Agora você possui " + this.getTotAssistido() + " videos assistidos.");
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + 
                super.toString() + //refencia o método toString da superclasse
                ", login=" + login + 
                ", totAssistido=" + totAssistido + 
                '}';
    }
}
