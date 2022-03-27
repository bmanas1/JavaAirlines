package day10_switch_StringMaipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        // herahngi bir karaktesi almak istedigimizde
        // o harfin index ini kullanarak
        // str.charAt(istenilen index)yazilabilir

        String str="java cok Guzel";
        // J yi yazdiralim
        System.out.println(str.charAt(0));

        // g yi yadiralim
        System.out.println(str.charAt(9));

        // va yazdir
        System.out.println(""+str.charAt(2)+str.charAt(3));

        // cOK yazdiralim
        // once buyuk harf gibi leri kullanmali sonr charAt
        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5)+
                ""+str.toUpperCase().charAt(6)+ str.toUpperCase().charAt(7));

        // son harf yazdir dersen
        // string de 14 harf var son harfin index i 14-1
        System.out.println(str.charAt(14-1));// uzunluk-1

        // uzunlugu index olarak girersek
        // java calistiktan sonra hata verir
        //System.out.println(str.charAt(14)); error


    }

}
