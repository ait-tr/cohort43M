public class Main {

    /*
    Методы в Джава
     */
    public static void main(String[] args) {

        //   printHello();
        //   hello();
        //   printHello();
        //   printHello();
    /*    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = scanner.nextInt();


        printSum(x,y);
        */

        //  displayName("John","Black",45);
        //  displayName("White","Bob",18);
        //  displayName("Red","Kate",24);
        // displayName(34,"Ann");

        int res = sum(1, 2, 3);
        System.out.println(res + 100);

        String result = time(23);
        System.out.println(result);

        int res1 = square(3);
        System.out.println(square(5));
        System.out.println(res1);
    }

    public static void printHello() {
        System.out.println("Hello Java");
        hello();

    }

    public static void hello() {
        System.out.println("Hello!!!");
        return;
    }

    public static void printSum(int a, int b) {

        System.out.println(a + b);
    }

    public static void displayName(String surname, String name, int age) {
        System.out.println("Person's name is " + name);
        System.out.println("Person's surname is " + surname);
        System.out.println("Person's age  is " + age);
    }

    public static int sum(int a, int b, int c) {
        // System.out.println( a + b + c);
        int result = a + b + c;
        return result;
    }

    public static String time(int hour) {
        if (hour > 24) {
            return "Invalid input";
        } else if (hour > 18 || hour < 22)
            return "Good evening !";
        else
            return "Good day!";
    }

    // написать метод, печатающий значение переменной в квадрате
    public static int square(int n) {
        int result = n * n;
        // System.out.println(result);
        return result;
    }


}
