package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExemplo {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDatime = LocalDateTime.of(2024,03,19,21,40,10);
        System.out.println(localDatime);

        LocalDateTime localDateTime1 = localDatime.plusDays(15)
                .plusHours(10)
                .plusMonths(10);

        System.out.println(localDateTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(formatter.format(localDateTime1));

        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        ZoneId zoneId = ZoneId.of("Australia/Sydney");
        LocalDateTime dateTime = LocalDateTime.now(zoneId);
        System.out.println(dateTime);

    }
}
