package br.com.lucasporto.loja.orcamento.situacao;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    public BigDecimal calculaDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

    public String toString(){
        return "Em Análise";
    }

}
