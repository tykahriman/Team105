package day30_Encapsulation;

public class EChild extends DParent {

     /*
        Java'daki inheritance'in insanlardan en byuk farkı:
        -olusturulan class'lardan tum ozelliklerini inherit emek istediginiz class'i PARENT EDINIRSINIZ

        Bir class baska bir class'i inherit etmek isterse bunu extends keyword ile deklare eder.
     */

    public static void main(String[] args) {

        EChild child1 = new EChild();

        child1.isim="Ahsen";
        child1.yas = 12;
        child1.isEnough = false;
        DParent parent = new DParent();
        System.out.println(parent.isim);
        System.out.println(child1.isim);

    }

}
