package com.mycompany.aula10;

public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos
    public void receberAum(float aum){
        this.setSalario(this.getSalario() + aum);
        System.out.println("Parabéns! Agora seu novo salário é de R$" + this.getSalario() + " reais.\n");
    }
    
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
    
    public void status(){
        System.out.println("Professor: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário: " + this.getSalario() + "\n");
    }
}