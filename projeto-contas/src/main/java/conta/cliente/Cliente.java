package conta.cliente;


import lombok.Getter;

public class Cliente {

    @Getter
    private String nome;
    @Getter
    private String cpf;
    private String profissao;


    public Cliente(String nome, String cpf, String profissao){
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    @Override
    public boolean equals(Object obj) {
        Cliente cliente = (Cliente) obj;
        return ((this.nome == cliente.getNome()) && (this.cpf == cliente.getCpf()) && (this.profissao == cliente.profissao));
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.cpf;
    }
}
