package com.mycompany.aula11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Diferentemente da classe visitante, Aluno é uma herança para diferença, pois além de herdar 
 * tudo da classe Pessoa também implementa novos comportamentos e características, tornando-a diferente
 * da classe herdada.
 */

/**
 * public final class Aluno extends Pessoa
 * Ao fazer isso a classe automaticamente se torna folha, ou seja, com ela não será mais possível
 * gerar outras classes ou seja não poderá ser herdada.
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
    /**
     * public final void pagarMensal()
     * Ao fazer isso o método não poderá mais ser sobrescrito 
     */
    public void pagarMensal() {
        /**
         * Ao tornar os atributos de pessoa protegidos podemos utilizálos tranquilamente nas
         * classes filhas, pois neste tipo de visibilidade elas também podem acessálos.
         */
        System.out.println("Pagando mensalidade do aluno " + this.nome + "...");
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            System.out.println("error");
        }
        
        System.out.println("Pagamento realizado!\n");
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matr=" + matr + ", curso=" + curso + '}';
    }
}
