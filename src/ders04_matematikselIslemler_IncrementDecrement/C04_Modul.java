package ders04_matematikselIslemler_IncrementDecrement;

import java.util.Scanner;

public class C04_Modul {
    public static void main(String[] args) {

        // Kullanicinin girdigi 4 basamaklı sayının
        // rakamlar toplamını bulan kod yaz

        Scanner scan = new Scanner(System.in);

        System.out.println("4 Basamaklı pozitif tam sayi girin : ");

        int sayi = scan.nextInt();

        int toplam = 0;
        int birler;
         /*
        int birler = sayi % 10;  // 3
        System.out.println(birler);
        toplam = toplam+birler;   // 3
        sayi = sayi/10;  // 145

        birler = sayi%10;    // 5
        System.out.println(birler);
        toplam = toplam+birler;  // 3 + 5
        sayi  =sayi/10;   //    14

        birler = sayi%10;       // 4
        System.out.println(birler);
        toplam  = toplam+birler;      // 8 + 4
        sayi = sayi/10;            // 1

        birler = sayi%10;         // 1
        System.out.println(birler);
        toplam = toplam + birler;    // 12 + 1



        System.out.println("Rakamlar toplamı : " + toplam);

        
         for (int i = 0; i<4; i++) {

                 birler = sayi % 10;
                 System.out.println(birler);
                 toplam = toplam + birler;
                 sayi = sayi / 10;
         }


        System.out.println(toplam);

          */

         while(sayi > 0)
         {
               birler = sayi % 10;
               System.out.println(birler);
               toplam = toplam + birler;
               sayi = sayi / 10;
               System.out.println(sayi);
         }

        System.out.println(toplam);


    }
}
