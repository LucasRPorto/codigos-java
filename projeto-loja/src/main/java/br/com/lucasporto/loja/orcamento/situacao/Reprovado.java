package br.com.lucasporto.loja.orcamento.situacao;

import br.com.lucasporto.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

    public String toString(){
        return "Reprovado";
    }
}
