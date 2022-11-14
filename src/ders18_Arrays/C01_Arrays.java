package ders18_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] array = {12,05,18,06};
        // arayin bir elementine ulasmak ve update etmek

        System.out.println(array[2]); // 18

        array[0] = 2000;
        System.out.println(array[0]); // 2000

        System.out.println(array.length); // 4

        // son element
        System.out.println(array[array.length-1]);

        // array'in tüm elementlerini yazdir
        for (int i = 0; i< array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        // array'in uzunlugu sonradan degismez
        // eger arrayde olmayan indexe atama yapmak
        // istersen ArrayIndexOutOfBoundsException hatasi verir
        // bu hata CTE Compile Time Error degildir
        // Run Time Error'dir.

        // array[4] = 34;

    }
}
