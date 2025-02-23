import java.util.ArrayList;

import java.util.List;

import java.util.function.Consumer;


public class Consumer1 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));

        list.add(new Product("Mouse", 50.00));

        list.add(new Product("Tablet", 350.50));

        list.add(new Product("HD Case", 80.90));



        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

        list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice()*1.1));

        list.forEach(System.out::println);



//	double min = 100.0;

//

//	list.removeIf(p -> p.getPrice() >= min);

//

////	Predicate<Product> pred = p -> p.getPrice() >= min;

//

//	list.removeIf(Product :: staticProductPredicate);

//	list.removeIf(Product :: nonStaticProductPredicate);

//

//	for(Product p: list) {

//		System.out.println(p);

//	}

    }





}