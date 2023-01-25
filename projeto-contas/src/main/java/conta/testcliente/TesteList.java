package conta.testcliente;

import conta.cliente.Cliente;

import java.util.ArrayList;
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
        listaClientes.sort(new ComparadorIdade());

        for(Cliente list : listaClientes){
            System.out.println(list.getNome()+" - "+list.getIdade());
        }

        System.out.println();


        System.out.println("ORDENANDO OS CLIENTES DE ACORDO COM O NOME");
        System.out.println("--------------------------------------------");
        listaClientes.sort(new ComparadorNome());

        for(Cliente list : listaClientes){
            System.out.println(list.getNome()+" - "+list.getIdade());
        }
    }
}

class ComparadorIdade implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparadorNome implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}