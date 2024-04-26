package org.bancoDigital.domain;

public class ContaCorrente extends Conta {
    private static int tipoDeConta = 2;

    public ContaCorrente(Cliente cliente, Conta conta) {
        super(cliente);
    }

    public static int getTipoDeConta() {
        return tipoDeConta;
    }

    public void setSaldo(double valorTransferencia) {
        saldo = valorTransferencia;
    }
}
