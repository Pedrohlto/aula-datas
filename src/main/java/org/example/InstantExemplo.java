package org.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class InstantExemplo {

    public static void main(String[] args) {
        Instant instante = Instant.now();
        System.out.println(instante);

        System.out.println(instante.getEpochSecond());
//        System.out.println(instante.getNano());
        System.out.println(System.currentTimeMillis());
        System.out.println(instante.toEpochMilli());

        Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(-3));
        System.out.println(instant);


    }
}
