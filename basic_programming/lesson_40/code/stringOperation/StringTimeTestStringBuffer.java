package code.stringOperation;

public class StringTimeTestStringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Первоначальное значение ");

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }


        long endTime = System.currentTimeMillis();

        System.out.println("Operations time is : " + (endTime - startTime));


    }
}
