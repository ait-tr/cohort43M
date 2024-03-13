public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Some numbers are equal.");
        }
    }
}
