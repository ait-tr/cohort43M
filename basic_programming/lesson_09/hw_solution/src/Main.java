public class Main {
    public static void main(String[] args) {
        printCube(7);
        multi(7);
    }
    /*
    С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n.
    static void printCube( int n )
    Пример:для числа n=3
    1 в кубе 1
    2 в кубе 8
    3 в кубе 27
     */
    public static void printCube(int n){
        int a = 1;

        while (a <= n){
            System.out.println(a + " cubed is " + (a*a*a));
            a++;
        }
    }
    /*
    С помощью цикла while написать метод, выводящий на печать результат умножения данного
    числа n на все целые числа от 0 до n
     */
    public static void multi(int n){
        int b = 0;

        while (b <= n){
            int result = n * b;
            System.out.println(n + " * " + b + " = " + result);
            b++;
        }
    }
}
