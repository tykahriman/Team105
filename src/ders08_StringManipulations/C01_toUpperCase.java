package ders08_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Mutluluktur";

        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.toUpperCase());

        str = "ince mehmet";

        str.toUpperCase();
        System.out.println(str);  //INCE MEHMET

        str = str.toLowerCase();
        System.out.println(str);  //ince mehmet

        System.out.println(str.toLowerCase(Locale.CHINESE));

        System.out.println(str.toLowerCase(Locale.FRENCH));

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));







    }
}
