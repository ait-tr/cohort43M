package HW_39.task_2;

public class IntegerDigitDemo {
    public static void main(String[] args) {
        IntegerDigit integerDigit = (x, y) -> {return x + y;};

        System.out.println("The sum of the integers is: " + integerDigit.calculation(458, 897));

    }
}
