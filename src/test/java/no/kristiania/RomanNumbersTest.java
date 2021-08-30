package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", RomanNumbers.toRoman(1));      //Forventet og faktisk input
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", RomanNumbers.toRoman(2));
    }

    @Test
    void shouldConvert3ToIII(){
        assertEquals("III", RomanNumbers.toRoman(3));
    }

}
