import lombok.Getter;

public class Conta {

    private String agencia;
    private String conta;
    @Getter
    private double saldo;

    public Conta(String agencia, String conta, double saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void depositaValor(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Valor atualizado com sucesso! Saldo atual: " + this.saldo );
    }

    public void sacaValor(double valor){

        if(saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transação! ");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saldo atualizado com sucesso! Saldo atual: " + this.saldo);
        }
    }

    public void transfereValor(Conta contaParametro, float valor){

        this.sacaValor(valor);
        contaParametro.depositaValor(valor);
        System.out.println("Valor de R$ "+valor+ " transferido com sucesso!");
        System.out.println("Saldo atual R$ "+ this.saldo);
    }
}
