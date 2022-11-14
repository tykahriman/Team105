package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {
        //Verilen 2 katli bir arrayde
        //herbir içi arraydeki elementleri toplayip
        // tek arrayde bu toplamları ata

        int[][] arr= {{5,6,7},{2,3},{9},{5,4,8}};

        int [] toplam = new int[arr.length];

        for (int i = 0; i<arr.length; i++){
            int innerToplam = 0;
            for (int j = 0; j<arr[i].length; j++){
                innerToplam +=arr[i][j];
            }
            toplam[i] = innerToplam;
        }
        System.out.println(Arrays.toString(toplam));
    }
}
