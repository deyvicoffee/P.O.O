package com.mycompany.aula07;

public class Aula07 {

    public static void main(String[] args) {
        //Podemos fazer a inserção de objetos dentro de um vetor como se fossem variáveis comuns.
        
        Lutador l[]; //criaçao de um vetor/variavel composta de lutadores
        
        l = new Lutador[10]; //inicializa a variável indicando que ela vai ter um conjunto de 10 lutadores
        
        l[0] = new Lutador("Pretty Boy", "Francês", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putsript","Brasileiro", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "Americado", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australiano", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasileiro", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "Americado", 30, 1.81f, 105.7f, 12, 2, 4);
    
        l[0].apresentar();
        l[2].status();
        l[2].perderLuta();
        l[2].status();
        
        System.out.println("Nerdaard antes:");
        System.out.println("Categoria: " + l[5].getCategoria() + "\n");
        
        l[5].setPeso(81.7f);
        
        System.out.println("Nerdaard depois de perder 24kg:");
        System.out.println("Categoria: " + l[5].getCategoria() + "\n");
    }
}
