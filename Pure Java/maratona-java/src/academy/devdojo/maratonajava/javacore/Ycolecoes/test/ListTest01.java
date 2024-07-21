package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Willian");
        nomes.add("devdojo Academy");
        nomes2.add("Suane");
        nomes2.add("Academy");
        nomes.addAll(nomes2);
        System.out.println(nomes);
        for(String nome: nomes){
            System.out.println(nome);
//            nomes.add("Suane");
        }

        int size = nomes.size();

        System.out.println("---------------");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
