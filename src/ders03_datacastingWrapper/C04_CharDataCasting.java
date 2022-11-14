package ders03_datacastingWrapper;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); // 97 + 98 = 195
        // char karakter matematiksel işleme alınırsa ascii degerini alır
        // kulanıcıdan bir char karakter alın
        // o karakterden sonra gelen 3 karakteri yazdirin
        //ornek input : a , output : bcd

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter girin  :");

        char girilen  = scan.next().charAt(0);

        System.out.println("" + (char)(girilen+1) + (char)(girilen+2) + (char)(girilen+3));


    }
}
