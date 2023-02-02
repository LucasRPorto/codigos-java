package br.com.lucasporto.loja.orcamento;

import lombok.Getter;

import java.math.BigDecimal;

public class Orcamento {
    @Getter
    private BigDecimal valor;
    private String situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }

    public void aplicarDesconto(String situacao){
        BigDecimal valorDesconto = BigDecimal.ZERO;

        if(situacao.equals("ANALISE")){
            System.out.println("Desconto de 10%");
            valorDesconto = new BigDecimal("0.1");
        }
        else if(situacao.equals("APROVADO")){
            System.out.println("Desconto de 5%");
            valorDesconto = new BigDecimal("0.05");
        }
        this.valor = this.valor.subtract(this.valor.multiply(valorDesconto));
    }
}
