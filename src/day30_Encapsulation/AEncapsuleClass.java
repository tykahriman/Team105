package day30_Encapsulation;

public class AEncapsuleClass {

    private String sirketIsmi = "Yildizlar SSS Holding";
    // hastane ismi görülebilsin ama degistirilemesin

    private int personelMaasi;
    // maaslar giris yapilsin ama
    // personel maaslari goremesin

    String personelIsmi;
    String personelAdresi;
    // bu instance variable'lara herkes ulasabilsin
    // public yapmak akla gelen ilk cozum olacaktir


    public void setPersonelMaasi(int personelMaasi) {
        this.personelMaasi = personelMaasi;
    }

    public String getSirketIsmi() {
        return sirketIsmi;
    }
}



