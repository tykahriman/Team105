package ders01_programlamayaGiris;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminizi Giriniz : ");

        // string icin next kullanırsak space'e kadar olan kısmı alır
        //nextline ise yazılan satırdaki bilgiyi alır
        String isim = scan.nextLine();
        System.out.println("Soyisminizi Girin : ");
        String soyisim = scan.nextLine();

        System.out.println("Yasinizi Giriniz : ");
        double yas = scan.nextDouble();

        System.out.println("----------------");
        System.out.println("İsim : " + isim + " "+ soyisim + "\nYaş : " + yas);


    }
}
