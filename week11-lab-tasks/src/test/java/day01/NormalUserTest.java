package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    String userEmail = "proba@email.com";
    String password = "probajelszo";
    User normalUser = new NormalUser(userEmail, password);

    @Test
    void getUserEmail() {
        assertEquals("proba@email.com", normalUser.getUserEmail());
    }

    @Test
    void getPassword() {
        assertEquals("probajelszo", normalUser.getPassword());
    }
}