package conta.teste;

import conta.cliente.Cliente;
import conta.cliente.ListaClientes;
import conta.cliente.PosicaoListaClienteInvalida;

public class TesteEstruturas {
    public static void main(String[] args){

        Cliente[] clientes = new Cliente[3];

        Cliente lucas = new Cliente("Lucas Porto", "70229792197", "Analista de Desenvolvimento",25);
        Cliente marcos = new Cliente("Marcos Manoel", "34987711168","Policial",60);
        Cliente fernando = new Cliente("Fernando Silva", "34506330315","Professor",32);

        ListaClientes listaClientes = new ListaClientes();

        listaClientes.adiciona(lucas);
        listaClientes.adiciona(marcos);
        listaClientes.adiciona(fernando);

        try{
            String nomeCliente = listaClientes.getCliente(1).getNome();
            System.out.println(nomeCliente);
        }catch (PosicaoListaClienteInvalida ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        testeCatch();
        System.out.println("Quantidade de Clientes Cadastrados: "+listaClientes.getQuantidadeClientes());
    }

    public static void testeCatch(){
        System.out.println("Lista Continuou Após Listagem");
    }
}
