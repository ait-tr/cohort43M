import java.awt.event.WindowStateListener;

public class homework {
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        //System.out.println(fruits[0]);
        for (int i = 0; i < fruits.length; i++) {

            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }

        fruits[0] = "Kiwi";
        System.out.println("With Kiwi:");
        for (int i = 0; i < fruits.length; i++) {

            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }

        int[] minNumber = {67,84,34,66,32};
        System.out.println(findMin(minNumber));
    }

    public static int findMin(int[] ints) {


        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {

            if (ints[i] < min) {

                min = ints[i];

            }
        }
        return min;
    }
}

