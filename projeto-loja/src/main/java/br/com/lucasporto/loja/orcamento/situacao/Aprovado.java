package br.com.lucasporto.loja.orcamento.situacao;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calculaDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

    public String toString(){
        return "Aprovado";
    }
}
