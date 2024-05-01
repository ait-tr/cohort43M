package task2;

public class Task2 {
    public static void main(String[] args) {
        int first = 45;
        int second = 67;
        int third = 5;
        int forth = 98;
        System.out.println("4 random number from 0 to 100:"+ "\n" + first + "\n" + second + "\n" + third + "\n" + forth);
        int maxNum = getMaxNumber(first, second, third, forth);
        System.out.println("Max number is: " + maxNum);
            
        }
    public static int getMaxNumber(int a, int b, int c, int d){
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }

}
