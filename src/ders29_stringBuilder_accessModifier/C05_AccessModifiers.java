package ders29_stringBuilder_accessModifier;

public class C05_AccessModifiers {
    public static void main(String[] args) {

        C04_AccessModifiers obj = new C04_AccessModifiers();
        System.out.println(obj.isim);

        obj.isim = "Yasin";
        System.out.println(obj.isim); // Yasin

        C04_AccessModifiers obj2 = new C04_AccessModifiers();
        System.out.println(obj2.isim); // Taha Yasin

        // obj.sayi = 18; private variable'a baska class'dan erisilemez


    }
}
