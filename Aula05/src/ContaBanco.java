package com.mycompany.aula05;

public class ContaBanco {

    protected String tipoConta;
    public String numConta;
    private String proprietario;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public void setTipoConta(String tipo) {
        if ("cc".equals(tipo)) {
            this.tipoConta = "Conta Corrente";
        } else {
            this.tipoConta = "Conta Poupança";
        }
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNumConta() {
        return this.numConta;
    }

    public void setProprietario(String prop) {
        this.proprietario = prop;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void abrirConta() {
        if (this.getProprietario() == null && this.getNumConta() == null) {
            System.out.println("Você não possui nenhuma conta criada para realizar essa operação.\n");
        } else {
            if (this.getStatus() == true) {
                System.out.println("Sua conta já está aberta.\n");
            } else {
                this.setStatus(true);
                System.out.println("Conta aberta e pronta para o uso!\n");
            }
        }
    }

    public void fecharConta() {
        if (this.getProprietario() == null && this.getNumConta() == null) {
            System.out.println("Você não possui nenhuma conta criada para realizar essa operação.\n");
        } else {
            if (this.getSaldo() == 0) {
                if (this.getStatus() == false) {
                    System.out.println("Sua conta já está fechada.\n");
                } else {
                    this.setStatus(false);
                    System.out.println("Conta fechada com sucesso! Para volta a usar os recursos não se esqueça de reabri-la.\n");
                }
            } else {
                System.out.println("Você não pode fechar essa conta pois você possui R$" + this.getSaldo() + " nela.");
                System.out.println("Retire todo o valor antes de fazer esta operação.\n");
            }
        }
    }

    public void sacar(float valorSaque) {
        float valorAtual = this.getSaldo();

        if (valorAtual < valorSaque) {
            System.out.println("Você não tem esse valor disponível para saque.\n");
        } else {
            valorAtual = valorAtual - valorSaque;
            this.setSaldo(valorAtual);

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: R$" + this.getSaldo() + "\n");
        }
    }

    public void depositar(float valorDeposito) {
        this.setSaldo(this.getSaldo() + valorDeposito);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: R$" + this.getSaldo() + "\n");
    }

    public void pagarMensalidade() {
        if (this.getProprietario() == null && this.getNumConta() == null) {
            System.out.println("Você ainda não possui nenhuma conta criada.\n");
        } 
        else if (this.getStatus() == false) {
            System.out.println("Não é possível fazer essa operação pois sua conta está fechada.\n");
        }
        else if ("Conta Corrente".equals(this.getTipoConta())) {
            if (this.getSaldo() < 12) {
                System.out.println("Não foi possível pagar a mensalidade pois você não tem saldo suficiente.\n");
            } else {
                this.setSaldo(this.getSaldo() - 12);
                System.out.println("Mensalidade paga com sucesso!\n");
            }
        } else {
            if (this.getSaldo() < 20) {
                System.out.println("Não foi possível pagar a mensalidade pois você não tem saldo suficiente.\n");
            } else {
                this.setSaldo(this.getSaldo() - 20);
                System.out.println("Mensalidade paga com sucesso!\n");
            }
        }
    }

    public void novaContaCriada() {
        if ("Conta Corrente".equals(this.getTipoConta())) {
            this.setSaldo(this.getSaldo() + 50);
            System.out.println("\nConta criada com sucesso!");
            System.out.println("Parabéns! Você ganhou R$50,00 por abrir uma Conta Corrente.\n");
        } else {
            this.setSaldo(this.getSaldo() + 150);
            System.out.println("\nConta criada com sucesso!");
            System.out.println("Parabéns! Você ganhou R$150,00 por abrir uma Conta Poupança.\n");
        }
    }

    public void infoGerais() {
        if (this.getProprietario() == null && this.getNumConta() == null) {
            System.out.println("Você ainda não possui nenhuma conta criada.\n");
        } else {
            System.out.println("\t --- Informações da conta ---\n");
            System.out.println("Proprietario(a): " + this.getProprietario());
            System.out.println("Número da conta: " + this.getNumConta());
            System.out.println("Tipo da conta: " + this.getTipoConta());
            System.out.println("Saldo: R$" + this.getSaldo());
            if (this.getStatus()) {
                System.out.println("Status: Conta aberta");
            } else {
                System.out.println("Status: Conta fechada");
            }
            System.out.println("\t\t -------------- \n");
        }

    }
}
