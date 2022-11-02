package com.mycompany.aula10;

import java.util.Scanner;
import java.util.Vector;

public class Aula10 {

    public static void main(String[] args) {

        Vector<Aluno> alunos = new Vector<Aluno>();
        Vector<Funcionario> funcionarios = new Vector<Funcionario>();
        Vector<Professor> professores = new Vector<Professor>();
        Scanner in = new Scanner(System.in);
        int opc = 0;
        int idade;
        int num;
        String nome;
        String sexo;

        System.out.print("--- PESQUISA DE OCUPAÇÃO DA POPULAÇÃO BRASILEIRA ---");

        System.out.println("Selecione uma opção: ");
        menu();

        opc = in.nextInt();

        do {
            switch (opc) {
                case 1: //RESPONDER PESQUISA
                    do {
                        System.out.println("Qual é a sua ocupação?");
                        System.out.println("1 - Aluno");
                        System.out.println("2 - Funcionário");
                        System.out.println("3 - Professor");
                        System.out.print("Opção: ");

                        opc = in.nextInt();

                        if (opc != 1 && opc != 2 && opc != 3) {
                            System.out.println("Opção inválida! Por favor insira o número corresponde as opções abaixo.\n");
                        }
                    } while (opc != 1 && opc != 2 && opc != 3);

                    switch (opc) {
                        case 1:
                            Aluno aluno = new Aluno();
                            System.out.print("\nNome: ");
                            nome = in.nextLine();
                            aluno.setNome(nome);

                            System.out.print("\nIdade: ");
                            idade = in.nextInt();
                            aluno.setIdade(idade);
                            in.nextLine(); //limpa o buffer

                            System.out.print("\nSexo: ");
                            sexo = in.nextLine();
                            aluno.setSexo(sexo);

                            System.out.print("\nNúmero de matrícula: ");
                            String matr = in.nextLine();
                            aluno.setMatr(matr);

                            System.out.print("\nCurso: ");
                            String curso = in.nextLine();
                            aluno.setCurso(curso);

                            alunos.add(aluno);
                            break;

                        case 2:
                            Funcionario func = new Funcionario();

                            System.out.print("\nNome: ");
                            nome = in.nextLine();
                            func.setNome(nome);

                            System.out.print("\nIdade: ");
                            idade = in.nextInt();
                            func.setIdade(idade);
                            in.nextLine(); //limpa o buffer

                            System.out.print("\nSexo: ");
                            sexo = in.nextLine();
                            func.setSexo(sexo);

                            System.out.print("\nSetor: ");
                            String setor = in.nextLine();
                            func.setSetor(setor);

                            funcionarios.add(func);
                            break;

                        case 3:
                            Professor prof = new Professor();

                            System.out.print("\nNome: ");
                            nome = in.nextLine();
                            prof.setNome(nome);

                            System.out.print("\nIdade: ");
                            idade = in.nextInt();
                            prof.setIdade(idade);
                            in.nextLine(); //limpa o buffer

                            System.out.print("\nSexo: ");
                            sexo = in.nextLine();
                            prof.setSexo(sexo);

                            System.out.print("\nEspecialidade: ");
                            String especialidade = in.nextLine();
                            prof.setEspecialidade(especialidade);

                            System.out.print("\nSalário: ");
                            Float salario = in.nextFloat();
                            prof.setSalario(salario);

                            professores.add(prof);
                            break;
                    }

                    System.out.println("");

                    break;

                case 2://LISTAR INFORMAÇÕES
                    System.out.println("--- LISTA DE ALUNOS ---");
                    for (int i = 0; i < alunos.size(); i++) {
                        alunos.get(i).status();
                    }

                    System.out.println("--- LISTA DE FUNCIONÁRIOS ---");
                    for (int i = 0; i < funcionarios.size(); i++) {
                        funcionarios.get(i).status();
                    }

                    System.out.println("--- LISTA DE PROFESSORES ---");
                    for (int i = 0; i < professores.size(); i++) {
                        professores.get(i).status();
                    }
                    break;

                case 3://ALTERAR INFORMAÇÕES
                    Admin adm = new Admin();

                    System.out.print("Login: ");
                    String login = in.nextLine();

                    System.out.print("Senha: ");
                    String senha = in.nextLine();

                    if (adm.checarLogin(login) && adm.checarSenha(senha)) {
                        System.out.println("Bem vindo de volta " + adm.getNome() + "!");

                        do {
                            System.out.println("A pessoa que você deseja alterar possui qual ocupacao?");
                            System.out.println("1 - Aluno");
                            System.out.println("2 - Funcionário");
                            System.out.println("3 - Professor");
                            System.out.print("Opção: ");
                            opc = in.nextInt();

                            if (opc != 1 && opc != 2 && opc != 3) {
                                System.out.println("Opção inválida, vamos tentar de novo?\n");
                            }

                        } while (opc != 1 && opc != 2 && opc != 3);

                        switch (opc) {
                            case 1:
                                do {
                                    System.out.println("Selecione o número correspondente ao aluno que deseja alterar");

                                    for (int i = 0; i < alunos.size(); i++) {
                                        System.out.println("\t(" + i + 1 + ")");
                                        alunos.get(i).status();
                                    }

                                    System.out.print("Número: ");
                                    num = in.nextInt();

                                    System.out.println("");

                                    if (num > alunos.size()) {
                                        System.out.println("\nNúmero inválido.");
                                    } else {
                                        do {
                                            System.out.println("\nAluno escolhido:");
                                            alunos.get(num - 1).status();

                                            System.out.println("Quais alterações você deseja fazer?");
                                            System.out.println("1 - Atualizar idade.");
                                            System.out.println("2 - Alterar estado da matrícula");
                                            opc = in.nextInt();

                                            if (opc != 1 && opc != 2) {
                                                System.out.print("Opção inválida.");
                                            } 
                                            else if (opc == 1) {
                                                alunos.get(num - 1).fazerAniv();
                                            } 
                                            else if (opc == 2) {
                                                do{
                                                    System.out.println("Qual o novo estado da matricula?");
                                                    System.out.println("1 - Matriculado.");
                                                    System.out.println("2 - Não matriculado.");
                                                    System.out.println("3 - Cancelar matricula.");
                                                    opc = in.nextInt();
                                                    
                                                    if(opc != 1 && opc != 2 && opc != 3){
                                                        System.out.println("Opção inválida.");
                                                    }
                                                    else if (opc == 1){
                                                        alunos.get(num+1).setMatriculado(true);
                                                    }
                                                    else if (opc == 2){
                                                        alunos.get(num+1).setMatriculado(false);
                                                    }
                                                    else{
                                                        alunos.get(num+1).cancelarMatr();
                                                    }
                                                }while(opc != 1 && opc != 2 && opc != 3);
                                            }

                                        } while (opc != 1 && opc != 2);
                                    }
                                } while (num > alunos.size());
                                
                                System.out.println("Informações atualizadas!");
                                alunos.get(num+1).status();
                                
                            break;
                            
                            case 2:
                                do {
                                    System.out.println("Selecione o número correspondente ao funcionario que deseja alterar");

                                    for (int i = 0; i < funcionarios.size(); i++) {
                                        System.out.println("\t(" + i + 1 + ")");
                                        funcionarios.get(i).status();
                                    }

                                    System.out.print("Número: ");
                                    num = in.nextInt();

                                    System.out.println("");

                                    if (num > funcionarios.size()) {
                                        System.out.println("\nNúmero inválido.");
                                    } else {
                                        System.out.println("\nFuncionario escolhido:");
                                        funcionarios.get(num - 1).status();
                                        do {
                                            System.out.println("Quais alterações você deseja fazer?");
                                            System.out.println("1 - Atualizar idade.");
                                            System.out.println("2 - Alterar estado do trabalho.");
                                            opc = in.nextInt();

                                            if (opc != 1 && opc != 2) {
                                                System.out.print("Opção inválida.");
                                            } 
                                            else if (opc == 1) {
                                                funcionarios.get(num-1).fazerAniv();
                                            } 
                                            else if (opc == 2) {
                                                funcionarios.get(num-1).mudarTrabalho();
                                            }

                                        } while (opc != 1 && opc != 2);
                                    }
                                } while (num > alunos.size());
                            
                                System.out.println("Informações atualizadas!");
                                funcionarios.get(num+1).status();
                            break;
                            
                            case 3:
                                do {
                                    System.out.println("Selecione o número correspondente ao professor que deseja alterar");

                                    for (int i = 0; i < professores.size(); i++) {
                                        System.out.println("\t(" + i + 1 + ")");
                                        professores.get(i).status();
                                    }

                                    System.out.print("Número: ");
                                    num = in.nextInt();

                                    System.out.println("");

                                    if (num > professores.size()) {
                                        System.out.println("\nNúmero inválido.");
                                    } else {
                                        System.out.println("\nProfessor escolhido:");
                                        professores.get(num - 1).status();
                                        do {
                                            System.out.println("Quais alterações você deseja fazer?");
                                            System.out.println("1 - Atualizar idade.");
                                            System.out.println("2 - Informar aumento de salário.");
                                            opc = in.nextInt();

                                            if (opc != 1 && opc != 2) {
                                                System.out.print("Opção inválida.");
                                            } 
                                            else if (opc == 1) {
                                                professores.get(num-1).fazerAniv();
                                            } 
                                            else if (opc == 2) {
                                                System.out.print("Valor do aumento: ");
                                                float aumento = in.nextFloat();
                                                professores.get(num-1).receberAum(aumento);
                                            }

                                        } while (opc != 1 && opc != 2);
                                    }
                                } while (num > alunos.size());
                            
                                System.out.println("Informações atualizadas!");
                                professores.get(num+1).status();
                            break;
                        }
                    } else {
                        System.out.println("Você não possui autorização para fazer modificações nas informações de outros usuários.");
                    }

                    break;
            }

            if (opc != 1 && opc != 2 && opc != 3) {
                System.out.println("Opcao invalida, por favor digite o numero correspondente a uma das opções abaixo:");
                menu();
                opc = in.nextInt();
            } else {
                System.out.println("O que você deseja fazer agora?");
                menu();
                opc = in.nextInt();
            }

        } while (opc != 0);
    }

    public static void menu() {
        System.out.println("1 - Responder pesquisa.");
        System.out.println("2 - Ver informações.");
        System.out.println("3 - Alterar informações de uma pessoa cadastrada.");
        System.out.println("0 - Sair");
        System.out.print("Opcão: ");
    }
}
