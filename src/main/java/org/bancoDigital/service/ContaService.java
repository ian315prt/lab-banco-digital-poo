package org.bancoDigital.service;

import org.bancoDigital.domain.Conta;

public class ContaService {
    private ContaCorrenteService contaCorrenteService = new ContaCorrenteService();
    private ContaPoupancaService contaPoupancaService = new ContaPoupancaService();

    public void deposito(Conta contaDeposito, double valor){
        if(contaDeposito.getTipoDeConta() == 1)
            contaPoupancaService.depositar(contaDeposito, valor);

        if(contaDeposito.getTipoDeConta() == 2)
            contaCorrenteService.depositar(contaDeposito, valor);
    }

    public void saque(Conta contaParaSaque, double valor){
        if(contaParaSaque.getTipoDeConta() == 1)
            contaPoupancaService.sacar(contaParaSaque, valor);

        if(contaParaSaque.getTipoDeConta() == 2)
            contaCorrenteService.sacar(contaParaSaque, valor);
    }

    public void realizarTransferencia(int tipoDeConta, Conta contaPoupancaVenilton, Conta contaCorrenteVenilton) {
        //seria possivel fazer um CASE aqui para cada tipo de conta
        if(tipoDeConta == 1)
            contaPoupancaService.transferir(contaPoupancaVenilton, 100, contaCorrenteVenilton);

        if (tipoDeConta == 2)
            contaCorrenteService.transferir(contaCorrenteVenilton, 100, contaPoupancaVenilton);

        if(tipoDeConta != 1 && tipoDeConta != 2)
            System.out.println("Desculpe mas esse tipo de conta nao existe, a transferencia nao pode ser realizada");
    }


    public void imprimirExtratoPorTipoDeConta(Conta contaParaImprimirExtrato) {
        if(contaParaImprimirExtrato.getTipoDeConta() == 1)
            contaPoupancaService.imprimirExtrato(contaParaImprimirExtrato);

        if (contaParaImprimirExtrato.getTipoDeConta() == 2)
            contaPoupancaService.imprimirExtrato(contaParaImprimirExtrato);
    }
}
