package ders26_passByValue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

        // verilen bir array'in elementlerini 5 artirip
        // sonra yazdiran bir method olusturun

        int[] arr={3,4,5};
        elementleriArttir(arr);
        elementleriArttir(arr);
        elementleriArttir(arr);

        System.out.println("Method call sonrasi main method icinde arr : " + Arrays.toString(arr));

    }

    public static void elementleriArttir(int [] brr){

        for (int i = 0; i < brr.length ; i++) {

            brr[i] = brr[i] + 5;
        }
        System.out.println(Arrays.toString(brr));
    }
}
