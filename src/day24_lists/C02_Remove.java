package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");

        System.out.println(isimler);
        // isimler.remove("oguzhan"); // burada 4 oplstion cikiyor remove da
        // remove(object) secilince sonuc ne olarak veri yor bakali oda boolean veriyor yani true false
        // o boolean sonucu ekranda goorunmesi icn asagidaki gibi yapildi

        // remove ( istenenobject) methodu istene elementi kaldirip
        //bize true false doner
        // eger remove isleminin yapildgini kontrol etmek istiyorsak
        //method u boolean bir variable a atayabiliriz


       boolean sonuc= isimler.remove("Oguzhan");

       // sonucu kullaniciya yazdirmak isterseniz if else ile yazdirirsniz
       if( sonuc==true){
           System.out.println("istediginiz isim silindi");
       }else {
           System.out.println("istedigniz isim listede olmadigindan silinemedi");
       }
        System.out.println(isimler);

       // ikinci remove option
        // remove(index) yadigimizda sildim silmedim ihtimali kalmaz
        // bize remive edilen elementi doner
        // bunu hemen yazdiralilm
        System.out.println(isimler.remove(1)); // yusufu siler ve delil olrak yusuf ismini bize dondurur
        // yazdirsakda yazdirmasakda  liste degisti ve 1. indext teki elelment silindi
        System.out.println(isimler);


    }
}
