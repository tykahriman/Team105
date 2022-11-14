package ders03_datacastingWrapper;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi = 20;

        /*
        genis data turunden dar data turune atama
        atama yapmak istersek java sorumlulugu almamizi ister

        bunu yapabilmek icin icin cast edecegimiz degerin onune ()
        icinde cast etmek istedigimiz data turunu yazarız.

        ancak bu durumda data kayıpları (double'dan int'e gecerken virgul sonrası silinir)
        veya baskalasım olabilir (int'i byte'a cevirirsek tekrar basa doner)
         */
        short sh = (short)sayi;

        System.out.println(sh); //20

        double dbl = 23.5;

        int say = (int) dbl;
        System.out.println(say);  //23

        say = 15;

        byte by = (byte)say;
        System.out.println(by);

        say= 130;
        by= (byte)say;
        System.out.println(by);
        float fl = (float)say;
        System.out.println(fl);




    }
}
