package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {
        // kullanicidan isim soy isim alip
        // butun harfleri * yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ism vesoyisim giriniz");
        String isimSoyIsim= scan.nextLine();
        // sadece yazdirmak istiyorum
        System.out.println(isimSoyIsim.replaceAll("\\S","*"));
    }



}
