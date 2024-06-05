package code.work2;

public class NumberDemo {
    public static void main(String[] args) {

        myCalculator(785,485);
    }
    public static void myCalculator(int x, int y){
        Number number = (a, b) -> (x + y);
        System.out.println("Сумма двоиз целых чисел = " + number.numberCalculator(x,y));
    }
}
