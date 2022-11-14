package ders28_varargs_stringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candir");

        System.out.println(sb.capacity()); // 16+11
        System.out.println(sb.length()); // 11

        System.out.println(sb.reverse());
        sb.reverse();

        sb.replace(0,4,"Taha Yasin Kahriman  ");
        System.out.println(sb); // Taha Yasin Kahriman candir

        System.out.println(sb.capacity()); //27*2+2

        sb.insert(20," 0 Tester"); // Taha Yasin Kahriman 0 Tester  candir
        System.out.println(sb);

        String str = "Java cok guzel";
        sb.insert(20,str,9,14); // 20. indexten 9-14 arasını ekle
        System.out.println(sb);

        System.out.println(sb.indexOf("a")); // 1
        System.out.println(sb.indexOf("n",10)); //10.indexten itibaren n ara


    }
}
