package com.javaBootCamp.nutsNBolts.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

//        create a date 5 may 2022
        LocalDate may5 = LocalDate.of(2022, 5, 5);
        System.out.println(may5);

        LocalDate five5 = LocalDate.of(2022, Month.MAY, 5);
        System.out.println(five5);

        LocalDate day125 = LocalDate.ofYearDay(2022, 125);
        System.out.println(day125);

//        Date with parse
        LocalDate may5th = LocalDate.parse("2022-05-05");
        System.out.println(may5th);

        System.out.println(may5.getYear());
        System.out.println(may5.getMonth());
        System.out.println(five5.getMonthValue());
        System.out.println("-".repeat(50));
        System.out.println(may5th.getDayOfMonth());
        System.out.println(may5th.getDayOfWeek());
        System.out.println(may5th.getDayOfYear());
        System.out.println("-".repeat(50));
//        using chrono field
        System.out.println(may5th.get(ChronoField.DAY_OF_MONTH));
        System.out.println(may5th.get(ChronoField.DAY_OF_YEAR));
        System.out.println(may5th.get(ChronoField.DAY_OF_WEEK));
        System.out.println(may5th.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(may5th.get(ChronoField.YEAR));
    }
}
