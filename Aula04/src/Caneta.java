package com.mycompany.aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    
    /*  --- MODELO ---  */    
    //metodo getter-acessor
    public String getModelo(){
        return this.modelo;
    }
    //metodo setter-modificador
    public void setModelo(String m){
        this.modelo = m;
    }
    
    /*  --- PONTA ---  */
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    /*  --- STATUS ---  */
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("MODELO: "+this.modelo);
        System.out.println("PONTA: "+this.ponta);
    }
}
