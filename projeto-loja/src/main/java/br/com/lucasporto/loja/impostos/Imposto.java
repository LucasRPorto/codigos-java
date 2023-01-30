package br.com.lucasporto.loja.impostos;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcula(Orcamento orcamento);
}
