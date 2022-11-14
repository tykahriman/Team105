package ders26_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        elementleri5Arttir(sayilar);
        elementleri5Arttir(sayilar);
        elementleri5Arttir(sayilar);


        System.out.println("Method call sonrası main method list" + sayilar);


    }

    public static void elementleri5Arttir(List<Integer>sayilar){

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i)+5);
        }
        System.out.println(sayilar);
    }
}
