package com.mycompany.aula12;

public class Mamifero extends Animal{
    //Atributo
    protected String corPelo;

    //Métodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //como herdamos de uma classe abstrada, os métodos abstratos que não são implementados na progenitora deverão ser 
    //implementados em suas classes filhas, para isso devemos sobrepô-los a fim de explicitar suas ações
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
    public void dados() {
        System.out.println("Mamifero{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corPelo=" + corPelo + "}\n");
    }
}
