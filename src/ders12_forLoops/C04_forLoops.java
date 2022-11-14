package ders12_forLoops;

public class C04_forLoops {

    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        int baslangic = 2;
        int bitis = 5;
        int toplam = 0;

        if (baslangic < bitis){
            for (int i = baslangic; i<=bitis; i++)
            {
                toplam +=i;
            }
            System.out.println(toplam);
        } else {
            for (int i = baslangic; i>=bitis; i--) {
                toplam +=i;
            }
            System.out.println(toplam);
        }
    }
}
