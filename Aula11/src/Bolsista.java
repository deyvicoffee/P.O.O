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
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.nome + "...");
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            System.out.println("error");
        }
        
        System.out.println("Bolsa renovada!\n");
    }
    
    
    @Override
    public void pagarMensal(){
        /**
         * Como bolsista paga mensalidade de forma diferente esse métodos deverá ser sobrescrito/sobreposto
         * ao da classe progenitora.
         */
        
        System.out.println(this.nome + " é um bolsista! Pagamento facilitado.\n");
    }

    @Override
    public String toString() {
        return "Bolsista{" + "nome=" + nome + ", bolsa=" + bolsa + '}';
    }
    
    
}
