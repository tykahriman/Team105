package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {

    public static void main(String[] args) {

        // dogumumdan bugune ne kadar zaman gecti ?

        LocalDate bugun = LocalDate.now();
        LocalDate dogumgunu = LocalDate.of(1995,02,04);

        Period gecensure = Period.between(dogumgunu,bugun);
        System.out.println(gecensure);

        System.out.println(gecensure.getYears());

    }
}
