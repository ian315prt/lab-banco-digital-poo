package org.bancoDigital.domain;

import lombok.*;

import java.util.concurrent.ThreadLocalRandom;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;
    protected Cliente cliente;
    protected int tipoDeConta;

    public Conta(Cliente cliente, int tipoDeConta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = ThreadLocalRandom.current().nextInt(10000-1, 99999-9);
        this.cliente = cliente;
        this.tipoDeConta = tipoDeConta;
    }
}
