package code.date;

import java.time.*;
import java.time.temporal.ChronoField;

public class DateDemo3 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.of(2024,8,14);

        int weekOfYear = today.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
        int weekOfMonth = today.get(ChronoField.ALIGNED_WEEK_OF_MONTH);

        System.out.println(weekOfMonth);
        System.out.println(weekOfYear);

        int monthValue = today.getMonthValue();

        int quarter = (monthValue - 1) / 3 + 1;
        quarter = (int) Math.ceil(monthValue / 3.0);

        // 1,2,3 -> 1
        // 4,5,6 -> 2
        // 7,8,9 -> 3
        // 10,11,12 - > 4

        System.out.println(quarter);


        LocalDateTime dateTime1 = LocalDateTime.of(2024,6,4,14,10,0);
        LocalDateTime dateTime2 = LocalDateTime.of(2024,6,12,10,10,0);

        boolean isBefore = dateTime1.isBefore(dateTime2);
        boolean isAfter = dateTime1.isAfter(dateTime2);

        System.out.println("dataTime1 is before dataTime2 " + isBefore);
        System.out.println("dataTime1 is after dataTime2 " + isAfter);





    }
}
