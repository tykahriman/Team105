package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {

        //Multi dimensional string bir arraydeki
        // en uzun stringi bulan kod

        String [][] arr = {{"Taha","Yasin"},{"Elif","Yusuf"},{"Ahsen Su","Serife"}};
        String enUzunKelime = arr[0][0];

        for (int i=0; i< arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                if (enUzunKelime.length() < arr[i][j].length()){
                    enUzunKelime = arr[i][j];
                }
            }
        }
        System.out.println("En Uzun Kelime : " + enUzunKelime);

    }
}
