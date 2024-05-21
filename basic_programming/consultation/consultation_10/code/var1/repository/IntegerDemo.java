package code.var1.repository;

public class IntegerDemo {
    public static void main(String[] args) {

        Integer a = new Integer(1000);
        Integer b = new Integer(1000);

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer x = 100;
        Integer y = 100;

        System.out.println(x == y);

        Integer x1 = 1000;
        Integer y1 = 1000;

        System.out.println(x1 == y1);


        Integer result = 1000;

        Integer resultB = 1000;

        if (result == resultB) {
            System.out.println("Ok");
        }

    }
}
