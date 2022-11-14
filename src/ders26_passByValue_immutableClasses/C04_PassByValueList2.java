package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {


    public static void main(String[] args) {

        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        // sonra sayilar listesine deger olarak yeni list'i atayin
        // ve sayilar list'ini yazdirin

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListeDegerAta(sayilar);

        System.out.println("Method call sonrası main methodda sayilar list : " + sayilar);

        String str = "Taha";
        System.out.println(str);
        str = "Yasin";
        System.out.println(str);

    }

    public static void yeniListeDegerAta(List<Integer>sayilar2){
        // Bir method olusturalim
        // method'da yeni bir liste olusturun
        List<Integer>yeniList = new ArrayList<>();

        for (int i = 0; i < sayilar2.size(); i++) {
            yeniList.add(sayilar2.get(i) + 5);
        }
        // listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
        sayilar2 = yeniList; // adres referans olarak gönderiliyor.

        System.out.println("Method'da sayilar l,stesini son hali : " + sayilar2);
    }



}
