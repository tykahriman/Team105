package ders32_inheritanceConstructorCall;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("Parametresiz toyota constructor");
    }

    BToyota(String pt) {
        System.out.println("Parametreli toyota constructors");
    }
}
