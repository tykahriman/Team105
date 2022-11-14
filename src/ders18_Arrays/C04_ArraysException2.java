package ders18_Arrays;

public class C04_ArraysException2 {
    public static void main(String[] args) {

        /*
            Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
            method yaziniz.
         */

        int [] array = {1,-2,3,10};

        int toplam = topla(array);
        System.out.println("Toplam : " + toplam);



    }

    public static int topla(int [] arr){
        int total = 0;

        for (int i =0; i<arr.length; i++){
            if (arr[i]>0)
                total += arr[i];
        }
        return total;
    }
}
