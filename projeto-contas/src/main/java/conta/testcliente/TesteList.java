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

        Comparador comparador = new Comparador();

        System.out.println("ORDENANDO OS CLIENTES DE ACORDO COM A IDADE");
        System.out.println("--------------------------------------------");
        listaClientes.sort(comparador);

        for(Cliente list : listaClientes){
            System.out.println(list.getNome()+" - "+list.getIdade());
        }
    }
}

class Comparador implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
        if(o1.getIdade() < o2.getIdade()){
            return -1;
        }
        else if(o1.getIdade() > o2.getIdade()){
            return 1;
        }
        return 0;
    }
}