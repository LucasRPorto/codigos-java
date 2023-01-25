package conta.testcliente;

import conta.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args){

        ArrayList listaClientes = new ArrayList();

        Cliente lucas = new Cliente("Lucas Porto", "70229792197", "Analista de Desenvolvimento",60);
        Cliente marcos = new Cliente("Marcos Manoel", "34987711168","Policial",45);
        Cliente fernando = new Cliente("Fernando Silva", "34506330315","Professor",32);
        Cliente maychon = new Cliente("Fernando Silva", "34506330315","Professor",22);

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

        ArrayList<Integer> list = new ArrayList<Integer>();

        Integer numero = 54;

        list.add(15);
        list.add(14);

        System.out.println(list.get(0).doubleValue());
        System.out.println(numero);
    }
}
