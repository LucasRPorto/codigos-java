package br.com.lucasporto.loja.impostos;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcula(Orcamento orcamento, Imposto imposto){
        return imposto.calcula(orcamento);
    }
}
