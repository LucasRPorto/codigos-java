import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Curso {
    @Getter
    private String nome;
    @Getter
    private Integer carga;
    private List<Aluno> alunos;


    public Curso(String nome, Integer carga, String professor) {
        this.nome = nome;
        this.carga = carga;
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void listaAlunos(){
        alunos.sort((aluno1, aluno2) -> aluno1.getNome().compareTo(aluno2.getNome()));
        alunos.forEach(System.out::println);
    }
    public int qtdAlunos(){
        return this.alunos.size();
    }
}
