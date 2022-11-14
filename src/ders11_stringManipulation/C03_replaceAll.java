package ders11_stringManipulation;

public class C03_replaceAll {

    public static void main(String[] args) {

        String str = "J1ava2 G9uzel5dir8";

        // str'daki sayilari silip metni Java Guzeldir haline donusturelim.

        // str.replaceAll() sadece bir harf yada char sequence' degil
        //genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir.

        System.out.println(str.replaceAll("\\d","")); // Java Guzeldir

        System.out.println(str.replaceAll("\\D","")); // 12958

        String s1 = "Fiyatı : 1250 tl";
        String s2 = "Fiyatı : 1500 tl";

        // iki urunun fiyatını toplayın
        s1 = s1.replaceAll("\\D","");
        s2 = s2.replaceAll("\\D","");

        System.out.println(s1 + s2);
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));


    }



}
