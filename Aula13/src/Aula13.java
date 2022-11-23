package com.mycompany.aula13;

public class Aula13 {

    public static void main(String[] args) {
        //classe abstrata, portando não pode ser instanciada.
        //Animal animal = new Animal();

        Mamifero mamifero = new Mamifero();        
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();
    
        /**
         * Por meio do polimorfismo de sobreposição conseguimos
         * ter a emissão de som de acordo com o animal criado
         */
        mamifero.emitirSom();
        lobo.emitirSom();
        cachorro.emitirSom();
        
        System.out.println("\nReações do cachorro de acordo com...".toUpperCase());
        
        System.out.println("\nTIPO DA FRASE");
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        
        System.out.println("\nPERÍODO DO DIA");
        cachorro.reagir(11, 45); 
        cachorro.reagir(16, 30);
        cachorro.reagir(21,00);
        
        System.out.println("\nDONO");
        cachorro.reagir(true);
        cachorro.reagir(false);
        
        System.out.println("\nIDADE E PESO");
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);
    }
}
