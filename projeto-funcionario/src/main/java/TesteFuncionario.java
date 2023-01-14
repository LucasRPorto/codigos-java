import javax.sound.midi.SysexMessage;

public class TesteFuncionario {
    public static void main (String args[]){
        Funcionario lucas = new Funcionario("Lucas", "70229792197", 2713.00);
        Gerente marcos = new Gerente("Marcos", "34987711168", 8000);
        Diretor eva = new Diretor("Eva", "34506330315", 10000);

        System.out.println("--------------------------------------------");
        System.out.println("A seguir serão apresentados os dados do Funcionário");
        System.out.println("Nome: "+ lucas.getNome());
        System.out.println("Cpf: " + lucas.getCpf());
        System.out.println("Salario: "+ lucas.getSalario());
        System.out.println("Bonificacao: "+lucas.getBonificacao());
        System.out.println("--------------------------------------------");

        System.out.println();

        System.out.println("--------------------------------------------");
        System.out.println("A seguir serão apresentados os dados do Gerente");
        System.out.println("Nome: "+ marcos.getNome());
        System.out.println("Cpf: " + marcos.getCpf());
        System.out.println("Salario: "+ marcos.getSalario());
        System.out.println("Bonificacao: "+ marcos.getBonificacao());
        System.out.println("--------------------------------------------");

        System.out.println();

        System.out.println("--------------------------------------------");
        System.out.println("A seguir serão apresentados os dados do Diretor");
        System.out.println("Nome: "+ eva.getNome());
        System.out.println("Cpf: " + eva.getCpf());
        System.out.println("Salario: "+ eva.getSalario());
        System.out.println("Bonificacao: "+eva.getBonificacao());
        System.out.println("--------------------------------------------");

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registraBonificacao(lucas);
        controleBonificacao.registraBonificacao(marcos);
        controleBonificacao.registraBonificacao(eva);

        System.out.println();

        System.out.println("--------------------------------------------");
        System.out.println("O valor total da bonificação mensal é: " +controleBonificacao.getBonificacaoTotal());
    }
}
