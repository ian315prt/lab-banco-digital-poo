package org.bancoDigital.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;
    protected Cliente cliente;
    protected int tipoDeConta;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = ThreadLocalRandom.current().nextInt(10000-1, 99999-9);
        this.cliente = cliente;
    }

    public Conta(Cliente cliente, int tipoDeConta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = ThreadLocalRandom.current().nextInt(10000-1, 99999-9);
        this.cliente = cliente;
        this.tipoDeConta = tipoDeConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getTipoDeConta() {
        return tipoDeConta;
    }

    @Override
    public String toString() {
        return  "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente: " + cliente;
    }
}
