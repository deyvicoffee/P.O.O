package com.mycompany.aula11;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //Outros métodos
    public void receberAum(Float aum){
        this.setSalario(this.getSalario() + aum);
        System.out.println("Aumento realizado! Salário atual: R$" + this.getSalario() + " reais\n");
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
}
