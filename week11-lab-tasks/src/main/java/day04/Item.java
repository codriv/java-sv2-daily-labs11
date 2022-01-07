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
        if (bestBefore == null) {
            return LocalDate.now();
        } else {
            return bestBefore;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }
}
