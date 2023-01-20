package conta.teste;

import conta.modelo.SaldoInsuficienteException;
import conta.modelo.ContaCorrente;
import conta.modelo.ContaPoupanca;
import conta.modelo.HorarioExcedidoException;

public class main {
    public static void main(String[]args){

        ContaCorrente cc = new ContaCorrente("0001", "45678-9", 200);
        ContaPoupanca cp = new ContaPoupanca("0002", "12345-6", 100);

        try{
            cc.sacaValor(100);
        }catch (SaldoInsuficienteException | HorarioExcedidoException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("O código continuou após a exception");

        String nome = "LucAaAs";
        nome = nome.replace("A", "a");
        System.out.println("Nome após replace: "+nome);

        println("Lucas");
        println(cc);
        println(cp);
        println(4);

    }

    public static void println(Object obj){

        System.out.println(obj.toString());
    }
}





/*


String agenciaBradesco = "1445";
    String contaBradesco = "546789-1";
    double saldoBradesco = 400;
    String agenciaCaixa = "1446";
    String contaCaixa = "546739-1";
    double saldoCaixa = 600;

    modelo.Conta bradesco = new modelo.Conta();
    modelo.Conta caixa = new modelo.Conta();

    bradesco.conta= contaBradesco;
    bradesco.saldo=saldoBradesco;
    bradesco.agencia=agenciaBradesco;

    caixa.agencia=agenciaCaixa;
    caixa.saldo=saldoCaixa;
    caixa.conta=contaCaixa;

    bradesco.transfereValor(caixa, 40);


 */