package org.bancoDigital.domain;

import java.util.List;
import java.util.Set;

public class Banco {
    private String nome;
    private Set<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public void setContas(Set<Conta> contas) {
        this.contas = contas;
    }
}
