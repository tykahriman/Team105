package ders04_matematikselIslemler_IncrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // kullanıcıdan iki int deger al
        // bunları böl ve sonucu double olarak yaz

        Scanner scan = new Scanner(System.in);

        System.out.println("İki tamsayı girin : ");

        int sayiBir = scan.nextInt(); //20
        int sayiIkı = scan.nextInt(); //6

        System.out.println(sayiBir/sayiIkı); //3

        double ondalikSonuc = (double)(sayiBir/sayiIkı); // (double)(3)==>3.0

        System.out.println(ondalikSonuc); //3.0

        double dogruSonuc = (double) sayiBir / sayiIkı; // double / int ==> genis olana gore sonuc verir

        System.out.println(dogruSonuc);



    }
}
