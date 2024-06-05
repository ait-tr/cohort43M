package code.practice;

public class LambdaExample2 {
    /*
    написать метод для вычисления суммы элементов массива,
    которые удовлетворяют определенным требованиям
     */

    public static void main(String[] args) {

        int[] array = {5,3,8,10,2,1,2,3};

        NumberCondition ref;

        ref = (number -> {
            if (number % 2 == 0){
                return true;
            } else {
                return false;
            }
        });


        System.out.println("Сумма четных элементов массива = " + sum(array, ref));

        ref = (number -> {
            if (number % 2 != 0){
                return true;
            } else {
                return false;
            }
        });


        System.out.println("Сумма не четных элементов массива = " + sum(array, ref));





    }

    public static int sum(int[] array, NumberCondition ref){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (ref.checkNumber(array[i])) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
