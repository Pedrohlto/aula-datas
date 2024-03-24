package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRules;

public class ZonedDateTimeExemplo {

    public static void main(String[] args) {
        ZoneId fuso = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoAustralia = ZoneId.of("Australia/Sydney");
        ZoneRules rules = fuso.getRules();
        ZoneOffset offset = ZoneOffset.ofHours(-3);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeComFuso = ZonedDateTime.of(LocalDateTime.now(), fusoAustralia);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTimeComFuso);

        System.out.println(zonedDateTimeComFuso.getZone());
        System.out.println(zonedDateTimeComFuso.getOffset());

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameLocal(fusoAustralia);
        System.out.println(zonedDateTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

        System.out.println(formatter.format(zonedDateTime1));

    }
}
