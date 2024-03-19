public class Practice {

    /*
    Написать метод, выводящий  на экран треугольник, состоящий из цифр от 1 до числа n:
    1
    12
    123
    1234
    12345
    ...
    1234..n
    */
    public static void main(String[] args) {
        printTriangle(6);
    }
    public static void printTriangle( int n){

        for( int i = 1; i <= n; i++){
            for( int j = 1; j <= i; j++){ // 1  2
                System.out.print(j);
              //  System.out.print(i);
            }
            System.out.println();
        }
    }
    /*
    1
    12
    123
     */


    /*
    Написать метод, выводящий на экран треугольник из одинаковых цифр в строке такого вида:
    1
    22
    333
     */
}
