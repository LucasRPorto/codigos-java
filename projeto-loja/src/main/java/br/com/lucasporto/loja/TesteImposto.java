package br.com.lucasporto.loja;

import br.com.lucasporto.loja.impostos.CalculadoraDeImpostos;
import br.com.lucasporto.loja.impostos.TipoImposto;
import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println("Imposto = "+ calculadora.calcula(orcamento, TipoImposto.ICMS));
    }
}
