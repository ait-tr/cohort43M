public class Zadacha2 {
    /* Задача2
Есть массив целых чисел. Написать метод, находящий и
 возвращающий количество четных чисел в этом массиве.
Пример: {1, 2, 8, 7} -> количество четных чисел = 2. */
    public static void main(String[] args) {
        int[] array1 = {5 , 2 ,5, 7,2,2,2};
        findEven(array1);

    }
    public static int findEven(int[]array){
        int kol=0;
        System.out.print("{ ");
    for(int i = 0;i< array.length ; i++){
        System.out.print(array[i]+"  ");
        if(array[i]%2 ==0){
            kol=kol+1;
        }
    }
        System.out.println("} => количество четных чисел ="+kol);
    return kol;

    }
}
