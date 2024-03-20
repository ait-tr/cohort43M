public class Triangle_while {
    public static void main(String[] args) {
        printTriangle(6);

    }

    public static void printTriangle(int n){
        int i = 1;
        while (i <= n)
        {
           int j = 1;
           while (j <= i){
               System.out.print(j);
               j++;
           }
           System.out.println();
           i++;
        }
    }
}

/*
Задача 2
Переписать задачу про треугольник из сегодняшнего занятия используя циклы while
 */
