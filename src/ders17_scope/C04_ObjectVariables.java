package ders17_scope;

import java.util.Objects;

public class C04_ObjectVariables {

    public static void main(String[] args) {

        System.out.println(C03_ObjectVariables.firmaIsmi);

        System.out.println(C03_ObjectVariables.isciSayisi);

        C03_ObjectVariables.isciSayisi++;
        C03_ObjectVariables.isciSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.isciSayisi);
    }  // KOD TAKİBİ MAİN METODDAN BASLAR SONUNA GELİNDİGİNDE HERSEY BİTER.
       // TUM DEGİSİMLER RESETLENİR İLK HALİNE DONER.

    public static void method1()
    {
        C03_ObjectVariables.isciSayisi++;
    }
}
