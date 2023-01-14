public class main {
    public static void main(String[]args){

        ContaCorrente cc = new ContaCorrente("0001", "45678-9", 200);
        ContaPoupanca cp = new ContaPoupanca("0002", "12345-6", 100);
        cc.depositaValor(100);
        cp.depositaValor(100);
        cc.transfereValor(cp,100);

        System.out.println("O valor da conta cc é: "+cc.getSaldo());
        System.out.println("O valor da conta cp é: "+cp.getSaldo());

        cc.sacaValor(100);
    }
}





/*


String agenciaBradesco = "1445";
    String contaBradesco = "546789-1";
    double saldoBradesco = 400;
    String agenciaCaixa = "1446";
    String contaCaixa = "546739-1";
    double saldoCaixa = 600;

    Conta bradesco = new Conta();
    Conta caixa = new Conta();

    bradesco.conta= contaBradesco;
    bradesco.saldo=saldoBradesco;
    bradesco.agencia=agenciaBradesco;

    caixa.agencia=agenciaCaixa;
    caixa.saldo=saldoCaixa;
    caixa.conta=contaCaixa;

    bradesco.transfereValor(caixa, 40);


 */