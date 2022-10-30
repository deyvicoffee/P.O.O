
package com.mycompany.aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3]; //vetor de pessoas
        Livro[] l = new Livro[2]; //vetor de livros
        
        //Os 3 elementos do vetor Pessoa terão dados do tipo pessoa com as seguintes especificações:
        p[0] = new Pessoa("Maurício", 86, "masculino");
        p[1] = new Pessoa("Clarice Lispector", 56, "feminino");
        p[2] = new Pessoa("Christopher", 25, "masculino");
        
        //Os 2 elementos do vetor Livro terão dados do tipo livro com as seguintes especificações:
        l[0] = new Livro("Chico Bento", p[0], 20, p[2]);
        l[1] = new Livro("A hora da estrela", p[1], 106, p[2]);
        
        l[0].abrir();
        l[0].folhear(30);
        l[0].avancarPag();
        l[0].detalhes();
        
    }
}
