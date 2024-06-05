package code.work3;

public class SimpleNumberDemo {
    public static void main(String[] args) {

        SimpleNumber simpleNumber = (number) -> {
            if (number <= 1){
                return false;
            }
            for (int i = 0; i <= Math.sqrt(number) ; i++) {
                if (number % 2 == 0){
                    return false;
                }
            }
            return true;
        };

        int[] array = {2,3,6,7,9,11,33,125,47,99,24,18};
        for (int newArray : array){
            System.out.println("Is " + newArray + " simple number "+ simpleNumber.simple(newArray));


        }


    }
}
