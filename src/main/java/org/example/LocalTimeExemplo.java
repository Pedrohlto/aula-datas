package org.example;

import java.time.LocalTime;

public class LocalTimeExemplo {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTimeOf = LocalTime.of(12,50, 30);
        System.out.println(localTimeOf);

        LocalTime localTime1 = localTimeOf.plusNanos(10)
                                          .plusMinutes(20)
                                          .plusHours(10);

        System.out.println(localTime1);


        LocalTime localTime2 = localTimeOf.minusHours(10)
                .minusMinutes(10)
                .minusSeconds(20);

        System.out.println(localTime2);

        localTime1.isAfter(localTime2);
        localTime1.isBefore(localTime2);



    }
}
