package code.generics.practice.example1;

public class OnlyNumbers <T extends Number>{

    private T number;

    public OnlyNumbers(T number) {
        this.number = number;
    }

    public void printNumber(){
        System.out.println("Ваше число: " + number);
    }

    public void printSquare() {
        System.out.println("Квадрат числа = " +
                (number.doubleValue() * number.doubleValue()));
    }
}
