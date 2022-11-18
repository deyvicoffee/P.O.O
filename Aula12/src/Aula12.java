package com.mycompany.aula12;

public class Aula12 {

    public static void main(String[] args) {
        /**
         * Como animal é uma classe abstrata ela não pode ser instanciada, logo a linha 
         * e baixo não é valida
         */
        //Animal animal = new Animal();

        //Instanciando subclasses de Animal
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        
        //MAMÍFERO
        //Os atributos definidos abaixo vieram de Animal
        mamifero.setPeso(85.3f);
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        
        /**
         * Os métodos abaixo vieram da superclasse animal mas foram sobrescritos
         * pela classe mamífero, logo mamífero terá um comportamento diferente dos
         * demais animais.
         */ 
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();
        
        mamifero.setCorPelo("Preto");
       
        mamifero.dados();
        
        
        //RÉPTIL
        reptil.setPeso(8f);
        reptil.setIdade(2);
        reptil.setMembros(4);
        
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();
        
        reptil.setCorEscama("Verde");
       
        reptil.dados();
        
        
        //AVE
        ave.setPeso(2f);
        ave.setIdade(1);
        ave.setMembros(4);
        
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        
        ave.setCorPena("Azul");
       
        ave.dados();

        
        //PEIXE
        peixe.setPeso(2000);
        peixe.setIdade(20);
        peixe.setMembros(4);
        
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        
        peixe.setCorEscama("Cinza");
       
        peixe.dados();
        
        
        System.out.println("-----------------------");
        
        
        //Instaciando classes descendentes de Animal
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        
        
        //CANGURU
        //Atributos herdados de Animal
        canguru.setPeso(52f);
        canguru.setIdade(17);
        canguru.setMembros(4);
        
        //Métodos herdados de Animal mas que foram sobrecritos pela classe Mamifero
        canguru.alimentar();
        canguru.emitirSom();
        /**
         * Além de ser sobrescrito por Mamífero, locomover e um método que também
         * foi sobrescrito pela classe Canguru, uma vez que Cagurus se locomovem de forma diferente
         * dos demais mamiferos.
         */
        canguru.locomover();
        
        //Método herdado de Mamífero
        canguru.setCorPelo("Marrom");
       
        //Método implementado por canguru.
        canguru.usarBolsa();
        
        canguru.dados();
        
        
        //CACHORRO
        cachorro.setPeso(20f);
        cachorro.setIdade(5);
        cachorro.setMembros(4);
        
        cachorro.alimentar();
        cachorro.emitirSom();
        cachorro.locomover();
        
        cachorro.setCorPelo("Preto e Branco");
       
        cachorro.enterrarOsso();
        cachorro.abanarRabo();
        
        cachorro.dados();
        
        
        //COBRA
        cobra.setPeso(5f);
        cobra.setIdade(3);
        cobra.setMembros(0);
        
        cobra.alimentar();
        cobra.emitirSom();
        cobra.locomover();
        
        cobra.setCorEscama("Verde");

        cobra.dados();
        
        
        //TARTARUGA
        tartaruga.setPeso(90f);
        tartaruga.setIdade(30);
        tartaruga.setMembros(4);
        
        tartaruga.alimentar();
        tartaruga.emitirSom();
        tartaruga.locomover();
        
        tartaruga.setCorEscama("Verde escuro");

        tartaruga.dados();
        
        
        //GOLDFISH
        goldfish.setPeso(0.500f);
        goldfish.setIdade(2);
        goldfish.setMembros(4);
        
        goldfish.alimentar();
        goldfish.emitirSom();
        goldfish.locomover();
        
        goldfish.setCorEscama("Amarelo");
        goldfish.soltarBolha();
        
        goldfish.dados();
        
        
        //ARARA
        arara.setPeso(1f);
        arara.setIdade(2);
        arara.setMembros(4);
        
        arara.alimentar();
        arara.emitirSom();
        arara.locomover();
        
        arara.setCorPena("Amarelo e Azul");
        arara.fazerNinho();
        
        arara.dados();
    }
}
