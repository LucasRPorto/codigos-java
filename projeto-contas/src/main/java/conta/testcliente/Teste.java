package conta.testcliente;

import conta.cliente.Cliente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){

        ArrayList listaClientes = new ArrayList();

        Cliente lucas = new Cliente("Lucas Porto", "70229792197", "Analista de Desenvolvimento");
        Cliente marcos = new Cliente("Marcos Manoel", "34987711168","Policial");
        Cliente fernando = new Cliente("Fernando Silva", "34506330315","Professor");
        Cliente maychon = new Cliente("Fernando Silva", "34506330315","Professor");

        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        lista.add(lucas);
        lista.add(marcos);
        lista.add(fernando);
        lista.add(maychon);

        // Percorrendo todos os elementos da lista
        for(Cliente cliente : lista){
            System.out.println(cliente.getNome());
        }

        System.out.println(lista.get(2).equals(lista.get(3)));

        System.out.println(lista.get(2).toString());
    }
}
