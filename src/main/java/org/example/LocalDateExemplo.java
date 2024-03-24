package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateExemplo {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDate ontem = LocalDate.of(2024,03,19);
        System.out.println(data);
        System.out.println(ontem);

        LocalDate dataNova = data.minusDays(10)
                .minusMonths(5)
                .minusYears(1);

        LocalDate dataNova2 = data.plusDays(10)
                        .plusMonths(5)
                                .plusYears(10);

        System.out.println(dataNova);
        System.out.println(dataNova2);

        LocalDate dataPorString = LocalDate.parse("2024-03-20");
        System.out.println(dataPorString);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);

        System.out.println(formatador.format(dataPorString));

        LocalDate dataPorStringFormatador = LocalDate.parse("25/03/2024", formatador);
        System.out.println(dataPorStringFormatador);

        dataPorStringFormatador.isAfter(dataPorString);
        dataPorStringFormatador.isBefore(dataPorString);
        dataPorStringFormatador.isEqual(dataPorString);



    }
}
