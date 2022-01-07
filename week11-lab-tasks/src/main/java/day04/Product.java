package day04;

import java.time.LocalDate;
import java.util.Locale;

public class Product extends Item{

    public Product(String name, int price) {
        super(name, price);
        setBestBefore(LocalDate.now().plusMonths(3));
    }

    public void extendWarranty(int year, int percent) {
        double increasedPrice = super.getPrice() * (100 + percent) / 100d;
        super.setPrice(Integer.parseInt(String.format(Locale.US, "%.0f", increasedPrice)));
        setBestBefore(LocalDate.now().plusYears(year));
    }
}
