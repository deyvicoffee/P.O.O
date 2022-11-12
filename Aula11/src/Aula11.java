package com.mycompany.aula11;

public class Aula11 {

    public static void main(String[] args) {
        
        /**
         * Na linha abaixo ocorre um erro pois como Pessoa 
         * é uma classe abstrada ela não pode ser instanciada.
         */
        //Pessoa p1 = new Pessoa();
        
        
        /**
         * Herança de implementação
         */
        Visitante v1 = new Visitante();
        v1.setNome("Lúcio");
        v1.setIdade(28);
        v1.setSexo("M");
        System.out.println(v1.toString()+"\n");
 
        /**
         * Herança para diferença 
         */
        Aluno a1 = new Aluno(); //generalização de bolsista e técnico
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatr("A489DFJ3");
        a1.setCurso("Informática");
        System.out.println(a1.toString()); 
        a1.pagarMensal();
        
        
        Professor p1 = new Professor();
        p1.setNome("Ana");
        a1.setIdade(16);
        a1.setSexo("F");
        p1.setEspecialidade("Matemática");
        p1.setSalario(2500.10f);
        System.out.println(p1.toString());
        p1.receberAum(300f);
        
        
        Bolsista b1 = new Bolsista(); //especialização de aluno
        //herdado de pessoa:
        b1.setNome("Jubileu");
        b1.setIdade(21);
        b1.setSexo("M");
        
        //herdado de aluno:
        b1.setMatr("902NF3289");
        b1.setCurso("Artes");
        
        //implementado:
        b1.setBolsa(300);
        System.out.println(b1.toString());
        
        //herdado de aluno e sobrescrito
        b1.pagarMensal();
        
        
        Tecnico t1 = new Tecnico(); //especialização de aluno
        //herdado de pessoa:
        t1.setNome("Jubiscleison");
        t1.setIdade(51);
        t1.setSexo("M");
        
        //herdado de aluno:
        t1.setMatr("902NF3289");
        t1.setCurso("Artes");
        
        //implementado:
        t1.setRegProfissional("Y3434PFNF");
        System.out.println(t1.toString());
        t1.praticar();
    }
}
