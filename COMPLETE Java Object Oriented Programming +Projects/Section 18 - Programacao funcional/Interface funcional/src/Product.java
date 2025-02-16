public class Product {

    private String name;

    private double price;





    public Product(String name, double d) {

        super();

        this.name = name;

        this.price = d;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }



    public static boolean staticProductPredicate(Product p) {

        return p.getPrice() >= 100;

    }



    public boolean nonStaticProductPredicate() {

        return getPrice() >= 100;

    }



    @Override

    public String toString() {

        return "Product [name=" + name + ", price=" + price + "]";

    }





}

