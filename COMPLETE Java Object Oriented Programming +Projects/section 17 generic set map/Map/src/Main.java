import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "99771133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("phone number: " + cookies.get("phone"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("size: " + cookies.size());

        System.out.println("All COOKIES:");
        for(String key: cookies.keySet()){//keyset e uma lista de key em set
            System.out.println(key+  ": " + cookies.get(key));
        }
    }
}