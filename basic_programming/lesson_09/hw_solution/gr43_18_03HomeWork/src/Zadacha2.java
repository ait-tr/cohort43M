public class Zadacha2 {
    public static void main(String[] args) {
        int n=5;
        resul(n);
    }
    /*Задача 2
С помощью цикла while написать метод,
выводящий на печать результат умножения данного числа n на все целые числа от 0 до n */
public static void resul(int n){
    int i=0;
    while (i<=n) {
        System.out.println("результат умножения " + n + " na " + i + " равно " + n * i);
        i++;
    }
}
}
