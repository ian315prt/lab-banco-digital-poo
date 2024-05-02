package org.bancoDigital.domain;

import org.bancoDigital.domain.Conta;

public interface IConta {
    void sacar(Conta conta, double valor);

    void depositar(Conta remetente, double valor);

    void transferir(Conta remetente, double valor, Conta contaDestino);

    void imprimirExtrato(Conta conta);
}
