package ders12_forLoops;

public class C11_forLoops {
    public static void main(String[] args) {

        // Asagidaki sekilleri yazdirin

        //*          * * * * * * * *        * * * * * * * *
        //* *        * * * * * * * *        * * * * * *
        //* * *      * * * * * * * *        * * * *
        //* * * *    * * * * * * * *        * *

        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------- \n");

        for (int x = 1; x <= 4; x++){
            for (int y = 1; y<=8; y++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("----------------- \n");

        for (int a = 1; a <= 4; a++){
            for (int b = 10; b>2*a; b--){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
