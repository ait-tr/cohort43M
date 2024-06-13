package code.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateOld {
    public static void main(String[] args) {
        Date nowDate = new Date();

        System.out.println("текущая дата и время : " + nowDate);

        Date anotherDate = new Date(1_500_000_000_000L);

        /*
        getTime() - возвращал количество миллисекунд с 1 января 1970 года
        setTime(Long time) - устанавливает время
        after(Date) - проверяет что этот момент времени после указанной даты
        before(Date)
         */

        System.out.println("дата, которая соответствует 1_500_000_000_000 миллисекунд с 1 января 1970 года " + anotherDate);

        System.out.println("текущая дата после anotherDate?" + nowDate.after(anotherDate));


        // --------------- CALENDAR -------

        System.out.println("--------- Работа с CALENDAR --------");

        Calendar cal = Calendar.getInstance();

        System.out.println("Текущее время: " + cal.getTime());

        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH,Calendar.FEBRUARY);
        cal.set(Calendar.DATE,28);

        System.out.println("Измененная дата: " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Добавляем к дата один день: " + cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Добавляем к дата один день: " + cal.getTime());

        cal.add(Calendar.DAY_OF_MONTH, -30);
        System.out.println("Вычитаем одн месяц назад к дате: " + cal.getTime());


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatedDate = sdf.format(cal.getTime());
        System.out.println(formatedDate);

    }
}
