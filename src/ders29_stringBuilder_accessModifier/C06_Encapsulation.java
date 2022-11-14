package ders29_stringBuilder_accessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
        Buyuk projelerde datayı gorme(read) ve degistirme(read)
        degistirme yetkilerini birbirinden bagimsiz duznlemek istenebilir.

        Access modifier ile class uyelerine baska class'lardan erisim sinirlandirilabilir
        ANCAK
        ulasilabilen dataya hem okuma hem yazma yapilabilirken
        ulasilamayan ne okunur ne degistirilabilir

        -Eger okuma ve yazma yetkisini birlikte vermek söz konusu ise
        access modifier kullanılır

        -Eger okuma yazma yetkileri birbirinden ayrilacakasa
        o zaman access modifier kullanilamaz
        Encapsulation(getter ve setter metodları) kullanilmalidir

     */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(18);
        sayilar.add(5);

        sayilar.get(0); // get okumaya izin var sadece
        sayilar.set(1,1805); // set varsa MUTLAKA deger atamalisin
        System.out.println(sayilar);

    }

}
