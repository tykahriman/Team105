package ders10_StringManipulation;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("hersey")); // 15

        System.out.println(str.indexOf("e", 9)); // 9 dan sonra e arıycak

        System.out.println(str.indexOf("e", 14));

        // cumledeki 2.c indeksini yazdirsin

        int ilkcIndex = str.indexOf("c"); // 8
        System.out.println(str.indexOf("c",ilkcIndex+1)); // 22

        System.out.println(str.indexOf("ali")); // -1 doner


    }
}
