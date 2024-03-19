public class NumberTriangle {
    /*
    Написать метод, выводящий  на экран треугольник, состоящий из цифр от 1 до числа n:
    1
    22
    333
     */
    public static void main(String[] args) {
        printNumberTriangle(5);
    }

    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
