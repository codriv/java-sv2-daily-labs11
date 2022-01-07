package day04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product("TV", 150000);

    @Test
    void extendWarranty() {
        assertEquals("TV", product.getName());
        assertEquals(150000, product.getPrice());
        assertEquals(LocalDate.now().plusMonths(3), product.getBestBefore());
        product.extendWarranty();
        assertEquals(165000, product.getPrice());
        assertEquals(LocalDate.now().plusYears(3), product.getBestBefore());
    }
}