import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {

    public static void main(String[] args) {

        List<String> hokages = new ArrayList<>();

        hokages.add("Hashirama");
        hokages.add("Tobirama");
        hokages.add("Hiruzen");
        hokages.add("Minato");
        hokages.add("Tsunade");

        System.out.println("Hokages em ordem crescente - Method Reference");
        hokages.sort(Comparator.comparing(String::valueOf));
        hokages.forEach(System.out::println);

        System.out.println();
        System.out.println("Hokages em ordem decrescente - Lambda");

        hokages.sort((nome1, nome2) -> nome2.compareTo(nome1));
        hokages.forEach((nome) -> System.out.println(nome));

        List<Integer> numeros = new ArrayList<>();

        numeros.add(23);
        numeros.add(61);
        numeros.add(20);
        numeros.add(60);
        numeros.add(25);

        System.out.println();
        System.out.println("Numeros em ordem crescente - Method Reference");
        numeros.sort(Comparator.comparing(Integer::intValue));
        numeros.forEach(System.out::println);

        System.out.println();
        System.out.println("Numeros em ordem decrescente - Lambda");
        numeros.sort((numero1, numero2) -> numero2.compareTo(numero1));
        numeros.forEach(s -> System.out.println(s));
    }
}
