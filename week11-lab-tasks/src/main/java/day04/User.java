package day04;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int money;
    private List<Item> items = new ArrayList<>();
    private int extendedPercent = 10;
    private int extendedYear = 3;

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
            Item newItem = getSelectedItem(item);
            items.add(newItem);
            money -= newItem.getPrice();
        } else {
            throw new IllegalStateException("Not enough money!");
        }
    }

    private Item getSelectedItem(Item item) {
        Item newItem;
        String name = item.getName();
        int price = item.getPrice();
        if (item instanceof Product) {
            newItem = new Product(name, price);
            if (money >= price * 3) {
                ((Product)newItem).extendWarranty(extendedYear, extendedPercent);
            }
        } else {
            newItem = new Service(name, price);
        }
        return newItem;
    }
}
