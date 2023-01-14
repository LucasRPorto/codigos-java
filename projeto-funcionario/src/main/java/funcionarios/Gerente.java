package funcionarios;

import funcionarios.Funcionario;

public class Gerente extends Funcionario implements Autenticacao{
    private int senha;
    public Gerente(String nome, String cpf, double salario, int senha) {

        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {

        return super.getSalario();
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            System.out.println("A senha está correta");
            return true;
        }else {
            System.out.println("A senha está incorreta");
            return false;
        }
    }
}
