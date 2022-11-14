package ders06_Ternary_Switch;

public class C02_Ternary {
    public static void main(String[] args) {

        int kenar1 = 12,kenar2=12, kenar3=12;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar Ucgen" : "Eskenar Degil");

        //kullanicidan 2 sayi al buyuk olmayani yazdir

        int sayi1 = 42, sayi2=24;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1);

        int a = 10;

        System.out.println(a>0 ? "sayi pozitif" : "Sayi negatif");

        System.out.println(a>20 ? a*a : a++);

        System.out.println(a<100 || a<0 ? 3*a+1 : 2+a/5);

        int x =10, y=15;

        int z = a>10 ? y++ : --x;

        System.out.println( x + ", " + y + ", " + z);

    }
}
