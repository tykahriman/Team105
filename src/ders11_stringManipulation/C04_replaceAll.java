package ders11_stringManipulation;

public class C04_replaceAll {

    public static void main(String[] args) {

        // kullanıcının girdigi metinde
        // harf dısında kalan tum karakterleri temizleyen kod yazin
        //NOT : space silinmemeli..

        String input = "Ja3+va cok   1*guzel";

        input = input.replaceAll("\\d", ""); // Ja+va cok *guzel
        input = input.replace(" ","5");
        input = input.replaceAll("\\W","");
        input = input.replace("5"," ");
        input = input.replaceAll("\\s+"," ");
        System.out.println(input);

        System.out.println(input);



    }
}
