package day04;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("Nagy Sándor", 1000000);
    Item product = new Product("TV", 600000);
    Item productCheap = new Product("Book", 5000);
    Item productExpensive = new Product("Car", 2000000);
    Item service = new Service("service", 20000);
    Item serviceExpensive = new Service("serviceExpensive", 3000000);

    @Test
    void buy() {
        assertEquals(1000000, user.getMoney());
        user.buy(product);
        assertEquals(1, user.getItems().size());
        assertEquals("TV", user.getItems().get(0).getName());
        assertEquals(400000, user.getMoney());
        assertEquals(LocalDate.now().plusMonths(3), user.getItems().get(0).getBestBefore());
    }

    @Test
    void buyCheap() {
        assertEquals(1000000, user.getMoney());
        user.buy(product);
        user.buy(productCheap);
        assertEquals(2, user.getItems().size());
        assertEquals("Book", user.getItems().get(1).getName());
        assertEquals(LocalDate.now().plusYears(3), user.getItems().get(1).getBestBefore());
        assertEquals(5500, user.getItems().get(1).getPrice());
        assertEquals(394500, user.getMoney());
    }

    @Test
    void buyService() {
        assertEquals(1000000, user.getMoney());
        user.buy(service);
        assertEquals(20000, user.getItems().get(0).getPrice());
        assertEquals(LocalDate.now().plusYears(1), user.getItems().get(0).getBestBefore());
    }

    @Test
    void buyProductExpensive() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> user.buy(productExpensive));
        assertEquals("Not enough money!", ise.getMessage());
    }

    @Test
    void buyServiceExpensive() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> user.buy(serviceExpensive));
        assertEquals("Not enough money!", ise.getMessage());
    }
}