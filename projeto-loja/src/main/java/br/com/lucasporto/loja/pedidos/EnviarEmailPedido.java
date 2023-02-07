package br.com.lucasporto.loja.pedidos;

// exemplo de observer, listener

public class EnviarEmailPedido implements AcaoAposPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar e-mail dos pedidos");
    }
}
