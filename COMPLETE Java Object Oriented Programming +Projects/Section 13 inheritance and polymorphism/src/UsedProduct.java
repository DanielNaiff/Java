import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used)" + " $ " + getPrice() + "(Manufacture date: " + getManufactureDate() +")";
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
