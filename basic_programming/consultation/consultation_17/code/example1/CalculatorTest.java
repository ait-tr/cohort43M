package code.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void testSub(){
        assertEquals(5,calculator.subtract(8,3));
    }

    @Test
    public void testMulti(){
        assertEquals(6,calculator.multiply(2,3));
    }

    @Test
    public void testDiv(){
        assertEquals(2.0,calculator.divide(8,4));
    }


    @Test
    public void testDivZero(){
        assertThrows(MyDivideZeroException.class, () -> calculator.divide(3,0));
    }



}