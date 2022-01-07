package day04;

import java.time.LocalDate;

public class Item {

    private String name;
    private int price;
    private LocalDate bestBefore;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBestBefore(int warranty) {
        this.bestBefore = LocalDate.now().plusMonths(warranty);
    }
}
