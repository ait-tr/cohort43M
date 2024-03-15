public class Homework7 {

    //1

    public static void main(String[] args) {
        int number1 = 32;
        int number2 = 20;

        int sum = sumOfTwoNumbers(number1, number2);
        System.out.println("Summa of numbers " + number1 + " & " + number2 + " = " + sum);

        gradC(34);
        gradC(23);
        gradC(15);

    }

    public static int sumOfTwoNumbers(int num1, int num2) {

        return num1 + num2;
    }


    //2

    public static double gradC(double F) {
        double grad = 5 * (F - 32) / 9;
        System.out.println("Degree Fahrenheit is " + grad);
        return grad;
    }




}
