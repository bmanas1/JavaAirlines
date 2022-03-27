package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // ternary ile yapilan tum islemler if else ile yapilabilir
        //if else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        // thernary icerisinde komplex kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler  olabilir

        // kullanicidan bir  tamsayi alip tekmi cift mi bir kod yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen positif bir sayi giriniz");
        int sayi= scan.nextInt();
       // if else ile yapilisi
        if (sayi%2==0) {
            System.out.println("sayi cift");

        } else {
            System.out.println("sayi tek");
        }
        // ternary ile  tek satirda hallediliyor
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");
    }
}
