import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Alunos> lista = new HashSet<>();
        entrada("How many students for course A: ", lista, sc);
        entrada("How many students for course B: ", lista, sc);
        entrada("How many students for course C: ", lista, sc);
        System.out.println("Total students: " + lista.size());

        sc.close();
    }

    public static void entrada(String pergunta, Set<Alunos> lista,Scanner sc ){
        System.out.print(pergunta);
        int n = sc.nextInt();

        while(n != 0){
            int id = sc.nextInt();
            Alunos aluno = new Alunos(id);
            lista.add(aluno);
            n-=1;
        }


    }
}