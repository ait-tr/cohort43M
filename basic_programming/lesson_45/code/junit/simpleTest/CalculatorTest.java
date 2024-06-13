package code.junit.simpleTest;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int x = 5;
        int y = 10;

        int expectedResult = 15;
        int actualResult = calculator.sum(x,y);

        if (expectedResult == actualResult){
            System.out.println("Test method sum() is OK!");
        } else {
            System.out.println("Test method sum() is FAIL!");
            System.out.println("Expected: " + expectedResult + ", but received " + actualResult);
        }


        expectedResult =50;
        actualResult = calculator.multiplication(x,y);

        if (expectedResult == actualResult){
            System.out.println("Test method multiplication() is OK!");
        } else {
            System.out.println("Test method multiplication() is FAIL!");
            System.out.println("Expected: " + expectedResult + ", but received " + actualResult);
        }

    }
}
