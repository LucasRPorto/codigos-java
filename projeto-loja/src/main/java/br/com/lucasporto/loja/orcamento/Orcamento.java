package br.com.lucasporto.loja.orcamento;

import lombok.Getter;

import java.math.BigDecimal;

public class Orcamento {
    @Getter
    private BigDecimal valor;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }
}
