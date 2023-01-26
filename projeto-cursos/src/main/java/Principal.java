public class Principal {
    public static void main(String[] args) {
        Curso matematica = new Curso("Matemática", 64, "Renato");

        Aluno lucas = new Aluno("Lucas Porto", 201618306);
        Aluno cassio = new Aluno("Cassio Gomes", 201618302);
        Aluno leticia = new Aluno("Leticia Alves", 201618304);

        matematica.adicionaAluno(lucas);
        matematica.adicionaAluno(cassio);
        matematica.adicionaAluno(leticia);

        matematica.listaAlunos();
    }
}
