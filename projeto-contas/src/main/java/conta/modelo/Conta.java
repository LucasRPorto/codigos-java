package conta.modelo;

/**
 * @author Lucas
 * Classe utilizada para representar a entidade conta. Todas novas contas devem estar a presente classe.
 * A classe implementa os métodos de saque, depósito e transferência.
 */

import lombok.Getter;
import java.util.Calendar;

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

    /**
     *
     * Necessário que o horário de saque esteja entre 07h e 20h
     * Necessário que o valor para saque seja menor ou igual que o valor disponível na conta;
     */
    public void sacaValor(double valor) throws HorarioExcedidoException {

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hora do dia: " + hora);

        if(saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transação! ");
        }
        else if(hora <= 7 || hora >= 20){
            throw new HorarioExcedidoException("Horário de transação excedido!");
        }
            this.saldo -= valor;
            System.out.println("Saldo atualizado com sucesso! Saldo atual: " + this.saldo);
    }

    public void transfereValor(Conta contaParametro, float valor) throws HorarioExcedidoException{
        this.sacaValor(valor);
        contaParametro.depositaValor(valor);
        System.out.println("Valor de R$ "+valor+ " transferido com sucesso!");
        System.out.println("Saldo atual R$ "+ this.saldo);
    }
}
