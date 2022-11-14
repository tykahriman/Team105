package ders04_matematikselIslemler_IncrementDecrement;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a = 10;

        // a variable'nin degerini yazdirip sonra a'nin degerini bir arttirin

        System.out.println("a'nin degeri : " + a);  // 10
        a++;

        // a artik 11

        int b = 10;
        //b variable'nin degerini 1 arttirip sonra yazdirin

        b++;  // 11
        System.out.println("b'nin degeri : " + b); // 11
        int c = 10;

        // c variable'nin degerini yazdirip sonra c'nin degerini bir arttirin

        System.out.println("c : " + c++); // 10

        int d = 10;
        // d variable'nin degerini 1 arttirip sonra yazdir

        System.out.println("d : " + ++d); // 11

        // c++ post increment denir, once islem sonra arttırma yapar
        // ++d pre increment denir, once arttirir sonra yazdirir

        //islemin bir satir altina gecildiginde ikisi de 1 artmistir


    }
}
