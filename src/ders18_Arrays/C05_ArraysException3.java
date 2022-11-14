package ders18_Arrays;

import java.util.Scanner;

public class C05_ArraysException3 {
    public static void main(String[] args) {

        /*
            - Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
              kullanildigini yazdiran bir method olusturun.
         */

        int [] array = {5,4,7,2,5,3,5,7};

        Scanner scan = new Scanner(System.in);
        System.out.println("Aranan deger : ");
        int aranan = scan.nextInt();

        tekrar(aranan,array);


    }
    public static void tekrar(int eleman, int [] arr){
        int adet = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == eleman){
                adet++;
            }
        }
        if (adet == 0)
            System.out.println(eleman + " Arrayde Yok");
        else
            System.out.println(eleman + ", " + adet + " adet var");
    }
}
