package day30_Encapsulation;

public class C01_Encapsulation {

    public static void main(String[] args) {

        AEncapsuleClass pers1 = new AEncapsuleClass();
        // pers1.sirketIsmi  private old. icin ulasilamaz
        //pers1.personelMaasi  private old. icin ulasilamaz

        pers1.personelAdresi = "Çankırı";
        pers1.personelIsmi="Taha Yasin";

        System.out.println(pers1.getSirketIsmi());

        pers1.setPersonelMaasi(8500);


    }
}
