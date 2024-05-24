package code.staticExample.example2;

public class StaticDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        mult(x,y);

    }

    public static void mult(int x, int y){
        System.out.println("Результат умножения = " + (x * y));
    }
}
