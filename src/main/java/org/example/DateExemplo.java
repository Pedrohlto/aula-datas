package org.example;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 */
public class DateExemplo {
    public static void main(String[] args) {

        Date dataDeHoje = new Date();
        Date dataDeOntem = new Date(System.currentTimeMillis() - (24*60*60*1000));
//        System.out.println(dataDeHoje.getDay());
//        System.out.println(dataDeHoje.getDate());
//        System.out.println(dataDeHoje.getYear() + 1900);
//
//        System.out.println(dataDeHoje.before(dataDeOntem));
//        System.out.println(dataDeHoje.after(dataDeOntem));

//        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
//        System.out.println(formatador.format(dataDeHoje));
//
//        DateFormat formatadorMedio = DateFormat.getDateInstance(DateFormat.MEDIUM);
//        System.out.println(formatadorMedio.format(dataDeHoje));
//
//        DateFormat formatadorCompleto = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
//        System.out.println(formatadorCompleto.format(dataDeHoje));

        SimpleDateFormat formatador = new SimpleDateFormat();
        System.out.println(formatador.format(dataDeHoje));

        SimpleDateFormat formatadorComPadrao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatadorComPadrao.format(dataDeHoje));


    }
}


