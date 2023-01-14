package funcionarios;

import funcionarios.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}
