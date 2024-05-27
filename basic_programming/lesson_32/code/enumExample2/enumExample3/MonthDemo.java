package code.enumExample2.enumExample3;

import java.util.Arrays;

public class MonthDemo {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Month.values()));
        System.out.println();
        System.out.println(Arrays.toString(Month.getWinterMonth()));
    }
}
