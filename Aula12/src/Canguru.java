package com.mycompany.aula12;

public class Canguru extends Mamifero{
    /**
     * Como o método locomover já foi declarado na surperclasse de canguru devemos sobrescreve-lo caso quisermos que 
     * ele se tenha outro comportamento.
     */
    
    /**  
     * Outro detalhe é que para sobrescrevermos um método de uma superclasse ambos devem possuir
     * as mesmas assinaturas, ou seja, os paramentros recebidos devem ser do mesmo tipo e quantidade.
     */
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    @Override
    public void dados() {
        System.out.println("Canguru{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + ", corPelo=" + corPelo + "}\n");
    }
}
