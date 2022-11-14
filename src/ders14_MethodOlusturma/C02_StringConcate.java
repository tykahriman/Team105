package ders14_MethodOlusturma;

public class C02_StringConcate {
    public static void main(String[] args) {

        // Verilen 2 stingi parametre kabul edip bu 2 stringi aralarında bir bosluk
        // olan tek bir string olarak main metoda donduren metod

        String birinci = "Birlesmis";
        String ikinci = "kelimeler";
        System.out.println(birlestir(birinci,ikinci));

        String str = "Taha Yasin";

       /* int uzunluk = str.length();

        for (int i =uzunluk-1; i>=0; i--) {
            //System.out.print(i);
            //System.out.print(str.charAt(i));
            System.out.print(str.substring(i,i+1));
        */
    }
    public static String birlestir(String bir, String iki){
        return bir +" "+ iki;
    }
}
