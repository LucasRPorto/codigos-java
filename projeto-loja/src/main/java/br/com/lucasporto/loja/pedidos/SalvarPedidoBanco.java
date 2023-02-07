package br.com.lucasporto.loja.pedidos;

// exemplo de observer, listener

public class SalvarPedidoBanco implements AcaoAposPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no banco");
    }
}
