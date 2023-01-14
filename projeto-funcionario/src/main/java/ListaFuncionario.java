import funcionarios.Funcionario;

public class ListaFuncionario {

    public void listaFuncionario(Funcionario funcionario){
        System.out.println("--------------------------------------------");
        System.out.println("A seguir serão apresentados os dados do Funcionário");
        System.out.println("Nome: "+ funcionario.getNome());
        System.out.println("Cpf: " + funcionario.getCpf());
        System.out.println("Salario: "+ funcionario.getSalario());
        System.out.println("Bonificacao: "+funcionario.getBonificacao());
        System.out.println("--------------------------------------------");
        System.out.println();
    }
}
