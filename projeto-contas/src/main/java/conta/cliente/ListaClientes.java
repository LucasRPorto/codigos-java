package conta.cliente;

import conta.cliente.Cliente;
import conta.modelo.Conta;

public class ListaClientes {

    private Cliente[] listaClientes;
    private int posicaoLivre;

    public ListaClientes(){
        this.listaClientes = new Cliente[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Cliente cliente){
        listaClientes[posicaoLivre]=cliente;
        posicaoLivre++;
    }

    public int getQuantidadeClientes(){
        return posicaoLivre;
    }

    public Cliente getCliente(int pos){
        if(pos >= posicaoLivre){
            throw new PosicaoListaClienteInvalida("Posição informada não preenchida em lista Clientes");
        }
            return this.listaClientes[pos];
    }
}
