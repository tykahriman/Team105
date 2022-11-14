package ders10_StringManipulation;

public class C05_Soru {

    public static void main(String[] args) {

        /*
            Mail kontrolu yapan bir program hazirlayin
            1- mail @ icermiyorsa "gecersiz email"
            2- @ iceriyor ama @gmail.com icermiyorsa "gmail adresi giriniz" yazsin
            3- gmail.com ile bitmiyorsa yazım hatasi seklinde sonuc yazdirn

         */

        String mail = "tyk1805@gmail.com";

        if(!mail.contains("@"))
        {
            System.out.println("Gecersiz email");
        } else if (!mail.contains("@gmail.com")) {

            System.out.println("gmail adresi giriniz");            
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Yazim Hatasi");
        }
        else
            System.out.println("Mail basari ile kaydedildi");

    }
}
