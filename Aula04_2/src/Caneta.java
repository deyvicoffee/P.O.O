package com.mycompany.aula04_2;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    /**
     * Métodos contrutores definem valores para os atributos
     * de um objeto assim que eles são criados.
     */
    public Caneta(){
        this.tampada = false;
        this.cor = "Azul";
    }
    
    /* MODELO */
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    /* PONTA */
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    /* TAMPAR */
    public void tampar(){
        this.tampada = true;
    }
    
    /* DESTAMPAR */
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("ESPECIFICAÇÕES DA CANETA:");
        System.out.println("MODELO :"+this.modelo);
        System.out.println("PONTA: "+this.ponta);
        System.out.println("TAMPADA : "+this.tampada);
        System.out.println("COR: "+this.cor);
    }
}
