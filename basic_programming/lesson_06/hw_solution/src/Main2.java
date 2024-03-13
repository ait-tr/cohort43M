public class Main2 {
    public static void main(String[] args) {


        int x =5;
        int y =5;
        if (x!=y) {
            System.out.println(x+y);

        }
        else  {
            System.out.println((x+y) *2);


        }
        int a = 1;
        int b = 2;
        int c = 3;
        if ((a != b) && ( b != c) && (c !=a)) {
            System.out.println("All numbers are different");
        }
        else if ((a==b)||(b==c)||(a==c)) {
            System.out.println("Some numbers are equal");
        }
        else System.out.println("All numbers are equal");

    }





}
