package org.bancoDigital.domain;

public class ContaCorrente extends Conta {
    private static final int TIPO_DE_CONTA = 2;

    public ContaCorrente(Cliente cliente) {
        super(cliente, TIPO_DE_CONTA);
    }

    public void setSaldo(double valorTransferencia) {
        saldo = valorTransferencia;
    }
}
