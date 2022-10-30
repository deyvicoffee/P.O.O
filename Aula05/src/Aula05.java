package com.mycompany.aula05;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        
        System.out.println("\t ---- BANCO ASGARD ----");
        System.out.println("Seja bem vindo(a) ao banco de Asgard \n");
        System.out.println("Escolha uma das opções abaixo para continuar:");
        menu();

        Scanner in = new Scanner(System.in);

        int opcao = in.nextInt();

        do {
            while (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 && opcao != 6 && opcao != 7) {
                System.out.println("\nValor inválido! Insira um dos números das opções abaixo:");
                menu();
                opcao = in.nextInt();
            }
            System.out.println("\n");
            in.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("--CRIAR CONTA--");
                    System.out.println("Tipo da conta:");
                    System.out.print("Digite cc para conta corrente e cp para conta poupança: ");

                    String tipoConta = in.nextLine();

                    while (!"cc".equals(tipoConta) && !"cp".equals(tipoConta)) {
                        System.out.println("\nTipo inválido, por favor tente novamente.");
                        System.out.print("Tipo da conta: ");
                        tipoConta = in.nextLine();
                    }
                    conta.setTipoConta(tipoConta);

                    System.out.print("\nNumero da conta: ");
                    String numConta = in.nextLine();
                    conta.setNumConta(numConta);

                    System.out.print("\nProprietário(a): ");
                    String resp = in.nextLine();
                    conta.setProprietario(resp);
                    
                    conta.novaContaCriada();

                    conta.infoGerais();
                break;
                
                case 2:
                    System.out.println("--ABRIR CONTA--");
                    conta.abrirConta();
                break;
                
                case 3:
                    System.out.println("--FECHAR CONTA--");
                    conta.fecharConta();
                break;
                
                case 4:
                    System.out.println("--DEPÓSITO--");
                    if (conta.getProprietario() == null && conta.getNumConta() == null) {
                        System.out.println("Você ainda não possui nenhuma conta para depositar.\n");
                    } 
                    else if (conta.getStatus() == false){
                        System.out.println("Não é possível fazer essa operação pois sua conta está fechada.\n");
                    } 
                    else {
                        System.out.print("Digite o valor do depósito: ");
                        float deposito = in.nextFloat();
                        conta.depositar(deposito);
                    }
                break;
                
                case 5:
                    System.out.println("--SAQUE--");
                    if (conta.getProprietario() == null && conta.getNumConta() == null) {
                        System.out.println("Você ainda não possui nenhuma conta para efetuar o saque.\n");
                    } 
                    else if (conta.getStatus() == false){
                        System.out.println("Não é possível fazer essa operação pois sua conta está fechada.\n");
                    } 
                    else {
                        System.out.print("Digite o valor do saque: ");
                        float saque = in.nextFloat();
                        conta.sacar(saque);
                    }
                break;
                
                case 6:
                    System.out.println("--PAGAR MENSALIDADE--");
                    conta.pagarMensalidade();
                break;
                
                
                case 7:
                    conta.infoGerais();
                break;
            }
            
            if(opcao != 0){
                System.out.println("O que você deseja fazer agora?");
                menu();
                opcao = in.nextInt();
            }

        }while (opcao != 0);
        
        System.out.println("Até logo!\n");

    }

    public static void menu() {
        System.out.println("1. Criar conta.");
        System.out.println("2. Abrir conta.");
        System.out.println("3. Fechar conta.");
        System.out.println("4. Fazer depósito.");
        System.out.println("5. Fazer saque.");
        System.out.println("6. Pagar mensalidade.");
        System.out.println("7. Informações gerais.");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }
}
