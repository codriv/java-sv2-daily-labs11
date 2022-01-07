package day04;

import java.time.LocalDate;

public class Service extends Item{

    private int basicWarrantyYear = 1;

    public Service(String name, int price) {
        super(name, price);
    }

    public void setBestBefore() {
        super.setBestBefore(LocalDate.now().plusYears(basicWarrantyYear));
    }
}
