package br.com.lucasporto.loja.impostos;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public CalculadoraDeImpostos() {
    }

    public BigDecimal calcula(Orcamento orcamento, TipoImposto tipo){
        if(tipo.equals(TipoImposto.ICMS)){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        else if(tipo.equals(TipoImposto.ISS)){
            return orcamento.getValor().multiply(new BigDecimal(0.05));
        }
            return BigDecimal.ZERO;
    }
}
