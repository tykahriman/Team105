package ders07_Switch;

public class C03_SwitchCase {
    public static void main(String[] args) {

        // kullanıcıdan ay numaraına göre mevsim yaz

        int ay = 2;

        switch (ay){
            case 1: case 2: case 3:
                System.out.println("Kıs");
                break;
            case 4: case 5: case 6:
                System.out.println("Ilkbahar");
                break;
            case 7: case 8: case 9:
                System.out.println("Yaz");
                break;
            case 10: case 11: case 12:
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz Giris");

        }
    }
}
