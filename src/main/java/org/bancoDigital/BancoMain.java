package org.bancoDigital;

import org.bancoDigital.domain.Cliente;
import org.bancoDigital.domain.Conta;
import org.bancoDigital.domain.ContaCorrente;
import org.bancoDigital.domain.ContaPoupanca;
import org.bancoDigital.service.ContaService;

//import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Cliente venilton = new Cliente("Venilton");
        Conta contaPoupancaVenilton = new ContaPoupanca(venilton);
        Conta contaCorrenteVenilton = new ContaCorrente(venilton);

        ContaService contaService = new ContaService();

        //Caso seja uma aplicacao real deveria ser verificado do banco o tipo de conta cadastrado para o cliente,
        // caso nao haja algum dos dois tipo jgoar uma excessao.

        System.out.println("Quanto deseja depositar?");
        contaService.deposito(contaPoupancaVenilton, 100);
        System.out.println("Quanto deseja depositar?");
        contaService.deposito(contaCorrenteVenilton, 100);

        System.out.println("Digite o valor para saque");
        contaService.saque(contaPoupancaVenilton, 50);
        System.out.println("Digite o valor para saque");
        contaService.saque(contaCorrenteVenilton, 70);

        System.out.println("De qual conta o Sr(a). deseja enviar, digite 1 para conta poupanca e 2 para conta corrente");

        // deixando com valores pre definidos para facilitar os testes, mas nesse caso so deveria trocar para sc,nextInt
        // ou double dependendo da variavel.
        contaService.realizarTransferencia(1, contaPoupancaVenilton, contaCorrenteVenilton);
        contaService.realizarTransferencia(2, contaPoupancaVenilton, contaCorrenteVenilton);


        contaService.imprimirExtratoPorTipoDeConta(contaPoupancaVenilton);
        System.out.println("\n");
        contaService.imprimirExtratoPorTipoDeConta(contaCorrenteVenilton);
    }
}