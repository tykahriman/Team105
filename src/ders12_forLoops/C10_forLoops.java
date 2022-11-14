package ders12_forLoops;

import java.util.Scanner;

public class C10_forLoops {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini
        // kontrol edin ve sonucu yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Pozitif bir sayi girin  :");

        int sayi = scan.nextInt();
        int sayac = 0;

        if (sayi > 0 && sayi != 1){

            for (int i = 2; i < sayi; i++) {

                if (sayi % i == 0) {
                    sayac++;
                    break;
                }
            }
            if (sayac == 0){
                System.out.println(sayi + " asaldir.");
            }
            else
                System.out.println(sayi + " asal degildir");
        }
        else
            System.out.println("Asal sayilar 1'den büyük pozitif tam sayılardır");

    }
}
