package com.mycompany.aula04;

public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        
        c1.setModelo("Bic");
        //c1.modelo = "Bic"; => Atributo de acesso privado, portanto não conseguimos modifica-lo diretamente.
        
        c1.setPonta(5.0f);
        //c1.ponta = 0.5f; => Atributo de acesso privado, portanto não conseguimos modifica-lo diretamente.
        
        
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Ponta: "+c1.getPonta());
        
        
        /**
         * Atributos privados só podem ser acessados por quem os criou, dessa forma ao se fazer um
         * acesso direto a eles com o uso de c1.modelo por exemplo resultará em um erro pois não se 
         * sabe certamente quem está querendo obter acesso a eles, assim ao usar os métodos específicos e autorizados
         * a fazer o acesso as informações daquele objeto (getters) conseguimos obter os dados.
         */
        
        //c1.status();
        
    }
}
