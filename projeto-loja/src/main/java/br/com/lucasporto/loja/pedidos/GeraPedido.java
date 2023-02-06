package br.com.lucasporto.loja.pedidos;

import br.com.lucasporto.loja.orcamento.Orcamento;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    @Getter
    private String cliente;
    @Getter
    private BigDecimal valorOrcamento;

    public GeraPedido(String cliente, BigDecimal valorOrcamento){
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
    }

}
