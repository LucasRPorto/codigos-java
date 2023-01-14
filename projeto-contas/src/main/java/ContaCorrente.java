public class ContaCorrente extends Conta{

    private double taxaSaca = 0.2;
    public ContaCorrente(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
    }

    @Override
    public void sacaValor(double valor) {
        super.sacaValor(valor + this.taxaSaca);
    }
}
