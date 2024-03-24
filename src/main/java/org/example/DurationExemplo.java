package org.example;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

public class DurationExemplo {

    public static void main(String[] args) {

        Duration duracaoHoras = Duration.ofHours(10);
        System.out.println(duracaoHoras);

        Duration duracaoDias = Duration.ofDays(5);
        System.out.println(duracaoDias);

        System.out.println(duracaoDias.multipliedBy(10));

        System.out.println(duracaoDias.getSeconds());
        System.out.println(duracaoDias.getNano());
        System.out.println(duracaoDias.toHours());


    }
}
