package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraysDenListOlusturma {
    public static void main(String[] args) {
        // verilen bir array i listeye cevirin

        String arr[]={"A","B","C"};

        // Arrays.asList(arr); //asList ile listeye cevirdik ama atama yapmazsam havada kalir
        // atama icin bu sekild eyapilir

        List<String> arraydenList=Arrays.asList(arr);

        // Array den listeye cevirmek cok tercih edilmez
        // Array den liste ceveridigmiz zaman yeni listin uzunlugunu degistemeyiz
        // dolayisi ile yeni list ile add remove clear gibi methodlari calistirmak istedigiimizde
        // Java Throws Exception olusturur asagidaki gibi

        // arraydenList.add("J");
        System.out.println("22 inci satirda list" + arraydenList);

        arr[1]="F"; // burada array e atama yaptik liste degil

        System.out.println("25 inci satirda array :"+ Arrays.toString(arr));
        System.out.println("26. satirda list :" + arraydenList);

        arraydenList.set(0,"y"); // burada sadece list degisti
        System.out.println("28 inci satirda array :"+ Arrays.toString(arr));
        System.out.println("29. satirda list :" + arraydenList);

        // hem array de hem listi degistirdigi icin yonetmek zor


    }
}
