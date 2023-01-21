package conta.teste;

import conta.cliente.Cliente;

public class TesteEstruturas {
    public static void main(String[] args){

        Cliente[] clientes = new Cliente[3];

        Cliente lucas = new Cliente("Lucas Porto", "70229792197", "Analista de Desenvolvimento");
        Cliente marcos = new Cliente("Marcos Manoel", "34987711168","Policial");
        Cliente fernando = new Cliente("Fernando Silva", "34506330315","Professor");

        clientes[0]= lucas;
        clientes[1] = marcos;
        clientes[2] = fernando;

        System.out.println(clientes[2].getNome());
    }
}
