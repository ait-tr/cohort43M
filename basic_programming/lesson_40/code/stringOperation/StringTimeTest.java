package code.stringOperation;

public class StringTimeTest {
    public static void main(String[] args) {

        String str = "";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }


        long endTime = System.currentTimeMillis();

        System.out.println("Operations time is : " + (endTime - startTime));


        Boolean bool = Boolean.TRUE;

        String result = "Boolean is " + bool;

        System.out.println(result);

    }
}
