public class Zadacha1 {
    /* Задача1
Используя цикл for вывести на экран все нечетные элементы
массива fruits из первой
задачи дз предыдущего занятия.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод. */
    public static void main(String[] args) {
        String[] fruits = {"Orange","Apple","Banana","Mango"};

        for( int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        fruits[1] = "Kiwi";

        for( int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("print even elements");
        System.out.println("************");
        for (int i = 0; i < fruits.length; i++){
            if( i % 2 == 0){
                System.out.println(fruits[i]);
            }
        }
        System.out.println("print *odd* elements");
        for (int i = 0; i < fruits.length; i++){
            if( i % 2 != 0){
                System.out.println(fruits[i]);
            }
        }



    }
}
