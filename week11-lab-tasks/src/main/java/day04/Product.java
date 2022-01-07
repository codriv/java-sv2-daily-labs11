package day04;

import java.time.LocalDate;
import java.util.Locale;

public class Product extends Item{

    public Product(String name, int price) {
        super(name, price);
    }

    public void extendWarranty() {
        double increasedPrice = super.getPrice() * (100 + Webshop.EXTENDED_PRICE_PERCENT) / 100d;
        super.setPrice(Integer.parseInt(String.format(Locale.US, "%.0f", increasedPrice)));
        setBestBefore(Webshop.EXTENDED_WARRANTY);
    }

    @Override
    public LocalDate getBestBefore() {
        if (super.getBestBefore() == null) {
            return LocalDate.now().plusMonths(Webshop.BASIC_PRODUCT_WARRANTY);
        } else {
            return super.getBestBefore();
        }
    }

    public void setBestBefore() {
        super.setBestBefore(Webshop.BASIC_PRODUCT_WARRANTY);
    }
}
