package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", RomanNumbers.toRoman(1));      //Forventet og faktisk input
    }


}
