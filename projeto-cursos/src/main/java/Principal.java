import java.util.ArrayList;
import java.util.List;

public class Principal {
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
        cursos.stream().filter(curso -> curso.qtdAlunos()>=2).forEach(curso -> System.out.println(curso.getNome()));

        System.out.println();
        System.out.println("Soma da carga total dos cursos de 64h:");
        int somaCarga = cursos.stream().filter(curso -> curso.getCarga() == 64).mapToInt(Curso::getCarga).sum();
        System.out.println(somaCarga);
    }
}
