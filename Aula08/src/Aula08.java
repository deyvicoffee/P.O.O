package com.mycompany.aula08;

public class Aula08 {

    public static void main(String[] args) {
        
        Lutador l[];
        
        l = new Lutador[10];
        
        l[0] = new Lutador("Pretty Boy", "Francês", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putsript","Brasileiro", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "Americado", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australiano", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasileiro", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "Americado", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta(); //UEC => Ultra emoji combat
        UEC01.marcarLuta(l[0], l[1], 2);
        UEC01.lutar();
    }
}
