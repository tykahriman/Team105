package ders28_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(7);
        // 7 karakter alabilecek bir SB oluturur

        System.out.println(sb.capacity()); // 7
        System.out.println(sb.length()); // 0

        sb.append("java");

        System.out.println(sb);

        sb.append(" guzeldır.");  // java guzeldir.
        System.out.println(sb.capacity()); // 7*2+2 = 16
        System.out.println(sb.length());  // 14

        sb.append(" ona ne suphe");
        System.out.println(sb);  // java guzeldir.ona ne suphe
        System.out.println(sb.capacity()); // 16*2+2=34
        System.out.println(sb.length()); //27

        //kapasite ve lenght esitlersek
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
