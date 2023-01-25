package conta.testcliente;

import conta.cliente.Cliente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TesteList {
    public static void main(String[] args){

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente lucas = new Cliente("Lucas Porto", "70229792197", "Analista de Desenvolvimento", 25);
        Cliente marcos = new Cliente("Marcos Manoel", "34987711168","Policial", 60);
        Cliente fernando = new Cliente("Fernando Silva", "34506330315","Professor", 32);
        Cliente clayton = new Cliente("Clayton Borges", "70642502170","Advogado", 22);

        listaClientes.add(lucas);
        listaClientes.add(marcos);
        listaClientes.add(fernando);
        listaClientes.add(clayton);

        System.out.println("ORDENANDO OS CLIENTES DE ACORDO COM A IDADE");
        System.out.println("--------------------------------------------");
        
        listaClientes.sort((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade()));
        listaClientes.forEach((cliente) -> System.out.println(cliente.getNome()+" - "+cliente.getIdade()));

        System.out.println();
        System.out.println("ORDENANDO OS CLIENTES DE ACORDO COM O NOME");
        System.out.println("--------------------------------------------");

        listaClientes.sort((o1, o2) ->  o1.getNome().compareTo(o2.getNome()));
        listaClientes.forEach((cliente) -> System.out.println(cliente.getNome() +" - " + cliente.getIdade()));

        System.out.println();
        System.out.println("EMBARALHANDO OS CLIENTES ");
        System.out.println("--------------------------------------------");

        Collections.shuffle(listaClientes);
        listaClientes.forEach((cliente -> System.out.println(cliente.getNome() +" - "+ cliente.getIdade())));
    }
}
