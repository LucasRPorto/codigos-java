import funcionarios.Autenticacao;

public class Cliente implements Autenticacao {
    private int senha;

    public Cliente(int senha){
        this.senha = senha;
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
