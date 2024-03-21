public class Homework20 {

    public static void main(String[] args) {
        int[]array = {15,26,8,35,89,3,39};
        findMin(array);



        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i] + " ");

        }
        System.out.println("With Kiwi ");
        fruits[0]="Kiwi";
        for(int i=0; i< fruits.length; i++){
            System.out.println(fruits[i]);

        }

        }


    public static void findMin(int[]arr){
        int min = arr[0];

        for (int i=1; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];

            }
        }
        System.out.println(min);



    }

    }

