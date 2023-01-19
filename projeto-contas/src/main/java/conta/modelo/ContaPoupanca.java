package conta.modelo;

public class ContaPoupanca extends Conta {

    private double taxaSaca = 0.1;
    public ContaPoupanca(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
    }

    @Override
    public void sacaValor(double valor) throws HorarioExcedidoException {
            super.sacaValor(valor + this.taxaSaca);
    }
}
