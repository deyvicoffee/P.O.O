package com.mycompany.aula10;

import java.util.Scanner;

public class Aluno extends Pessoa{
    
    //Atributos
    private String matr;
    private boolean matriculado;
    private String curso;
    
    //Construtor
    public Aluno(){
        this.matriculado = true;
    }
    
    //Métodos
    public void cancelarMatr(){
        System.out.print("\nVocê quer realmente cancelar a sua matrícula? (S/N) : ");
        Scanner in = new Scanner(System.in);
        String opc = in.nextLine();
        System.out.println("");
        if(opc.equals("S") || opc.equals("s")){
            if(this.isMatriculado()){
                this.setMatriculado(false);
                this.setCurso(null);
                System.out.println("Matrícula cancelada.");
            }else{
                System.out.println("Não é possível cancelar a matrícula pois esta pessoa não está matriculado(a).");
            }
        }else if(opc.equals("N") || opc.equals("n")){
            System.out.println("Operação cancelada.");
        }else{
            System.out.println("Opção inválida, não foi possível cancelar a matrícula.\n");
        }
    }
    
    //Métodos especiais
    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void status(){
        System.out.println("Aluno: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Curso: " + ((this.getCurso() != null) ? this.getCurso(): "Não alocado"));
        System.out.println("Estado: " + ((this.isMatriculado() == true) ? "Matriculado\n" : "Não matriculado\n"));
    }
}
