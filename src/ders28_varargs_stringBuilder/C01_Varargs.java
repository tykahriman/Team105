package ders28_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        topla(5,6); // 11
        topla(2,4,6,8); // 20
        topla();                // 0
        topla(4,5,6,7,1,34,56,63); // 176

        /*
            Bir method'da parametre sayisini sinirlandirmak
            istemessek standart variable yerine varargs kullanılır

         */
    }

    public static void topla(int... sayilar){
        int toplamSonuc = 0;

        for (int each: sayilar){
            toplamSonuc +=each;
        }
        System.out.println("Girilen Sayilarin Toplami : " + toplamSonuc);
    }
}
