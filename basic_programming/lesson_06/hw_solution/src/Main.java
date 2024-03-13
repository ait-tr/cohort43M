public class Main {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;
        int c = 7;

        if ((a == b) && (b== c)) {
            System.out.println("All numbers are equal");
        }
        else if ((a == b) || (a == c) || (b == c)) {
            System.out.println("Some numbers are equal");
        }
        else {
            System.out.println("All numbers are different");
        }

    }
}