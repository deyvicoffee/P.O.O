package com.mycompany.aula07;

public class Lutador {
    
    //Contrutor
    //Recebe parametros para a criação de um objeto, assim na classe principal não será preciso 
    //instanciá-los individualmente como lutado.nome, lutador.idade..., assim ao criamos um lutador
    //já passamos as características dele.

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso); //se fosse uma chamada direta ele nunca iria entrar no método setPeso e consequentente não iria conseguir definir a categoria.
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    //Atributos
    //E importante que os atributos/variáveis internas/dados/características de um 
    //determinado objeto sejam encapsuladas para que haja uma maior segurança, uma vez
    //que os mesmos descrevem aspéctos únicos e particulares de cada um deles.
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        //só pode ser alterado pelo sistema caso houver uma modificação no peso. 
        
        float p = this.peso;
        if(p<52.2){
            this.categoria = "Invalido";
        }
        else if(p<=70.3){
            this.categoria = "Leve";
        }
        else if(p<=83.9){
            this.categoria = "Médio";
        }
        else if(p<=120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //Outros métodos
    //Como não são métodos especiais não estaremos dando acesso direto a eles
    //aos atributos, mas sim faremos com que utilizem os métodos especiais
    public void apresentar(){
        System.out.println("Lutador " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "kg");
        System.out.println("Ganhou " + getVitorias() + " lutas");
        System.out.println("Perdeu " + getDerrotas() + " lutas");
        System.out.println("Empatou " + getEmpates() + " lutas\n");
    }
    
    public void status(){
        System.out.println("O lutador " + this.getNome() + " é um Peso " + this.getCategoria() + " e possui: ");
        System.out.print(this.getVitorias() + " vitórias \t");
        System.out.print(this.getDerrotas() + " derrotas \t");
        System.out.println(this.getEmpates() + " empates \t\n");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
