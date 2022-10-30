package com.mycompany.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro: Não é possível rabiscar.");
        }
        else{
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor: " +this.cor);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " +this.carga);
        System.out.println("Está tampada: " +this.tampada);
    }
        
}
