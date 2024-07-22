package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Attack on titan", 19.9, 0));
        mangas.add(new Manga(1L,"Berserk", 9.5, 5));
        mangas.add(new Manga(4L,"Hellsing ultimate", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon ball z", 2.99, 0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }


    }

}
