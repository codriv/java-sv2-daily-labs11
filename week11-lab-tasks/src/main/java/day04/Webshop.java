package day04;

import java.util.ArrayList;
import java.util.List;

public class Webshop {

    private List<Item> itemsForSale;
    private List<User> users;
    public static final int BASIC_SERVICE_WARRANTY = 12;
    public static final int BASIC_PRODUCT_WARRANTY = 3;
    public static final int EXTENDED_PRICE_PERCENT = 10;
    public static final int EXTENDED_WARRANTY = 36;


    public Webshop(List<Item> itemsForSale, List<User> users) {
        this.itemsForSale = itemsForSale;
        this.users = users;
    }

    public List<Item> getItemsForSale() {
        return new ArrayList<>(itemsForSale);
    }

    public void buy(String userName, String itemName) {
        Validators.checkString(userName, "User");
        Validators.checkString(itemName, "Item");
        User user = findUserByName(userName);
        Item item = (findItemByName(itemName));
        user.buy(getNewItem(user, item));
    }

    private Item getNewItem(User user, Item item) {
        Item newItem;
        String name = item.getName();
        int price = item.getPrice();
        if (item instanceof Product) {
            newItem = getProduct(user, name, price);
        } else {
            newItem = new Service(name, price);
            ((Service)newItem).setBestBefore();
        }
        return newItem;
    }

    private Product getProduct(User user, String name, int price) {
        Product newItem = new Product(name, price);
        newItem.setBestBefore();
        if (user.getMoney() >= price * 3) {
            newItem.extendWarranty();
        }
        return newItem;
    }

    private Item findItemByName(String name) {
        for (Item item: itemsForSale) {
            if (name.equals(item.getName())) {
                return item;
            }
        }
        throw new IllegalArgumentException("Item not found!");
    }

    private User findUserByName(String name) {
        for (User user: users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        throw new IllegalArgumentException("User not found!");
    }
}