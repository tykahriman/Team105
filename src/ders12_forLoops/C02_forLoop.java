package ders12_forLoops;

public class C02_forLoop {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin.

        int sayi = 18;

        for (int i = 1; i<=sayi; i++){
            if (i % 7 == 0)
                System.out.print( i + " ");
        }


    }
}
