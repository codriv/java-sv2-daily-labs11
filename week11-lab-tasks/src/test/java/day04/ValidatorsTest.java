package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorsTest {

    @Test
    void checkString() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> Validators.checkString(null, "User"));
        assertEquals("User can not be null or empty!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class,
                ()-> Validators.checkString("", "User"));
        assertEquals("User can not be null or empty!", iae.getMessage());
        iae = assertThrows(IllegalArgumentException.class,
                ()-> Validators.checkString("  ", "Item"));
        assertEquals("Item can not be null or empty!", iae.getMessage());
    }
}