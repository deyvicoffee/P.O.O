package com.mycompany.aula11;

/**
 * Bolsista além de ser descendente de Pessoa também é uma especialização de Aluno, consequentemente Bolsista
 * herda tudo de Aluno e como Aluno herda de Pessoa bolsista também terá os comportamentos e características de Pessoa.
 */
public class Bolsista extends Aluno{
    
    //Atributos
    private float bolsa;

    //Métodos especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
   
    //Outros métodos
    public void pagarMensal(){
        
    }
}
