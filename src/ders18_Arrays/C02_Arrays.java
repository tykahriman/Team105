package ders18_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr = {"Ali","Veli","Yasin"};

        // Bu arrayin tüm elementlerini aralarinda bir bosluk ile yazdir

        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        // arra'i array olarak yazdir
        System.out.println("");

        System.out.println(arr); // array bir obje/non-primitive data türü oldugundan refaransı yazdirilir
        // arrayi array olarak yazdiröak isterseniz Arrays clasından yardım al

        System.out.println(Arrays.toString(arr)); //[Ali, Veli, Yasin]




    }
}
