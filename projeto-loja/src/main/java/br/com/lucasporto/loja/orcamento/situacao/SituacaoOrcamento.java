package br.com.lucasporto.loja.orcamento.situacao;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calculaDesconto(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento nao pode ser finalizado");
    }

}
