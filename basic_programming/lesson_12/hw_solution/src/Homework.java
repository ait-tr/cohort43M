public class Homework {
    public static void main(String[] args) {
/*
//-----------1-------------
        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        fruits[1] = "Kiwi";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("print even elements");
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                System.out.println(fruits[i]);
            }
            System.out.println("\nOdd arrays");
            for (int i1 = 0; i < fruits.length; i++) {
                if (i % 2 != 0) {
                    System.out.println(fruits[i]);
                }
            }

        }

 */
        //----------2-----------

        int[] numbers = {2,13,1,43,12};
        int even = evenNumbers( numbers);
        System.out.println("even numbers: " + even);

    }
    public static int evenNumbers(int[] numbers) {
        int even = 0;

        for (int number: numbers){
            if (number % 2 == 0){
                even++;

            }

        }
        return even;
    }
}
