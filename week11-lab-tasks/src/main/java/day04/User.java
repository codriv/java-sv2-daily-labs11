package day04;

import java.time.LocalDate;
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
            Item newItem = getNewItem(item);
            items.add(newItem);
            money -= newItem.getPrice();
        } else {
            throw new IllegalStateException("Not enough money!");
        }
    }

    private Item getNewItem(Item item) {
        Item newItem;
        String name = item.getName();
        int price = item.getPrice();
        if (item instanceof Product) {
            newItem = getProduct(name, price);
        } else {
            newItem = new Service(name, price);
            ((Service)newItem).setBestBefore();
        }
        return newItem;
    }

    private Product getProduct(String name, int price) {
        Product newItem = new Product(name, price);
        newItem.setBestBefore();
        if (money >= price * 3) {
            newItem.extendWarranty();
        }
        return newItem;
    }
}
