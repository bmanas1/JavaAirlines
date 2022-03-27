package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";
        // bu cumlede bosluk disindaki karakter sayisini bulunuz

        System.out.println("Space haric karekter sayisi: " + str.replace(" ","").length());
        // atama yapilmadigi surece orijinal metin String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur
        // spaceharic karakter sayisini bulmak icin tum space lerden bir defaligina kurtulmali

        System.out.println("original str karakter sayisi:" + str.length());

        //str da kalici degisiklik yapin
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz yazin

        str=str.replace("Bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("kalici degisiklikten sonra: " + str);

        // atama yok ise kalici degisiklik yok




    }
}
