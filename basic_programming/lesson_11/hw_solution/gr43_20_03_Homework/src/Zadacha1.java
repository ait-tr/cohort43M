public class Zadacha1 {
    public static void main(String[] args) {
        /* Задача1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод. */
String[] fruits ={ "Orange","Apple","Banana","Mango"};
 for( int i=0;i< fruits.length;i++){
     System.out.println("fruit ["+i+"]"+fruits[i]);
 }
 fruits[0]="Kiwi";
        System.out.println("*************");
        for(int i=0;i< fruits.length;i++){
            System.out.println("fruit ["+i+"]"+fruits[i]);
        }
    }

}
