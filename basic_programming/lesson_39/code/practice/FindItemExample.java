package code.practice;

public class FindItemExample {
    public static void main(String[] args) {

        int[] array = {10,15,25,7,25,13,25,41,25,70};

        IFindItem ref = (int item, int[] workingArray) ->  {
            int count = 0;
            for (int i = 0; i < workingArray.length; i++) {
                if (item == workingArray[i]) {
                    count++;
                }
            }
            return count;
        };

        System.out.println("Количество повторений числа 25 в массиве = " + findItem(array,25, ref));


    }

    public static int findItem(int[] array, int item, IFindItem ref){
        int count = ref.countOccurrences(item, array);
        return count;
    }
}
