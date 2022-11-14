package ders10_StringManipulation;

public class C09_Soru {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile java cok superdir cok";

        String ara = "cok";

        if (!str.contains(ara))  // veya ilkIndex == (-1)
        {
            System.out.println("Cumle metni icermiyor");
        } else {
            int ilkIndex = str.indexOf(ara);
            int sonIndex = str.lastIndexOf(ara);

            if (sonIndex == ilkIndex){
                System.out.println("Cumle metni sadece 1 kere iceriyor");
            } else
                System.out.println("Cumle metni 1' den fazla iceriyor");
            
        }
    }
}
