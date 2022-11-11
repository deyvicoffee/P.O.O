package com.mycompany.aula11;

/**
 * Diferentemente da classe visitante, Aluno é uma herança para diferença, pois além de herdar 
 * tudo da classe Pessoa também implementa novos comportamentos e características, tornando-a diferente
 * da classe herdada.
 */ 
public class Aluno extends Pessoa{
    //Atributos
    private String matr;
    private String curso;

    //Métodos especiais
    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //Outros métodos
    public void pagarMensal(){
        
    }
}
