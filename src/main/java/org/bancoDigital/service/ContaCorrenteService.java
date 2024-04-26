package org.bancoDigital.service;

import org.bancoDigital.domain.Conta;
import org.bancoDigital.domain.ContaCorrente;
import org.bancoDigital.domain.IConta;

public class ContaCorrenteService implements IConta {

    private ContaCorrente contaCorrente;

    public void sacar(double valor) {
        contaCorrente.setSaldo(valor);
    }

    public void depositar(double valor) {

    }

    public void transferir(double valor, Conta contaDestino) {

    }

    public void imprimirExtrato() {

    }

    public void imprimirInfosComuns() {

    }
}
