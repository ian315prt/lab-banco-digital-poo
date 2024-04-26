package org.bancoDigital.domain;

public class ContaPoupanca extends Conta{
    private static int tipoDeConta = 2;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public static int getTipoDeConta() {
        return tipoDeConta;
    }

    public static void setTipoDeConta(int tipoDeConta) {
        ContaPoupanca.tipoDeConta = tipoDeConta;
    }

    public void setSaldo(double valorTransferencia) {
        saldo = valorTransferencia;
    }
}
