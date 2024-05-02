package org.bancoDigital.domain;

public class ContaPoupanca extends Conta{
    private static final int TIPO_DE_CONTA = 1;

    public ContaPoupanca(Cliente cliente) {
        super(cliente, TIPO_DE_CONTA);
    }
}
