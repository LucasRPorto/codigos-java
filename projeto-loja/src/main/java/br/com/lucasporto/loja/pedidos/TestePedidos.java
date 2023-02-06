package br.com.lucasporto.loja.pedidos;

import br.com.lucasporto.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedidos {
    public static void main(String[] args) {

        GeraPedido pedido = new GeraPedido("Lucas", new BigDecimal("900"));
        GeraPedidoHandler pedidoHandler = new GeraPedidoHandler(pedido);
    }
}
