package funcionarios;

public class Diretor extends Funcionario implements Autenticacao{
    private int senha;

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + 500;
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
