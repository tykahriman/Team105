package ders27_immutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        System.out.println(saat);

        LocalTime saat2 = LocalTime.of(18,18,18);

        System.out.println(saat.equals(saat2));
        System.out.println(saat.compareTo(saat2));


    }

}
