package Homework_39.task5;

public class Main5 {
    public static void main(String[] args) {

        PrimeChecker primeChecker = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int num1 = 7;
        int num2 = 10;


        boolean result1 = primeChecker.isPrime(num1);
        boolean result2 = primeChecker.isPrime(num2);


        System.out.println("Число " + num1 + " простое? " + result1);
        System.out.println("Число " + num2 + " простое? " + result2);
    }

}
