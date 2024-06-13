package code.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo2 {
    public static void main(String[] args) {

        // LocalDate

        LocalDate today = LocalDate.now();

        System.out.println("Сегодняшняя дата: "+ today);

        LocalDate specificDate = LocalDate.of(2024,1,1);
        System.out.println("Конкретная дата: " + specificDate);

        LocalDate parseDate = LocalDate.parse("2024-03-08");
        System.out.println("Разобранная дата: " + parseDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parseDateAnotherFormat = LocalDate.parse("08-03-2024",formatter);
        System.out.println("Другой формат даты: " + parseDateAnotherFormat);


        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Дата на завтра: " + tomorrow);

        // LocalTime

        System.out.println("-------- LocalTime --------");

        LocalTime time = LocalTime.now();
        System.out.println("Текущее время: " + time);

        LocalTime specificTime = LocalTime.of(13,30,15);
        System.out.println("Конкретное время: " + specificTime);

        LocalTime parseTime = LocalTime.parse("20:45:00");
        System.out.println("Разобранное время : " + parseTime);



        // LocalDateTime

        System.out.println(" -------- работа с LocalDateTime --------");


        LocalDateTime now = LocalDateTime.now();

        System.out.println("Сегодняшняя дата и время: "+ now);

        LocalDateTime specificDateTime = LocalDateTime.of(2024,3,8,10,45,00);
        System.out.println("Конкретная дата и время: " + specificDateTime);

        LocalDateTime parseDateTime = LocalDateTime.parse("2024-03-08T20:00:00");
        System.out.println("Разобранная дата и время: " + parseDateTime);



    }
}
