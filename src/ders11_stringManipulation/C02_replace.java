package ders11_stringManipulation;

public class C02_replace {

    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a','A'));
        System.out.println(str.replace(' ','_'));
        System.out.println(str.replace("candir","cok guzeldir"));
        System.out.println(str.replace(" ",""));

        // Stringdeki a'ları sil
        System.out.println(str.replace("a",""));

        // Java yerine Hava, candır yerine cok güzeldir yaz
        System.out.println(str.replace("Java","Hava")
                              .replace("candir","cok guzeldir"));

        // Sadece ilk a'yı A yap
        System.out.println(str.replaceFirst("a","A"));

    }
}
