package com.mycompany.aula12;


public class Peixe extends Animal{
    //Atributo
    protected String corEscama;

    //Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //Outros métodos
    public void soltarBolha(){
        System.out.println("Soltou bolha");
    }

    //Implementação dos métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void dados() {
        System.out.println("Peixe{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corEscama=" + corEscama + "}\n");
    }
}
