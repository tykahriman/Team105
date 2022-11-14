package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.minusDays(110));
        System.out.println(tarih.minusWeeks(15));

        System.out.println(tarih.minusDays(4)
                                .minusWeeks(35)
                                .minusMonths(3));

        System.out.println(tarih.getMonthValue()); //11.ay
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getDayOfYear());

        System.out.println(tarih.isLeapYear());

        System.out.println(tarih.withYear(1995).isLeapYear());
        System.out.println(tarih.withYear(1995).withMonth(2).withDayOfMonth(4));

        System.out.println(tarih.lengthOfMonth());

        System.out.println(tarih.withYear(2022).lengthOfYear());

        System.out.println(tarih.withYear(1995).withMonth(2).withDayOfMonth(4).getDayOfWeek());

        LocalDate date1 =LocalDate.of(2010,11,8);
        LocalDate date2 = LocalDate.of(2011,6,18);

        System.out.println(date2.isBefore(date1));
        System.out.println(date1.isAfter(date2));

        System.out.println(tarih.equals(date2));

    }
}
