package day04;

import java.util.ArrayList;
import java.util.List;

public class Webshop {

    private List<Item> itemsForSale;
    private List<User> users;
    public static int BASIC_SERVICE_WARRANTY = 12;
    public static int BASIC_PRODUCT_WARRANTY = 3;
    public static int EXTENDED_PRICE_PERCENT = 10;
    public static int EXTENDED_WARRANTY = 36;


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
        findUserByName(userName).buy(findItemByName(itemName));
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
