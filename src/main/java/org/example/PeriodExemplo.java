package org.example;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExemplo {

    public static void main(String[] args) {
        Period periodDias = Period.ofDays(10);
        System.out.println(periodDias);
        Period p10D = Period.parse("P10D");
        System.out.println(p10D);

        Period periodoMes = Period.ofMonths(5);
        System.out.println(periodoMes);

        Period periodoAnos = Period.ofYears(5);
        System.out.println(periodoAnos);

        Period periodoConfiguravel = Period.of(3,2,5);
        System.out.println(periodoConfiguravel);

        Period periodoEntreDatas = Period.between(LocalDate.now(), LocalDate.now().minusDays(350));
        System.out.println(periodoEntreDatas);

        System.out.println(periodoEntreDatas.getDays());
        System.out.println(periodoEntreDatas.getMonths());


    }
}
