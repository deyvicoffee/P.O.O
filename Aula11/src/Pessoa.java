package com.mycompany.aula11;

/**
 * Classe raiz. Por ser abstrata não pode ser instanciada. Ela servirá de base para a construção
 * de outras classes (classes filhas).
 */ 
public abstract class Pessoa
{
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Métodos
    
    //Ao habilitar a linha abaixo podemos observar o seguinte erro: abstract methods cannot have a body
    //isso ocorre pois métodos abstrados não podem ser implementados na classe progenitora apenas declarados
    /*public abstract void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }*/
    
    public final void fazerAniv() //final => método que não pode ser sobrescrito
    {
        this.setIdade(this.getIdade() + 1);
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
}
