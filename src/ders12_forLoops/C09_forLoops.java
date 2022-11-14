package ders12_forLoops;

public class C09_forLoops {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin
        // ve String’i tersten yazdirin.

        String str = "Taha Yasin";

        int uzunluk = str.length();

        for (int i =uzunluk-1; i>=0; i--) {
            //System.out.print(i);
            //System.out.print(str.charAt(i));
            System.out.print(str.substring(i,i+1));
        }
    }
}
