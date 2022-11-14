package ders14_MethodOlusturma;

public class C05_SubstringOlustur {
    public static void main(String[] args) {

        /*
            Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
            baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
            bir method olusturun.
            - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
            mesaji verin
            - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
            yazdirin.
         */

        String str = "Yeni cozum";
        int bas=5, son=9;
        yazdir(str,bas,son);


    }

    public static void yazdir(String str, int bas, int son){

        if (bas>son){
            System.out.println("Hata..Baslangic indeksi bitisden buyuk olamaz");
        } else if (son>=str.length()) {
            System.out.println("Hata..Bitis indeksi sınırları asıyor");
        }
        else {
            for (int i = bas; i < son; i++) {
                System.out.print(str.charAt(i));
            }
        }

       // System.out.println(str.substring(bas, son));
    }
}
