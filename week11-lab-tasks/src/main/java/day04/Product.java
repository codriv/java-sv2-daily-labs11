package day04;

import java.time.LocalDate;
import java.util.Locale;

public class Product extends Item{

    private int basicWarrantyMonth = 3;
    private int extendedPercent = 10;
    private int extendedYear = 3;

    public Product(String name, int price) {
        super(name, price);
    }

    public void extendWarranty() {
        double increasedPrice = super.getPrice() * (100 + extendedPercent) / 100d;
        super.setPrice(Integer.parseInt(String.format(Locale.US, "%.0f", increasedPrice)));
        setBestBefore(LocalDate.now().plusYears(extendedYear));
    }

    public void setBestBefore() {
        super.setBestBefore(LocalDate.now().plusMonths(basicWarrantyMonth));
    }
}
