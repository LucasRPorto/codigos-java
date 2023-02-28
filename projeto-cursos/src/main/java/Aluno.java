import lombok.Getter;

public class Aluno extends Pessoa{
    @Getter
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        super.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.matricula;
    }
}
