package br.com.lucasporto.loja.orcamento.situacao;

public class DomainException extends RuntimeException {
    public DomainException(String mensagem) {
        super(mensagem);
    }
}
