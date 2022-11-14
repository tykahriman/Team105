package ders10_StringManipulation;

public class C03_StartsWith {

    public static void main(String[] args) {

        String str = "Dersi dikkatli dinle";

        System.out.println(str.startsWith("dersi")); // str dersi ile mi basliyor. false

        System.out.println(str.startsWith("D")); // true

        System.out.println(str.startsWith("")); //true

        System.out.println(str.startsWith("Dersi dikkatli dinle")); //true

        System.out.println(str.startsWith("dikkatli", 6)); // 6.index ve sonrası dikkatli ile mi basliyor. true

        System.out.println(str.startsWith("Dersi", 0)); // 0.index ve sonrası Dersi ile mi basliyor

        System.out.println(str.startsWith("dinle", 10)); // 10.index sonrasi dinle ,le mi basliyor false



    }
}
