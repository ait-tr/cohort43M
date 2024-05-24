package code.staticExample.staticVariable.example2;

public class Furniture {
    public static void main(String[] args) {
        Chair chair1 = new Chair(1,"model1");
        Chair chair2 = new Chair(2,"model2");
        Chair chair3 = new Chair(3,"model3");

        System.out.println(Chair.chairCounter);

    }
}
