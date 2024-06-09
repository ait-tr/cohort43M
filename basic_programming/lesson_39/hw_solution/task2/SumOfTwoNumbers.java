package homework_39.task2;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        //SumOfTwo sumOfTwo = (first,second) -> first+second;
        SumOfTwo sumOfTwo = Integer::sum;

        System.out.println(sumOfTwo.sum(5,10));
    }
}