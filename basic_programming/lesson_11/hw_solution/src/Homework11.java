public class Homework11 {
    public static void main(String[] args) {

        //---------1------------

        System.out.println("Fruits array");
        String [] names = {"Orange", "Apple", "Banana", "Mango"};
        for( int i = 0; i< names.length; i++){
            System.out.println("names[ " + i + " ] = " + names[i]);
        }
        names[1] = "Kiwi";
        System.out.println("With kiwi ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[ " + i + " ] = " + names[i]);
        }

        System.out.println("Print min");
        int [] min = {5,6,0,8};
        findMin(min);


    }

        public static int findMin ( int[] ints) {
            int min = ints[0];
            for (int i = 1; i < ints.length; i--) {
                if (ints[i] < min) {
                    min = ints[i];
                }
            }
        }}