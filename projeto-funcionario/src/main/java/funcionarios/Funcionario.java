package funcionarios;

import lombok.Getter;

public class Funcionario {
    @Getter
    private String nome;
    @Getter
    private String cpf;
    @Getter
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double getBonificacao(){
        return this.salario * 0.1;
    }
}
