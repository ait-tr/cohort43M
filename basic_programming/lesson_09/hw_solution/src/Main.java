public class Main {
    public static void main(String[] args) {
        // Task 1
        //С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n.
        //static void printCube( int n )
        //
        //Пример:для числа n=3
        //1 в кубе 1
        //2 в кубе 8
        //3 в кубе 27

        printCube(4);

        //Task 2
        //С помощью цикла while написать метод, выводящий на печать результат
        // умножения данного числа n на все целые числа от 0 до n

        printResult(3);
    }
    public static int printCube(int n){

        int i = 1;
        while (i <= n){
            System.out.println("Cube of " + i + " is " + (i * i * i));
            i++;}
    return (i * i * i);
    }
    public static int printResult(int n){
        int i = 0;
        while (i <= n){
            System.out.println(n + " * " + i + " = "+ n * i );
            i++;
        }
        return (n * i);
    }
}
