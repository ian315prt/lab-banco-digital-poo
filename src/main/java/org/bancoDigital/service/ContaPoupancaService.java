package org.bancoDigital.service;

import org.bancoDigital.domain.*;

public class ContaPoupancaService implements IConta {

    public void sacar(Conta contaParaSaque, double valor) {
        contaParaSaque.setSaldo(contaParaSaque.getSaldo() - valor);
    }

    public void depositar(Conta contaDeposito, double valor) {
        contaDeposito.setSaldo(contaDeposito.getSaldo() + valor);
    }

    public void transferir(Conta remetente,double valor, Conta contaDestino) {
            sacar(remetente, valor);
            depositar(contaDestino, valor);
    }

    public void imprimirExtrato(Conta contaParaImprimirExtrato) {
        System.out.println(String.format("Titular: %s", contaParaImprimirExtrato.getCliente().getNome()));
        System.out.println(String.format("Agencia: %d", contaParaImprimirExtrato.getAgencia()));
        System.out.println(String.format("Numero: %d", contaParaImprimirExtrato.getNumero()));
        System.out.println(String.format("Tipo de Conta: %d", contaParaImprimirExtrato.getTipoDeConta()));
        System.out.println(String.format("Saldo: %.2f", contaParaImprimirExtrato.getSaldo()));
    }
}
