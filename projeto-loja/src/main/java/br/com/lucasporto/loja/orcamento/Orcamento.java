package br.com.lucasporto.loja.orcamento;

import br.com.lucasporto.loja.orcamento.situacao.EmAnalise;
import br.com.lucasporto.loja.orcamento.situacao.SituacaoOrcamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Orcamento {
    @Getter
    private BigDecimal valor;
    @Getter
    @Setter
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
        this.situacao = new EmAnalise();
    }

    public void aplicarDesconto(){
        BigDecimal valorDesconto = this.situacao.calculaDesconto(this);
        this.valor = this.valor.subtract(valorDesconto);
    }

    public void aprovar(){
        System.out.println("Aprovando situação");
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        System.out.println("Reprovando situação");
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        System.out.println("Finalizando situação");
        this.situacao.finalizar(this);
    }

}
