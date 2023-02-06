package br.com.lucasporto.loja.pedidos;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime data;
    Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime data, Orcamento orcamento){
        this.cliente = cliente;
        this.data = data;
        this.orcamento = orcamento;
    }
}
