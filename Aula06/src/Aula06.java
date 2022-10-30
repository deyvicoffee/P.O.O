package com.mycompany.aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();
        
        cr.ligar();
        
        cr.maisVolume();
        cr.maisVolume();
        cr.maisVolume();
        cr.maisVolume();
        
        cr.abrirMenu();
        cr.fecharMenu();
       
        cr.play();
        cr.ligarMudo();
        cr.desligar();
        cr.abrirMenu();
        
        //cr.volume = 10;
        //Não é possível fazer a operação acima pois:
        //1° - o atributo é privado, ou seja só a classe detentora dele pode utilizar
        //2° - o atributo está encapsulado, é possível acessá-lo só por meio de métodos especiais
        //3° - os métodos especiais que dão acesso a ele também são privados.
        //Resultado = código mais seguro!
        
    }
}
