package com.mycompany.aula04_3;

public class Aula04_3 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("Bic",7.4f, "Azul");
        
        //O objeto passa alguns atributos que ela terá logo em sua criação.
        
        c1.status();
        
        /**
         * Podemos observar na saída que os valores de modelo, ponta, cor e tampada 
         * já foram previamente definidos.
         */
    }
}
