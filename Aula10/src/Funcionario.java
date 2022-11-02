package com.mycompany.aula10;

public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Construtor
    public Funcionario(){
        this.trabalhando = true;
    }
    
    //Métodos
    public void mudarTrabalho(){
        this.trabalhando = !this.trabalhando;
    }
    
    //Métodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void status(){
        System.out.println("Funcionário: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Estado atual: " + (this.isTrabalhando() ? "Trabalhando\n" : "Descansando\n"));
    }
}
