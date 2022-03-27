package day11_stringManuplation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        // kullanicidan ismini alip basharfini ve son harfini buyuk harler ile yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iminizi  giriniz");
        String isim= scan.nextLine();


        System.out.println("ilk Harf :" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son Harf :" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());//0
        String str2=null;
        System.out.println(str2); // bur da null yazar
       // System.out.println(str2.length());//hata verir
    }
}
