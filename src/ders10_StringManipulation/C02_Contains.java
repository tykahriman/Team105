package ders10_StringManipulation;

public class C02_Contains {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok zevkli";

        System.out.println(str.contains("cok"));  // true

        System.out.println(str.contains("odla")); // true

        System.out.println(str.contains("a")); // true

        // System.out.println(str.contains('s')); // parametre olarak char kabul etmez

        // CharSequence : char dizisi

        System.out.println(str.contains("java")); // false kucuk j ile başlamıyor

        String str2 = "Java";
        System.out.println(str.contains(str2)); // true

        String str3 = "25648 Ali Can";
        //str3.contains(2); olmaz
        System.out.println(str3.contains("2"));



    }
}
