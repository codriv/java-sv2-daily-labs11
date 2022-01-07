package day04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebshopTest {

    List<Item> items = List.of(new Product("TV", 150000),
                                new Service("serviceCheap", 20000),
                                new Product("Car", 3000000),
                                new Product("Furniture", 800000));
    List<User> users = List.of(new User("Nagy Sándor", 1000000),
                                new User("Kis Péter", 2000000));
    Webshop webshop = new Webshop(items, users);

    @Test
    void buy() {
        webshop.buy("Nagy Sándor", "TV");
        assertEquals(165000, users.get(0).getItems().get(0).getPrice());
        assertEquals(LocalDate.now().plusYears(3), users.get(0).getItems().get(0).getBestBefore());
        assertEquals(LocalDate.now(), items.get(0).getBestBefore());
        assertEquals(835000, users.get(0).getMoney());
    }

    @Test
    void tooExpensiveTest() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> webshop.buy("Kis Péter", "Car"));
        assertEquals("Not enough money!", ise.getMessage());
    }
}