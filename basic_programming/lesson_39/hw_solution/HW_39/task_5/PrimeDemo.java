package HW_39.task_5;

public class PrimeDemo {
    public static void main(String[] args) {

        PrimeChecker primeChecker = (number) -> {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        };

        int number1 = 17;
        int number2 = 18;

        System.out.println("Is " + number1 + " a prime number? " + primeChecker.isPrime(number1));
        System.out.println("Is " + number2 + " a prime number? " + primeChecker.isPrime(number2));
    }
}
