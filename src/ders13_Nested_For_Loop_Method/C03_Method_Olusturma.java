package ders13_Nested_For_Loop_Method;

import java.util.Scanner;

public class C03_Method_Olusturma {
    public static void main(String[] args) {

        /*
            Kullanicidan iki sayi alıp bunların toplamını
            yazdiran metot olusturun
         */

        isteToplaYazdir();
        isteToplaYazdir();  // kac kere cagirirsan o kadar calisir

    }

    public static void isteToplaYazdir(){

        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayi girin : ");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int toplam = sayi1 + sayi2;
        System.out.println("Toplam : " + toplam);
    }
}
