package day14_stringManipulation;

import java.util.Locale;

public class C02_Tersten_yazdirma {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String input="Mavi";

        // String tersStr= input.substring(input.length()-1); // deyince sadece en sondaki harfi verir
        // loop gormedigimiz icin yukaridakini bugun yapmiyoruz

        //String tersStr= input.substring(3) +
        //               input.substring(2,3) +
         //               input.substring(1,2)+
        //                input.substring(0,1);

       // System.out.println(tersStr); //ivaM

       String tersStr= input.substring(3).toUpperCase() +
               input.substring(2,3).toLowerCase() +
               input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();

       System.out.println(tersStr); //ivaM



    }
}
