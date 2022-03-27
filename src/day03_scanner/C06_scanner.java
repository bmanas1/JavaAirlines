package day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        // soru 6 Kulanicidan isim ve soyismini alio aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        // isim - soyisim: Mehmet Bulutluoz


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Isminizi yaziniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen  soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("isim - soyiisim : " + isim + " " + soyisim);
        // tirnak isareti artilar arasindaki
        // bosluk eklemek icindir

    }
}
