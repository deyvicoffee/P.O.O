package com.mycompany.aula13;

public class Cachorro extends Lobo{
    //polimorfismo de sobreposição
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au!");
    }
    
    //polimorfismo de sobrecarga
    /**
     * Se duplicarmos um método na mesma classe dára o seguinte erro: method reagir() is already defined in class Cachorro
     * Isso porque para termos um método que se comporta de várias maneiras em uma mesma classe precisamos atribuir
     * assinaturas direrentes para cada um deles.
     */
    public void reagir(String frase){
        /**
         * Como frase é um objeto da classe String podemos utilizar um de seus métodos que foi criado
         * especificamente para fins de comparação de String, o método equals.
         */
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println(frase + ": Abana e Late");
        }else{
            System.out.println(frase + ": Rosna");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora > 60 || min > 60){
            System.out.println("Tempo inválido.");
        }
        else if (hora < 12){
            System.out.println("Manhã: Abana o rabo");
        }
        else if(hora >= 18){
            System.out.println("Noite: Ignora");
        }
        else{
            System.out.println("Tarde: Abana e Late");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("É o Dono: Abana o rabo");
        }
        else{
            System.out.println("Não é o dono: Rosna e Late");
        }
    }
    
    public void reagir(int idade, float peso){
        if(idade < 5){
            if(peso < 10){
                System.out.println("Novo e leve: Abana o rabo"); //Filhote de vira-lata
            }else{
                System.out.println("Novo e pesado: Late"); //Buldogue francês
            }
        }
        else{
            if(peso < 10){
                System.out.println("Velho e leve: Rosna"); //Pinscher
            }else{
                System.out.println("Velho e pesado: Ignora"); //Mastim Inglês
            }
        }
    }
    
    /**
     * Como a assinatura se trata da quantidade e tipo dos parametros recebidos pelo método 
     * a linha abaixo é inválida pois na classe já possui um método que tem como assinatura 
     * 2 inteiros 
     */
    //public void reagir(int x, int y){}
    
    
    /**
     * Por mais que já tenhamos na classe um método com assinatura 1 inteiro e 1 float a linha abaixo
     * é válida pois o método possui uma leve diferença na assinatura, 1 float e 1 inteiro. Uma sutil
     * modificação na ordem já torna a assinatura diferente.
     */
    //public void reagir(float x, int y){}
}
