package ders03_datacastingWrapper;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz : ");

        int sayi = scan.nextInt();

        byte donusum = (byte)sayi;
        System.out.println("Girilen Sayi : " + sayi + "\nDonusmus Hali : " + donusum);
    }
}
