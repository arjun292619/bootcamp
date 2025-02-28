package com.javaBootCamp.nutsNBolts.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

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
        System.out.println("-".repeat(50));
        System.out.println(may5th.withYear(2000));
        System.out.println(may5th.withMonth(3));
        System.out.println(may5th.withDayOfYear(126));
        System.out.println("-".repeat(50));
        System.out.println(may5.with(ChronoField.DAY_OF_YEAR, 126));
        System.out.println("-".repeat(50));
//        modifying by adding and deducting days
        System.out.println(may5th.plusDays(5));
        System.out.println(may5th.plusDays(365));
        System.out.println(may5th.plusMonths(13));
        System.out.println(may5.plusYears(2));
        System.out.println(may5th.plus(365, ChronoUnit.DAYS));
        System.out.println("-".repeat(50));
//        comparing dates
        System.out.println("may5th > today: " + may5th.isAfter(today));
        System.out.println("may5th > today: " + may5th.isBefore(today));
        System.out.println("may5th > today: " + may5th.compareTo(today));
        System.out.println("today > may5: " + today.compareTo(may5th));
        System.out.println("today = now: " + today.compareTo(LocalDate.now()));
        System.out.println("today equals now: " + today.equals(LocalDate.now()));

//
    }
}
