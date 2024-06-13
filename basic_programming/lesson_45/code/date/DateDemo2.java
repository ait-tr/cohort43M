package code.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

public class DateDemo2 {
    public static void main(String[] args) {


        // ZonedDateTime



        // ZonedId
        /*
        "Europa/Berlin"
        "America/New_York"
        "Asia/Tokyo"

         */

//        Set<String> zonesId = new TreeSet<>(ZoneId.getAvailableZoneIds());
//
//        for (String zoneId : zonesId){
//            System.out.println(zoneId);
//        }


        System.out.println("Текущее время в Токио: ");
        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(nowInTokyo);

        Period tenDay = Period.ofDays(10);
        System.out.println("период в десять дней: " + tenDay);

        Duration threeMinutes = Duration.ofMinutes(3);
        System.out.println("Длительность в три минуты: " + threeMinutes);

    }
}
