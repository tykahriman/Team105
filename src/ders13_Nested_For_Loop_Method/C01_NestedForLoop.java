package ders13_Nested_For_Loop_Method;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki sayilar icin carpim tablosu olusturalim

        for (int i = 1; i<=4; i++){
            for (int j=1; j<=4; j++){
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }
    }
}
