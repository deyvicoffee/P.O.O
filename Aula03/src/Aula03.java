package com.mycompany.aula03;


public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal"; //atributo publico, portanto permite a modificação
        
        c1.cor = "Vermelha"; //atributo publico, portanto permite a execução
        
        //c1.ponta = 7.0f; //Erro: ponta has private access in Caneta 
        
        c1.carga = 80; //deu certo pois a classe aula03 possui um metodo principal que está utilizando a classe caneta.
        
        //c1.tampada = false;
        c1.tampar();
        
        //No exemplo acima conseguimos mexer no atributo tampada mesmo sendo privado
        //pois ele está dentro de um método publico que dá acesso ao atributo.
        //Isso é possível pois atributos privados podem ser modificados apenas pela classe,
        //assim os metodos dentro da classe podem 
        
        c1.status();
        
        c1.rabiscar();
        
        
    }
   
}
    