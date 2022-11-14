package ders20_multiDimensionalArrays;

public class C05_MDA_SayilarinCarpimi {
    public static void main(String[] args) {
        //Soru 4 Verilen 2 katli arrayde bulunan
        // sayilarin carpimini donduren method

        int[][] arr= {{5,7},{2,3},{1,9}};
        System.out.println(elementlerinCarpimi(arr));

    }
    public static int elementlerinCarpimi(int[][] arr){
        int carpim =1;
        for (int i=0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                carpim *=arr[i][j];
            }
        }
        return carpim;
    }
}
