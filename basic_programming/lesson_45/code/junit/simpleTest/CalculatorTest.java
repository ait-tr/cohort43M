package code.junit.simpleTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testSum(){
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 15;

        int expectedResult = 25;

        int actualResult = calculator.sum(x,y);

        assertEquals(expectedResult,actualResult);

    }

}