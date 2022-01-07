package day04;

import java.time.LocalDate;

public class Service extends Item{

    public Service(String name, int price) {
        super(name, price);
        super.setBestBefore(LocalDate.now().plusYears(1));
    }
}
