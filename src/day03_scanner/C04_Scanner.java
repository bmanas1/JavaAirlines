package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // scanner kullanmak icin 3 adimmtakip edilir
        // 1. adim kendimize bir scanner olusturuyoruz
        Scanner scan = new Scanner(System.in);
        // esitligin saginda yeni bir scanner olusturulur
        // ve olusturulan bu scannner scan variable na assign edilir
        // scan varaible in ismini istediginiz ismi verebilirmisiniz
        // System.in bir parametredir

        // 2. adim : kullanicidan istedimizi girmesi icin aciklayici bir bilgi yazdirin
        System.out.println("lutfen isminizi giriniz");
        //3.adim kullanicinin girdigi degeri uygun bir variable olusturup kaydedin
        //String kullaniciIsmi= scan.next(); // sadece ilk kelimeyi alir ilk space e kadar olani alir
        String kullaniciIsmi= scan.nextLine(); // satir sonuna kadar girilen tum degerleri alir

        System.out.println("kullanicinin girdigi isim: " + kullaniciIsmi);







    }
}
