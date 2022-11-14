package ders04_matematikselIslemler_IncrementDecrement;

public class C08_Pre_Post_Increment {
    public static void main(String[] args) {

        int x = 3;

        int y = 2 *  ++x; // y = 8 x = 4

        int z = 5 + y--; // z = 13 y = 7

        System.out.println(x+y+z); // 4 + 7 + 13 = 24
    }
}
