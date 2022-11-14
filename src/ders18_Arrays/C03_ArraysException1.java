package ders18_Arrays;

import java.util.Arrays;

public class C03_ArraysException1 {
    public static void main(String[] args) {

        /*
            Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
            olusturun. Eski array’i yeni haliyle kaydedin.
         */

        int [] array = {1,2,3,4};

        for (int i = 0; i< array.length; i++){
            array[i] = array[i]+2;
        }

        System.out.print(Arrays.toString(array)); // [3,4,5,6]

        array = arttir(array);
        System.out.print(Arrays.toString(array)); // [5,6,7,8]
    }

    public static int[] arttir(int [] array){
        for (int i = 0; i< array.length; i++){
            array[i] = array[i]+2;
        }
        return array;
    }
}
