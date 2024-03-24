package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExemplo {

    public static void main(String[] args) {
        SimpleDateFormat formatadorComPadrao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        Calendar calendar2 = Calendar.getInstance();
//        System.out.println(formatadorComPadrao.format(calendar2.getTime()));
//        System.out.println(formatadorComPadrao.format(calendar.getTime()));

        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));

        calendar.add(Calendar.MONTH, 5);
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println(formatadorComPadrao.format(calendar.getTime()));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

        System.out.println(calendar.before(calendar2));
        System.out.println(calendar.after(calendar2));
    }
}

