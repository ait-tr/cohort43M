package code.enumExample2.enumNowExtend;

import java.util.Arrays;

public class DayDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DayOfWeekExtend.values()));
        int sundayIndex = DayOfWeekExtend.SUNDAY.ordinal();

        System.out.println(sundayIndex);

        DayOfWeekExtend monday = DayOfWeekExtend.valueOf("MONDAY");
        System.out.println(monday);

    }
}
