package day04;

import java.time.LocalDate;

public class Service extends Item{

    public Service(String name, int price) {
        super(name, price);
    }

    @Override
    public LocalDate getBestBefore() {
        if (super.getBestBefore() == null) {
            return LocalDate.now().plusMonths(Webshop.BASIC_SERVICE_WARRANTY);
        } else {
            return super.getBestBefore();
        }
    }

    public void setBestBefore() {
        super.setBestBefore(Webshop.BASIC_SERVICE_WARRANTY);
    }
}
