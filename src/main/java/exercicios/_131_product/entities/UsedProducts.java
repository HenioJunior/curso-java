package exercicios._131_product.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProducts extends Product {

    private Date manufactureDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

    public UsedProducts(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return name
                +" (used) $ "
                + String.format("%.2f", getPrice())
                +" (Manufacture date: "
                +sdf.format(getManufactureDate())
                +")";
    }
}