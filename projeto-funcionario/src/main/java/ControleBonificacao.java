import lombok.Getter;

public class ControleBonificacao {
    @Getter
    private double bonificacaoTotal;

    public void registraBonificacao(Funcionario funcionario){
        this.bonificacaoTotal = this.bonificacaoTotal + funcionario.getBonificacao();
    }
}
