package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_carpimMethod {

    public static void main(String[] args) {

        // kullanicidan iki sayi alın
        // carpimlarını donduren metod

        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayı giriniz : ");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sonuc = carpim(sayi1,sayi2);
        System.out.println(sayi1 +  " * " + sayi2 + " = " + sonuc);
    }

    public static int carpim(int sayi1, int sayi2) {
        int carpim = sayi1 * sayi2;
        return carpim;
    }
}
