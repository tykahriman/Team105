package ders08_StringManipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equalsIgnoreCase("Ali")); //true

        /*
        equalsIgnoreCase  ayni metnin buyuk kucuk harf kullanarak
        olusturulan farkli yazilankari esit olarak kabul eder.

        yani equalsIgnoreCase icin ali, ALI, Ali,  aLı, aLI birbirine esittir.
         */

    }
}
