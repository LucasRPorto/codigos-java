import lombok.Getter;

public class Conta {

    private String agencia;
    private String conta;
    @Getter
    private double saldo;


    public void depositaValor(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Valor atualizado com sucesso! Saldo atual: " + this.saldo );
    }

    public void sacaValor(double valor){
        if(saldo>=valor){
            this.saldo = this.saldo - valor;
            System.out.println("Saldo atualizado com sucesso! Saldo atual: " + this.saldo);
        }
        else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");
        }
    }

    public void transfereValor(Conta contaParametro, float valor){
        if(this.saldo>=valor){
            contaParametro.saldo += valor;
            this.saldo -= valor;
            System.out.println("Valor de R$ "+valor+ " transferido com sucesso!");
            System.out.println("Saldo atual R$ "+ this.saldo);
        }
        else {
            System.out.println("Ops! Saldo insuficiente!");
        }
    }

}