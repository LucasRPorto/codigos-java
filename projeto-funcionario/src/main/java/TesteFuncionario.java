import funcionarios.Diretor;
import funcionarios.Funcionario;
import funcionarios.Gerente;
import funcionarios.MinhaException;

public class TesteFuncionario {
    public static void main (String args[]){
/*        Funcionario lucas = new Gerente("Lucas", "70229792197", 2713.00);
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
        System.out.println("O valor total da bonificação mensal é: " +controleBonificacao.getBonificacaoTotal());*/

        System.out.println("Inicio do main");
        Gerente lucas = new Gerente("Lucas", "70229792197", 2713.00, 3232);
        lucas.autentica(3030);

        metodo1();

        System.out.println("Fim do main");
    }

    public static void metodo1(){
        System.out.println("Iniciando metodo 1");
        try{
            metodo2();
        } catch (ArithmeticException | NullPointerException | MinhaException ex ){
            System.out.println("Exception:  " + ex.getMessage());
        }

        System.out.println("Fim do método 1");
    }

    public static void metodo2(){
        System.out.println("Iniciando método 2");

        for (int i = 0; i<5 ; i++){

            if(i==4){
                throw new MinhaException("O contador alcançou o número 4");
            }

            System.out.println("Esse é o valor do número calculado: " + i);

        }
        System.out.println("Fim do metodo 2");
    }
}
