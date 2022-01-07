package day04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    Service service = new Service("service", 20000);

    @Test
    void createTest() {
        assertEquals("service", service.getName());
        assertEquals(20000, service.getPrice());
        assertEquals(LocalDate.now().plusYears(1), service.getBestBefore());
    }

}