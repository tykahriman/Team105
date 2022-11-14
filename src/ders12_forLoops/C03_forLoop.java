package ders12_forLoops;

public class C03_forLoop {

    public static void main(String[] args) {

        // Kullanicidan baslangic
        // ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi
        // sonlandirin

        int baslangic = 2;
        int bitis = 5;
        int toplam = 0;

        if (baslangic > bitis ) {
            System.out.println("Hatali Giris..");
        }
        else {
            for (int i=baslangic; i<=bitis; i++) {
                toplam += i;
            }
            System.out.println(toplam);
        }



    }
}
