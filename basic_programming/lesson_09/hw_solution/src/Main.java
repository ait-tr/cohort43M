import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int n = 3;
        printCube(n);
        multiPlication(n);

        //Задача1
        //С помощью цикла while написать метод,
        // выводящий на экран куб числа от 1 до заданного числа n.
        //static void printCube( int n )
        //
        //Пример:для числа n=3
        //1 в кубе 1
        //2 в кубе 8
        //3 в кубе 27

    }

    public static void printCube(int n) {
        int nArg = 1;

        while (nArg<=n) {
            int nRes = nArg*nArg*nArg;

            System.out.println("Cube of "+nArg+ " is "+ nRes);
            nArg++;

    }
}

    public static void multiPlication(int n) {
        int nArg = 0;

        while (nArg<=n) {
            int nRes = nArg*n;

            System.out.println("Multiplication of "+n+ " and " + nArg +" is "+ nRes);
            nArg++;

    }

    //Задача 2
    //С помощью цикла while написать метод,
    // выводящий на печать результат умножения данного числа n
    // на все целые числа от 0 до n
}
    }
