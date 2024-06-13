package code.junit.src.test.java;

import code.junit.src.main.java.TempConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    @Test
    void testCelsiusToFahrenheitZero(){
        double tempCelsius = 0;
        assertEquals(32, TempConverter.celsiusToFahrenheit(tempCelsius));
    }

    @Test
    void testCelsiusToFahrenheit100(){
        double tempCelsius = 100;
        assertEquals(212, TempConverter.celsiusToFahrenheit(tempCelsius));
    }

}