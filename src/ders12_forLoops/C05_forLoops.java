package ders12_forLoops;

public class C05_forLoops {
    public static void main(String[] args) {

        // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        // hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Orn : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        byte sayi = 6;
        int faktoriyel = 1;

        if (sayi<20)
        {
            System.out.print(sayi + "!"+ " = " );

            for (int i =sayi; i>0; i--){
                faktoriyel = i * faktoriyel;
                if(i>1)
                    System.out.print(i + " * ");
                else
                    System.out.print(i);
            }
            System.out.println(" = " + faktoriyel);
        }
        else
            System.out.println("Sayi 20 den kucuk olmali");




    }
}
