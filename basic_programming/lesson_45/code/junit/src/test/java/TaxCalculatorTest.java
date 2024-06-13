package code.junit.src.test.java;

import code.junit.src.main.java.TaxCalculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorTest {

    TaxCalculator taxCalculator = new TaxCalculator();

    @BeforeAll
    static void beforeAllMethod(){}


    @BeforeEach
    void beforeEachMethod(){}



    @Test
    void taxTest() {

        double income = 1000;
        double expected = 250;
        double actual = taxCalculator.calculateTax(income);

        double diviation = 0.001;

        assertEquals(expected, actual, diviation);

        // Math.abs(actual - expected) < diviation
    }

    @Test
    void taxTestLessZero() {

        double income = -1000;
        double expected = 0;
        double actual = taxCalculator.calculateTax(income);

        double diviation = 0.001;

        assertEquals(expected, actual, diviation);


    }

    @Test
    void taxTestEqual20000() {

        double income = 20000;
        double expected = 5000;
        double actual = taxCalculator.calculateTax(income);

        double diviation = 0.001;

        assertEquals(expected, actual, diviation);


    }


    @Test
    void taxTestMore20000() {

        double income = 30000;
        double expected = 9000;
        double actual = taxCalculator.calculateTax(income);

        double diviation = 0.001;

        assertEquals(expected, actual, diviation);


    }


    @AfterAll
    static void afterAllMethod(){}


    @AfterEach
    void afterEachMethod(){}


}