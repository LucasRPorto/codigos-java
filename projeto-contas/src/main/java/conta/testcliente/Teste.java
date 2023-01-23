package conta.testcliente;

import conta.cliente.Cliente;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){

        ArrayList listaClientes = new ArrayList();

        Cliente lucas = new Cliente("Lucas Porto", "70229792197", "Analista de Desenvolvimento");
        Cliente marcos = new Cliente("Marcos Manoel", "34987711168","Policial");
        Cliente fernando = new Cliente("Fernando Silva", "34506330315","Professor");

        listaClientes.add(lucas);
        listaClientes.add(marcos);
        listaClientes.add(fernando);


        System.out.println(listaClientes.size());
    }
}
