package com.mycompany.aula04_3;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    /**
     * Neste caso o construtor recebe alguns parametros para para definir valores aos 
     * atributos de um objeto no momento de sua criação.
     * @param m
     * @param p
     * @param c
     */
    public Caneta(String m, float p, String c){
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
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
