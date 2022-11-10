package com.mycompany.aula10;

import java.util.Scanner;
import java.util.Vector;

public class Aula10 {

    public static void main(String[] args) {

        Vector<Aluno> alunos = new Vector<Aluno>();
        Vector<Funcionario> funcionarios = new Vector<Funcionario>();
        Vector<Professor> professores = new Vector<Professor>();
        Scanner in = new Scanner(System.in);
        int idade;
        int num;
        String nome;
        String sexo;

        System.out.println("--- PESQUISA DE OCUPAÇÃO DA POPULAÇÃO BRASILEIRA ---");

        System.out.println("Selecione uma opção: ");
        menu();

        int opcao = in.nextInt();

        System.out.println("");
        
        do {
            switch (opcao) {
                case 1: //RESPONDER PESQUISA
                    int opc = 0;
                    
                    do {
                        System.out.println("Qual é a sua ocupação?");
                        System.out.println("1 - Aluno");
                        System.out.println("2 - Funcionário");
                        System.out.println("3 - Professor");
                        System.out.print("Opção: ");
                        opc = in.nextInt();
                        
                        if (opc != 1 && opc != 2 && opc != 3) {
                            System.out.println("\nOpção inválida! Por favor insira o número corresponde as opções abaixo.\n");
                        }
                    } while (opc != 1 && opc != 2 && opc != 3);
                    
                    in.nextLine();
                    
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
                    if(!alunos.isEmpty()){
                        System.out.println("--- LISTA DE ALUNOS ---");
                        for (int i = 0; i < alunos.size(); i++) {
                            alunos.get(i).status();
                        }
                    }
                    
                    if(!funcionarios.isEmpty()){
                        System.out.println("--- LISTA DE FUNCIONÁRIOS ---");
                        for (int i = 0; i < funcionarios.size(); i++) {
                            funcionarios.get(i).status();
                        }
                    }
                    
                    if(!professores.isEmpty()){
                        System.out.println("--- LISTA DE PROFESSORES ---");
                        for (int i = 0; i < professores.size(); i++) {
                            professores.get(i).status();
                        }
                    }
                break;

                case 3://ALTERAR INFORMAÇÕES
                    Admin adm = new Admin();

                    in.nextLine();
                    System.out.print("Login: ");
                    String login = in.nextLine();

                    System.out.print("Senha: ");
                    String senha = in.nextLine();

                    if (adm.checarLogin(login) && adm.checarSenha(senha)) {
                        System.out.println("\nBem vindo de volta " + adm.getNome() + "!\n");

                        int choice = 0;
                        do {
                            System.out.println("A pessoa que você deseja alterar possui qual ocupação?");
                            System.out.println("1 - Aluno");
                            System.out.println("2 - Funcionário");
                            System.out.println("3 - Professor");
                            System.out.println("0 - Voltar");
                            System.out.print("Opção: ");
                            choice = in.nextInt();

                            if (choice != 0 && choice != 1 && choice != 2 && choice != 3) {
                                System.out.println("\nOpção inválida, vamos tentar de novo?\n");
                            }
                            else if(choice == 1 && alunos.isEmpty()){
                                System.out.println("\nInfelizmente a pesquisa não possui alunos para serem alterados.\n");
                                choice = 0;
                            }
                            else if(choice == 2 && funcionarios.isEmpty()){
                                System.out.println("\nInfelizmente a pesquisa não possui funcionários para serem alterados. Por favor tente novamente.");
                                choice = 0;
                            }
                            else if(choice == 3 && professores.isEmpty()){
                                System.out.println("\nInfelizmente a pesquisa não possui professores para serem alterados. Por favor tente novamente.");
                                choice = 0;
                            }
                            else if(choice == 0){
                                System.out.println("");
                            }
                        } while (choice != 0 && choice != 1 && choice != 2 && choice != 3);

                        switch (choice) {
                            case 1:
                                do {
                                    System.out.println("\nSelecione o número correspondente ao aluno que deseja alterar.\n");

                                    for (int i = 0; i < alunos.size(); i++) {
                                        System.out.println("\t(" + (i + 1) + ")");
                                        alunos.get(i).status();
                                    }

                                    System.out.print("Número: ");
                                    num = in.nextInt();

                                    if (num > alunos.size() || num == 0) {
                                        System.out.print("\nNúmero inválido.");
                                    }
                                    else {
                                        int option = 0;
                                        do {
                                            System.out.println("\nAluno escolhido:");
                                            
                                            alunos.get(num - 1).status();

                                            System.out.println("Quais alterações você deseja fazer?");
                                            System.out.println("1 - Atualizar idade.");
                                            System.out.println("2 - Alterar estado da matrícula");
                                            System.out.print("Opção: ");
                                            option = in.nextInt();

                                            if (option != 1 && option != 2) {
                                                System.out.println("\nOpção inválida.");
                                            } 
                                            else if (option == 1) {
                                                alunos.get(num - 1).fazerAniv();
                                            } 
                                            else if (option == 2) {
                                                int opcion = 0;
                                                do{
                                                    System.out.println("\nQual o novo estado da matricula?");
                                                    System.out.println("1 - Matriculado.");
                                                    System.out.println("2 - Não matriculado.");
                                                    System.out.println("3 - Cancelar matricula.");
                                                    System.out.print("Opção: ");
                                                    opcion = in.nextInt();

                                                    if(opcion != 1 && opcion != 2 && opcion != 3){
                                                        System.out.println("\nOpção inválida.");
                                                    }
                                                    else if (opcion == 1){
                                                        alunos.get(num - 1).setMatriculado(true);
                                                    }
                                                    else if (opcion == 2){
                                                        alunos.get(num - 1).setMatriculado(false);
                                                    }
                                                    else{
                                                        alunos.get(num - 1).cancelarMatr();
                                                    }
                                                }while(opcion != 1 && opcion != 2 && opcion != 3);
                                            }

                                        } while (option != 1 && option != 2);
                                    }
                                } while (num > alunos.size() || num == 0);
                                
                                System.out.println("\nInformações atualizadas!");
                                alunos.get(num - 1).status();
                                
                            break;
                            
                            case 2:
                                do {
                                    System.out.println("Selecione o número correspondente ao funcionario que deseja alterar.\n");

                                    for (int i = 0; i < funcionarios.size(); i++) {
                                        System.out.println("\t(" + (i + 1) + ")");
                                        funcionarios.get(i).status();
                                    }

                                    System.out.print("Número: ");
                                    num = in.nextInt();

                                    if (num > funcionarios.size() || num == 0) {
                                        System.out.println("\nNúmero inválido.");
                                    } else {
                                        int option = 0;
                                        do {
                                            System.out.println("\nFuncionario escolhido:");
                                            funcionarios.get(num - 1).status();
                                            System.out.println("Quais alterações você deseja fazer?");
                                            System.out.println("1 - Atualizar idade.");
                                            System.out.println("2 - Alterar estado do trabalho.");
                                            System.out.print("Opção: ");
                                            option = in.nextInt();

                                            if (option != 1 && option != 2) {
                                                System.out.println("\nOpção inválida.");
                                            } 
                                            else if (option == 1) {
                                                funcionarios.get(num - 1).fazerAniv();
                                            } 
                                            else if (option == 2) {
                                                funcionarios.get(num - 1).mudarTrabalho();
                                            }

                                        } while (option != 1 && option != 2);
                                    }
                                } while (num > funcionarios.size() || num == 0);
                            
                                System.out.println("\nInformações atualizadas!");
                                funcionarios.get(num - 1).status();
                            break;
                            
                            case 3:
                                do {
                                    System.out.println("Selecione o número correspondente ao professor que deseja alterar.\n");

                                    for (int i = 0; i < professores.size(); i++) {
                                        System.out.println("\t(" + (i + 1) + ")");
                                        professores.get(i).status();
                                    }

                                    System.out.print("Número: ");
                                    num = in.nextInt();
                                    System.out.println("");
                                    if (num > professores.size() || num == 0) {
                                        System.out.println("Número inválido.");
                                    } else {
                                        int option = 0;
                                        do {
                                            System.out.println("\nProfessor escolhido:");
                                            professores.get(num - 1).status();
                                            System.out.println("Quais alterações você deseja fazer?");
                                            System.out.println("1 - Atualizar idade.");
                                            System.out.println("2 - Informar aumento de salário.");
                                            System.out.print("Opção: ");
                                            option = in.nextInt();

                                            if (option != 1 && option != 2) {
                                                System.out.println("\nOpção inválida.");
                                            } 
                                            else if (option == 1) {
                                                professores.get(num - 1).fazerAniv();
                                            } 
                                            else if (option == 2) {
                                                System.out.print("\nValor do aumento: ");
                                                float aumento = in.nextFloat();
                                                professores.get(num - 1).receberAum(aumento);
                                            }

                                        } while (option != 1 && option != 2);
                                    }
                                } while (num > professores.size() || num == 0);
                            
                                System.out.println("\nInformações atualizadas!");
                                professores.get(num - 1).status();
                            break;
                        }
                    } else {
                        System.out.println("\nVocê não possui autorização para fazer modificações nas informações de outros usuários.\n");
                    }

                break;
            }

            if (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Opcao invalida, por favor digite o numero correspondente a uma das opções abaixo:");
                menu();
                opcao = in.nextInt();
                System.out.println("");
            } else {
                System.out.println("O que você deseja fazer agora?");
                menu();
                opcao = in.nextInt();
                System.out.println("");
            }

        } while (opcao != 0);
        
        System.out.println("Dados enviados.\n");
        
        System.out.println("Obrigado por partipar desta pesquisa!");
        
        alunos.clear();
        funcionarios.clear();
        professores.clear();   
    }

    public static void menu() {
        System.out.println("1 - Responder pesquisa.");
        System.out.println("2 - Ver informações.");
        System.out.println("3 - Alterar informações de uma pessoa cadastrada.");
        System.out.println("0 - Sair");
        System.out.print("Opcão: ");
    }
}
