package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_ArraysException4 {
    public static void main(String[] args) {
        /*
            Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
            donduren bir method olusturun.
         */

        int [] array = arrayOlustur();
        System.out.print(Arrays.toString(array));

    }

    public static int[] arrayOlustur(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Array Boyutu : ");
        int boyut = scan.nextInt();
        int [] array = new int[boyut];

        for (int i = 0; i<boyut; i++){
            System.out.println(i + ". index degeri : ");
            int deger = scan.nextInt();
            array[i] = deger;
        }
        return array;
    }
}
