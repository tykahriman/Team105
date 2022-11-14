package ders20_multiDimensionalArrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli arrayde
        // her bir arrayin son elementlerinin toplamini yazdiran
        //method olusturun

        int[][] arr= {{5,6},{2,3},{1,8,9}};
        sonElementleriTopla(arr);

    }

    public static void sonElementleriTopla(int[][] arr){
        int toplam = 0;
        for (int i = 0; i<arr.length; i++){
            toplam += arr[i][arr[i].length-1];
        }
        System.out.println("Toplam : " + toplam);
    }
}
