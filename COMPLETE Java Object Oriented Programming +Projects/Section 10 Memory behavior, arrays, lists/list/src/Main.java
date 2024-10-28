import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> list = new ArrayList<String>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        list.remove("Anna");

        System.out.println(list.size());
        for(String x: list){
            System.out.println(x);
        }

        System.out.println("---------------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x: list){
            System.out.println(x);
        }

        System.out.println("--------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("--------------------");
        
    }
}