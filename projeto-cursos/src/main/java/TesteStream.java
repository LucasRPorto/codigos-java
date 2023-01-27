import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream {
    public static void main(String[] args) {
        Curso matematica = new Curso("Matemática", 64, "Renato");
        Curso portugues = new Curso("Portugues", 64, "Fernanda");
        Curso biologia = new Curso("Biologia", 32, "Carla");

        Aluno lucas = new Aluno("Lucas Porto", 201618306);
        Aluno cassio = new Aluno("Cassio Gomes", 201618302);
        Aluno leticia = new Aluno("Leticia Alves", 201618304);

        matematica.adicionaAluno(lucas);
        matematica.adicionaAluno(cassio);
        matematica.adicionaAluno(leticia);
        portugues.adicionaAluno(lucas);
        portugues.adicionaAluno(cassio);
        biologia.adicionaAluno(lucas);

        System.out.println("Alunos cadastrados na plataforma");
        matematica.listaAlunos();

        List<Curso> cursos = new ArrayList<>();

        cursos.add(matematica);
        cursos.add(portugues);
        cursos.add(biologia);

        System.out.println();
        System.out.println("Cursos com mais de 2 alunos:");
        cursos.stream()
                .filter(curso -> curso.qtdAlunos()>=2)
                .collect(Collectors.toMap(c -> c.getNome(), c-> c.qtdAlunos()))
                        .forEach((nome,alunos) -> System.out.println(nome + " possui "+alunos+" alunos matriculados"));

        System.out.println();
        System.out.println("Soma da carga total dos cursos de 64h:");
        int somaCarga = cursos.stream()
                .filter(curso -> curso.getCarga() == 64)
                .mapToInt(Curso::getCarga).sum();
        System.out.println(somaCarga);

        System.out.println();
        System.out.println("Se existir algum curso com mais de 2 alunos, liste, caso contrário faça nada");
        cursos.stream()
                .filter(c -> c.qtdAlunos() >=2)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

    }
}
