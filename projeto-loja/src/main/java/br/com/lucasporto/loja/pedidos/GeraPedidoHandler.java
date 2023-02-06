package br.com.lucasporto.loja.pedidos;

import br.com.lucasporto.loja.orcamento.Orcamento;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedidoHandler {
    GeraPedido pedido;

    // Construtor com injecao de dependencias

    public GeraPedidoHandler(GeraPedido pedido){
        this.pedido = pedido;
        execute(pedido);
    }
    public void execute(@NotNull GeraPedido dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar e-mail dos pedidos");
    }
}
