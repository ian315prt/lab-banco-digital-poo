package org.bancoDigital.domain;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Banco {
    private String nome;
    private Set<Conta> contas;
}
