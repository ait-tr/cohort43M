import com.sun.source.tree.BreakTree;

public class Homework21 {



    public static void main(String[] args) {

        int[] array = {1,2,3,8,5,9,12};
        findSum(array);




        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        for(int i=0; i<fruits.length; i++){
            if(i%2 !=0){
                System.out.println(fruits[i]);
            }
        }

    }


    public static int findSum(int[] array) {
        int sum = 0; int quan = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                quan++;
                sum = sum  +  j;

            }

        }
            System.out.println("Sum of all even elements = " + quan + " and summa = " + sum);

        return sum;
    }



}
