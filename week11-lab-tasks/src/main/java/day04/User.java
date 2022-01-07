package day04;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int money;
    private List<Item> items = new ArrayList<>();

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void buy(Item item) {
        if (money >= item.getPrice()) {
            items.add(item);
            money -= item.getPrice();
        } else {
            throw new IllegalStateException("Not enough money!");
        }
    }
}