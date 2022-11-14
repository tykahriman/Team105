package ders10_StringManipulation;

public class C07_Soru {

    public static void main(String[] args) {

        /* kullanicidan 1 cumle ve 1 metin alin
           cumlede metnin durumuna gore
           1- cumle metni icermiyor
           2- cumle metni 1 kere iceriyor
           3- cumle metni 1 den fazla iceriyor

         */

        String str = "Ahmet hoca ile java cok superdir cok";

        String ara = "hoca";

        if (!str.contains(ara))
        {
            System.out.println("Cumle metni icermiyor");
        } else {
            int ilkIndex = str.indexOf(ara);
            int ikinciIndex = str.indexOf(ara,ilkIndex+1);

            if (ikinciIndex == -1){
                System.out.println("Cumle metni sadece 1 kere iceriyor");
            } else
                System.out.println("Cumle metni 1' den fala iceriyor");

        }

    }
}
