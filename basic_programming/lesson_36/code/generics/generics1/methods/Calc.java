package code.generics.generics1.methods;

public class Calc {
    public void sum(int x, int y){
        System.out.println("Сумма = " + (x + y));
    }

    public <E> void mult(E x, E y){
        System.out.println(x);
    }

}
