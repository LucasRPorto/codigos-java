import funcionarios.Diretor;
import funcionarios.Funcionario;
import funcionarios.Gerente;

public class TesteFuncionario {
    public static void main (String args[]){
        Funcionario lucas = new Funcionario("Lucas", "70229792197", 2713.00);
        Gerente marcos = new Gerente("Marcos", "34987711168", 8000);
        Diretor eva = new Diretor("Eva", "34506330315", 10000);

        ListaFuncionario lista = new ListaFuncionario();

        lista.listaFuncionario(lucas);
        lista.listaFuncionario(marcos);
        lista.listaFuncionario(eva);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registraBonificacao(lucas);
        controleBonificacao.registraBonificacao(marcos);
        controleBonificacao.registraBonificacao(eva);

        System.out.println();

        System.out.println("--------------------------------------------");
        System.out.println("O valor total da bonificação mensal é: " +controleBonificacao.getBonificacaoTotal());
    }
}
