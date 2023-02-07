package br.com.lucasporto.loja.pedidos;

import br.com.lucasporto.loja.orcamento.Orcamento;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    GeraPedido pedido;
    private List<AcaoAposPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposPedido> acoes){
        this.acoes = acoes;
    }
    public void execute(@NotNull GeraPedido dados){

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(),orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
