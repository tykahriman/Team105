package ders07_Switch;

import java.util.Scanner;

public class C02_SwitchCase {

    public static void main(String[] args) {

        /*
       J: Java
       D: Development
       K: Kit
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Harf Girin : ");
        char harf = scan.next().charAt(0);

        switch (harf) {
            case 'J': case 'j':
                System.out.println("Java");
                break;
            case 'D': case 'd':
                    System.out.println("Development");
                break;
            case 'K': case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("Gecersiz");
        }
    }
}
