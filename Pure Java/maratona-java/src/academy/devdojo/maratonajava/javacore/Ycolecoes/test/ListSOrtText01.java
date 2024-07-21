package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSOrtText01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball z");
        Collections.sort(mangas);
        System.out.println(mangas);
    }
}
