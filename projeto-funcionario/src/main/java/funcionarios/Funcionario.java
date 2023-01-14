package funcionarios;

import lombok.Getter;

// Classe abstrata, não posso mais instanciar funcionarios, apenas seus filhos (gerente, diretor...)
public abstract class Funcionario {
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
    //Metodo sem corpo, sem implementações aqui, apenas nos filhos. Os filhos devem ter o método
    public abstract double getBonificacao();
}
