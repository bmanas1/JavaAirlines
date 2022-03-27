package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<Integer>();

        sayilar.add(5); //[5]
        sayilar.add(3);//[5,3]
        sayilar.add(0,7); //[7,5,3]
        sayilar.add(2,7); //[7, 5, 7, 3]

        sayilar.remove(3);//index olrak 3 teki elementi siler
        //sayilar.remove(5); // IndexOutOfBoundsException

        /*
        sayilardan olusan bir listede objeyi vererek elelment silme method calismaz
        sayi degeri girdigimizde java otomatik olraka sayiyi index kabul eder

         */

       // int sayi =5;
        // sayilar.remove(sayi); // IndexOutOfBoundsException // bu primitive idi

        Integer sayi =5; // Integer wrapper class i kullaninca sayi obje oldugundan bu methdo calisir
        sayilar.remove(sayi);
        System.out.println(sayilar); //[7, 7] // bunu kabul etti  // bu ise obje oldugu icin kabul edildi




    }
}
