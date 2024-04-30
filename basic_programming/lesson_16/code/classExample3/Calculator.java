package code.classExample3;

public class Calculator {

    public void sum(){
        int x = 10;
        int y = 15;
        int result = x + y;

        System.out.println("Результат сложения = " + result);
    }


    public void sum1(int x, int y){
        int result = x + y;

        System.out.println("Результат сложения = " + result);
    }


    public int sum2(int x, int y){
        int result = x + y;
        return result;
    }


}
