package br.com.lucasporto.loja;

import br.com.lucasporto.loja.impostos.CalculadoraDeImpostos;
import br.com.lucasporto.loja.impostos.ISS;
import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println("Imposto = "+ calculadora.calcula(orcamento, new ISS()));

        orcamento.aplicarDesconto();
        System.out.println("Situação atual: "+ orcamento.getSituacao()+ " Valor: "+ orcamento.getValor());

        orcamento.aprovar();
        orcamento.aplicarDesconto();
        System.out.println("Situação atual: "+ orcamento.getSituacao()+ " Valor: "+ orcamento.getValor());

        orcamento.reprovar();
        orcamento.aplicarDesconto();
        System.out.println("Situação atual: "+ orcamento.getSituacao()+ " Valor: "+ orcamento.getValor());
    }
}
