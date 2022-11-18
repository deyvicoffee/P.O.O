package com.mycompany.aula12;

public class Ave extends Animal{
    //Atributos
    protected String corPena;

    //Métodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //Outros métodos
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    //Implementação dos métodos abstrados
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void dados() {
        System.out.println("Ave{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corPena=" + corPena + "}\n");
    }
}
