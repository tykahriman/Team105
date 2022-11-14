package ders03_datacastingWrapper;

public class C05_WrapperClass {

    public static void main(String[] args) {

        int sayi = 10;
        String str = "Java cok guzel";

        /*
        primitive data turleri sadece deger barindirirlar,hazır mtodları
        yoktur.

        java'ya yapılan talepler sonucunda java primitive data türleri ile bazı hazır
        metodların kullanılması için Wrapper class'lar olusturmaktadır

        Wrapper class'lar primitive data turlarindeki degerleri alırlar
        ancak metodları da vardır
         */
        System.out.println(Character.isLetter('5')); //false
        System.out.println(Character.isDigit('7')); //true

        String str1 = "123";
        String str2 = "12";

        //str1 ve str2 degerleri matematiksel toplayın

        System.out.println(str1 + str2); //12312

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); //135

        //  Integer.parseInt(str) icine yazılan str rakamlardan olusuyorse str'i int'e cevirir
        // fakat rakam dısında hata verir (ornek bosluk olması)


    }
}
