package ders04_matematikselIslemler_IncrementDecrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        // kullanıcıdan iki double sayı al.
        //iki sayıyı böl
        // sonuc tam sayı kısmını yazdır

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayı : ");
        double sayiBir = scan.nextDouble();
        System.out.println("İkinci sayı : ");
        double sayiIkı = scan.nextDouble();

        int tamSonuc = (int)(sayiBir/sayiIkı);

        System.out.println("Sonuc : " + tamSonuc);

    }
}
