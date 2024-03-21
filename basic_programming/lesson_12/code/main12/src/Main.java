public class Main {
    // for - each loop  цикл for-each

    /*
    for( type variable : array )
    {
        statement(s)
    }
     */

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        System.out.println("print with for-each" );

        for( int element : numbers){
            System.out.println(element);
        }

        // Пусть есть массив целых чисел, нужно найти сумму значений всех его элементов

        int sum = 0;

        for( int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum of all elements is " + sum);

        // sum with for-each
            sum = 0;
        for( int elt : numbers){
            sum = sum + elt;
        }
        System.out.println("Sum with for-each " + sum);

        System.out.println();
        System.out.println("An attempt to change elements with for-each");

        for( int element : numbers){
            System.out.print(element + " ");
            element = element * 100;
        }
        System.out.println("\nAfter change");
        for( int elt : numbers){
            System.out.print(elt +" ");
        }
        /*
        Есть  2 массива целых чисел . Нужно написать метод, проверяющий их равенство. В случае,
        если массивы равны, метод возвращает true, если нет, то false
        Массивы равны, если они одинаковые
        {1,2,3} = {1,2,3}
        {1,2,3} != {1,3,2}
        {1,3,2,4}
         */
        System.out.println();
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,4,3};
        System.out.println(areEqual(arr1,arr2)); // true
        System.out.println(areEqual(arr1,arr3)); // false
    }
    public static boolean areEqual(int[] array1, int[] array2){
        if( array1.length != array2.length)
        {
           return false;
        }

        for(int i = 0; i < array1.length; i++){
            if( array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }

}
