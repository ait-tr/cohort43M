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
            if(    i%2 == 1  ){
                System.out.println("fruits[" + i + "] = " + fruits[i]);
            }

            //System.out.println("fruits[" + i + "] = " + fruits[i]);
        }

        int [] x = {3,5,6,8,9,4};
        System.out.println(countOdd(x));
    }
    public static int countOdd (int [] intg){
        int count = 0;
        for (int i = 0; i < intg.length; i++) {
            if(intg[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
