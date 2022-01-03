package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    String userEmail = "proba@email.com";
    String password = "probajelszo";
    User adminUser = new AdminUser(userEmail, password);

    @Test
    void getUserEmail() {
        assertEquals("proba@email.com", adminUser.getUserEmail());
    }

    @Test
    void getPassword() {
        assertEquals("***********", adminUser.getPassword());
    }
}