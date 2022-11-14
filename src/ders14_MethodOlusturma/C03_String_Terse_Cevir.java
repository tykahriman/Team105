package ders14_MethodOlusturma;

public class C03_String_Terse_Cevir {
    public static void main(String[] args) {

        // Stringi terse ceviren metod

        String metin = "metini cevir";
        System.out.println(ters(metin));

    }
    public static String ters(String gelen){
        String ters="";
        for (int i = gelen.length()-1; i>=0; i--){
             ters += gelen.substring(i,i+1);
        }
        return ters;
    }
}
