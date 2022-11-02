package com.mycompany.aula10;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
        
        System.out.println("Agora " + this.getNome() +" tem " + this.getIdade() + " anos de idade\n");
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
}
