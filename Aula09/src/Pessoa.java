package com.mycompany.aula09;


public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Outros métodos
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabéns! Agora você tem " + this.getIdade() + " anos de idade!");
    }
    
}
