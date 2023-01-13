import javax.sound.midi.SysexMessage;

public class TesteFuncionario {
    public static void main (String args[]){
        Funcionario lucas = new Funcionario("Lucas", "70229792197", 2713.00);

        System.out.println("A seguir serão apresentados os dados do Funcionário");
        System.out.println("Nome: "+ lucas.getNome());
        System.out.println("Cpf: " + lucas.getCpf());
        System.out.println("Salario: "+ lucas.getSalario());
        System.out.println("Bonificacao: "+lucas.getBonificacao());
    }
}
