package com.mycompany.aula12;

public class Reptil extends Animal{
    //Atributo
    protected String corEscama;

    //Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    //Implementação dos métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
    public void dados() {
        System.out.println("Reptil{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corEscama=" + corEscama + "}\n");
    }
}
