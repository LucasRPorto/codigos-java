package conta.teste;

import conta.cliente.Cliente;
import conta.cliente.ValidaCPF;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente lucas = new Cliente("Lucas Porto", "34506330315", "Analista de Desenvolvimento");

        ValidaCPF.imprimeCPF(lucas.getCpf());
    }

}