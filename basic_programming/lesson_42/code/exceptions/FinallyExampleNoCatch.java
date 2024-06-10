package code.exceptions;

public class FinallyExampleNoCatch {
    public static void main(String[] args) {
        int number = getNumber();
        System.out.println(number);
    }

    private static int getNumber() {
        int x = 0;

        try {
            x = x  / 0;
            System.out.println("Отработал блок try");
            return x;
        } finally {
            System.out.println("Отработал блок finally");
        }
    }
}
