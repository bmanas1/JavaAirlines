package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker, Oguzhan]


        isimler.set(1,"Seckin"); // yusuf gitti yerine seckin geldi
        System.out.println(isimler); //[Aykut, Seckin, Ilker, Oguzhan]

        //daha once den listede var olanlari da arsivde tutmak istersek
        List<String> logList = new ArrayList<>();

        logList.add(isimler.set(2,"Cosmos"));// burada bir satirla iki is yapildi once cosmos olarak degistirdi
        // sonra da logList olarak ilkeri ekledi
        System.out.println(isimler);// [Aykut, Seckin, Cosmos, Oguzhan]
        System.out.println(logList);// [Ilker]



    }
}
