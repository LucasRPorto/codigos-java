import lombok.Getter;

public class Aluno{
    @Getter
    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}
