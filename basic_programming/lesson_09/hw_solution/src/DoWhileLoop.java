import java.util.Scanner;

public class DoWhileLoop {


    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
            i--;
        } while (i > 1);
        example();
    }

public static void example(){
        Scanner scanner =new Scanner (System.in);
        char ch;

  do {
      System.out.println("Enter a letter / q to quit");
  ch = scanner.next().charAt(0);

      System.out.println("You have entered " + ch);
  }while (ch != 'q');


    }
}