package br.com.lucasporto.loja.impostos;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    @Override
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
}
