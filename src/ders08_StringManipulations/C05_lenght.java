package ders08_StringManipulations;

public class C05_lenght {

    public static void main(String[] args) {

        String str = "Uzunkelimeharfsayisi";

        System.out.println(str.length());

        // son karaktri yazdirin

        System.out.println(str.charAt(str.length()-1)); // son karakteri elde etmek icin kullanilir.

        System.out.println(str.substring(1)); // 1. indeksten itibaren zunkelimeharfsayisi

        System.out.println(str.substring(str.length()-1)); // i yazdirir



    }
}
