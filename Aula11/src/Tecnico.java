package com.mycompany.aula11;

public class Tecnico extends Aluno{
    //Atributos
    private String regProfissional;
    
    //Métodos especiais
    public String getRegProfissional() {
        return regProfissional;
    }

    public void setRegProfissional(String regProfissional) {
        this.regProfissional = regProfissional;
    }
    
    //Outros métodos
    public void praticar(){
        System.out.println("Praticando...\n");
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nome=" + nome + ", regProfissional=" + regProfissional + '}';
    }
}
