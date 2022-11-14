package ders28_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        method(4,5,6,7,8);
    }

    public static void method(int a, int b,int c, int... sayilar){

    }

    // public static void method(int... sayilar, int a)
    // method'da parametre olarak varargs varsa son parametrede olması zorunludur
    // 2 varargs parametre olarak kullanılamaz

}
