package ders14_MethodOlusturma;

import ders13_Nested_For_Loop_Method.C03_Method_Olusturma;

public class C04_Tekrar {
    public static void main(String[] args) {

        // 2 sayinin carpımını yeni metod yazdırmadan yazdir

        int a = 10, b = 20;

        System.out.println(C01_carpimMethod.carpim(a, b));

        // 2 stringi olusturulan metod ile birlestir
        String c = "String", d="birlestir";

        System.out.println(C02_StringConcate.birlestir(c, d));

        // olusturulan metod ile tersten yazdır

        String e="Reis";
        System.out.println(C03_String_Terse_Cevir.ters(e));

    }
}
