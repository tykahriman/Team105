package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka); // Binek aracların markasi vardir
        System.out.println(suv1.model); // Binek araclarin modeli vardir
        System.out.println(suv1.motor); // Araclarin motoru vardir
        System.out.println(suv1.plaka);
        System.out.println(suv1.yakit);
        System.out.println(suv1.yil); // 1900
        suv1.teker();
        suv1.hiz("benzin");


        CSuv suv2 =new CSuv();
        suv2.marka ="Dacia";
        suv2.motor = "Sandero Stepway";
        suv2.motor = "1.5";
        suv2.plaka = "18 AK 18";
        suv2.yakit = "Dizel";
        suv2.yil = 2014;
        suv2.hiz("dizel");
        suv2.teker();


    }

    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin"))
            System.out.println("Benzinli SUV modeller max. 300 km/h hiz yapar");
        else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV modeller max. 260 km/h hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit araclar max. 220 km/h hiz yapar");
        }else
            System.out.println("Yakit belli degil max. hiz bilinemez");
    }


}
